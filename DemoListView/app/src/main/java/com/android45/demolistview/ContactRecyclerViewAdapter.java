package com.android45.demolistview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactRecyclerViewAdapter extends RecyclerView.Adapter<ContactRecyclerViewAdapter.Viewhoder> {
    List<ContactDemo> contactDemoList;
    IOnClickContactRv iOnClickContactRv;

    public void setiOnClickContactRv(IOnClickContactRv iOnClickContactRv) {
        this.iOnClickContactRv = iOnClickContactRv;
    }

    public ContactRecyclerViewAdapter(List<ContactDemo> contactDemoList) {
        this.contactDemoList = contactDemoList;
    }


    @NonNull
    @Override
    public ContactRecyclerViewAdapter.Viewhoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.icon_recyclerview, parent, false);

        Viewhoder viewhoder = new Viewhoder(view);
        return viewhoder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactRecyclerViewAdapter.Viewhoder holder, int position) {
        ContactDemo contactDemo = contactDemoList.get(position);

        holder.tvName.setText(contactDemo.getName());
        holder.tvPhone.setText(String.valueOf(contactDemo.getPhoneNumber()));

        holder.tvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iOnClickContactRv.onClickName(contactDemo.getName());
            }
        });

        holder.tvPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iOnClickContactRv.onClickPhone(contactDemo);
            }
        });
    }

    @Override
    public int getItemCount() {
        return contactDemoList.size();
    }

    public class Viewhoder extends RecyclerView.ViewHolder {
        TextView tvName, tvPhone;

        public Viewhoder(@NonNull View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.tvNameRv);
            tvPhone = itemView.findViewById(R.id.tvPhoneRv);
        }
    }
}

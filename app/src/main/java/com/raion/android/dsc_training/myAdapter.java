package com.raion.android.dsc_training;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class myAdapter extends RecyclerView.Adapter<myAdapter.ViewHolder> {

    private List<List_Item> listItems;
    private Context context;

    public myAdapter(List<List_Item> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public myAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(myAdapter.ViewHolder holder, int position) {
        List_Item listItem = listItems.get(position);

        holder.tvHead.setText(listItem.getHead());
        holder.tvDesc.setText(listItem.getDesc());

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvHead, tvDesc;

        public ViewHolder(View itemView) {
            super(itemView);

            tvHead = (TextView) itemView.findViewById(R.id.tv_heading);
            tvDesc = (TextView) itemView.findViewById(R.id.tv_desc);

        }
    }
}

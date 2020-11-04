package com.example.things;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListItemAdapter extends RecyclerView.Adapter<ListItemAdapter.ItemHolder> {

    ArrayList<String> listContent;
    Context ctx;
    public ListItemAdapter(Context ctx, ArrayList<String> data)
    {
        this.ctx = ctx;
        this.listContent = data;
    }
    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater itemInflator = LayoutInflater.from(ctx);
        View itemView = itemInflator.inflate(R.layout.item_structure,parent,false);
        return new ItemHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, int position) {
        holder.content.setText(listContent.get(position));
    }

    @Override
    public int getItemCount() {
        return listContent.size();
    }

    public class ItemHolder extends RecyclerView.ViewHolder {
        TextView content;
        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            content = (TextView) itemView.findViewById(R.id.ir_body);
        }
    }
}

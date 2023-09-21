package com.example.dummy;

import android.content.ClipData;
import android.graphics.ColorSpace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private ArrayList<ModelClass> friendList;
    public ItemAdapter(ArrayList<ModelClass> friendList)
    {
        this.friendList = friendList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_list , parent , false);
                return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ModelClass friend = friendList.get(position);
        holder.textView.setText(friend.getName());
    }

    @Override
    public int getItemCount() {
        return friendList.size();
    }
}

package com.example.checklist.Holder;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.checklist.R;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    public final TextView textView;
    public CheckBox checkBox;

    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.list_text);
        checkBox = itemView.findViewById(R.id.checked_items);
    }
}
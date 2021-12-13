package com.example.checklist.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.checklist.Data.CheckListData;
import com.example.checklist.Holder.RecyclerViewHolder;
import com.example.checklist.R;

import java.util.List;

public class CheckListAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    private final List<String> listItems;

    public CheckListAdapter(List<String> listItems) {
        this.listItems = listItems;
    }

    @Override
    public int getItemViewType(final int position) {
        return R.layout.list_items;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        TextView textView = holder.textView;
        CheckBox checkBox = holder.checkBox;
        textView.setText(listItems.get(position));
        checkBox.setOnClickListener(view -> CheckListData.checkListIndices.add(position));
    }

    @Override
    public int getItemCount() {
        return listItems == null ? 0 : listItems.size();
    }
}
package com.example.checklist.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.checklist.Adapters.CheckListAdapter;
import com.example.checklist.Data.CheckListData;
import com.example.checklist.R;

public class CheckListFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.checklist_fragment, container);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerview_checklist);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(new CheckListAdapter(CheckListData.checkListItems));
        return view;
    }
}
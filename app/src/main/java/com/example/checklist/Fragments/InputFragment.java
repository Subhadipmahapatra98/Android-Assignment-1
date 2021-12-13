package com.example.checklist.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.example.checklist.Data.CheckListData;
import com.example.checklist.R;
import com.google.android.material.snackbar.Snackbar;

public class InputFragment extends Fragment {

    Button addBtn, deleteBtn;
    EditText etText;

    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.inputbox_fragment, container);

        addBtn = (Button) view.findViewById(R.id.add);
        deleteBtn = (Button) view.findViewById(R.id.delete);
        etText = (EditText) view.findViewById(R.id.text);

        deleteBtn.setOnClickListener(view12 -> {
            CheckListData.removeItems();
        });

        addBtn.setOnClickListener(view1 -> {
            String textToAdd = etText.getText().toString();
            if (textToAdd.isEmpty()) {
                Snackbar.make(view, "Please enter some text!", Snackbar.LENGTH_LONG)
                        .setAction("Ok", view2 -> {

                        })
                        .setActionTextColor(getResources().getColor(android.R.color.holo_red_light))
                        .show();
            } else {
                etText.getText().clear();
                CheckListData.addItem(textToAdd);
            }
        });
        return view;
    }
}
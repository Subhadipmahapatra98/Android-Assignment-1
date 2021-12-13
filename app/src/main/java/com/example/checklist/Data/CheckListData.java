package com.example.checklist.Data;

import java.util.ArrayList;
import java.util.List;

public class CheckListData {
    public static List<String> checkListItems = new ArrayList<>();
    public static List<Integer> checkListIndices = new ArrayList<>();

    public static void addItem(String text) {

        checkListItems.add(text);
    }

    public static void removeItems()
    {
        for (int i = 0; i < checkListIndices.size(); i++) {

            if (i == checkListIndices.get(i))
                checkListItems.remove((i - 1));
        }
    }
}

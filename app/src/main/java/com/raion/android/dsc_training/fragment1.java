package com.raion.android.dsc_training;

import android.app.LauncherActivity;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class fragment1 extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<List_Item> listItems;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_1, null);
        ((MainActivity) getActivity()).setActionBarTitle("Data 1");
        recyclerView = (RecyclerView) inflate.findViewById(R.id.recyclerView_1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        listItems = new ArrayList<>();
        for (int i = 0; i<10; i++){
            List_Item listItem = new List_Item(
                    "Title "+(i+1), "Dummy text : this is fragment 1"
            );

            listItems.add(listItem);
        }
        adapter = new myAdapter(listItems, getActivity());
        recyclerView.setAdapter(adapter);

        return inflate;
    }
}

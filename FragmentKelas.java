package com.billyproject.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

public class FragmentKelas extends Fragment {

    public FragmentKelas(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View frag_kelas = inflater.inflate(R.layout.activity_fragment_kelas, container, false);
        String[] menuItems={"06TPLP003", "06TPLP001", "06TPLP002",
                "06TPLP003", "06TPLP004", "06TPLP005"};

        ListView listView = (ListView) frag_kelas.findViewById(R.id.list);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                menuItems
        );

        listView.setAdapter(listViewAdapter);
        return frag_kelas;
    }
}
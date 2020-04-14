package com.billyproject.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FragmentNama extends Fragment {

    public FragmentNama(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View frag_nama = inflater.inflate(R.layout.activity_fragment_nama, container, false);

        String[] menuItems={"Billy", "Afri", "Lorenzia",
                "Budi", "Ujang", "Rudi"};

        ListView listView = (ListView) frag_nama.findViewById(R.id.list);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                menuItems
        );

        listView.setAdapter(listViewAdapter);

        return frag_nama;
    }
}
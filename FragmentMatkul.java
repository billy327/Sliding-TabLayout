package com.billyproject.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.zip.Inflater;

public class FragmentMatkul extends Fragment {

    public FragmentMatkul(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View frag_matkul = inflater.inflate(R.layout.activity_fragment_matkul, container, false);

        String[] menuItems={"Mobile Programming", "Pemrograman Web", "Teknik Kompilasi",
                "Rekayasa Perangkat Lunak", "Arsitektur", "Komputer Grafik"};

        ListView listView = (ListView) frag_matkul.findViewById(R.id.list);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                menuItems
        );

        listView.setAdapter(listViewAdapter);

        return frag_matkul;
    }


}

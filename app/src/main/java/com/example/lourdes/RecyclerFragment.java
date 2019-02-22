package com.example.lourdes;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lourdes.tablayoutviewpagecoordinator.R;

import java.util.ArrayList;

public class RecyclerFragment extends Fragment {

    Context c;
    ArrayList lenguajes;
    View v;
    RecyclerView recyclerView;


    public RecyclerFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        c = context;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lenguajes = new ArrayList();
        lenguajes.add(new Lenguaje("Java", "http://developandsys.es/aplicaciones/recursos/logos_lenguajes/java.png"));
        lenguajes.add(new Lenguaje("C#", "http://developandsys.es/aplicaciones/recursos/logos_lenguajes/csharp.png"));
        lenguajes.add(new Lenguaje("Python", "http://developandsys.es/aplicaciones/recursos/logos_lenguajes/py.png"));
        lenguajes.add(new Lenguaje("Powershell", "http://developandsys.es/aplicaciones/recursos/logos_lenguajes/ps.png"));
        lenguajes.add(new Lenguaje("Swift", "http://developandsys.es/aplicaciones/recursos/logos_lenguajes/swift.png"));
        lenguajes.add(new Lenguaje("Php", "http://developandsys.es/aplicaciones/recursos/logos_lenguajes/php.png"));
        lenguajes.add(new Lenguaje("Kotlin", "http://developandsys.es/aplicaciones/recursos/logos_lenguajes/kotlin.png"));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_list, container, false);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        recyclerView = v.findViewById(R.id.recycler);
        recyclerView.setAdapter(new RecyclerAdapter(lenguajes, c));
        recyclerView.setLayoutManager(new LinearLayoutManager(c, LinearLayoutManager.VERTICAL, false));

    }

}

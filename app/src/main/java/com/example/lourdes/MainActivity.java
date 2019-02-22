package com.example.lourdes;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.lourdes.tablayoutviewpagecoordinator.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton floatingActionButton;
    ViewPager pager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pager = findViewById(R.id.pager);
        tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(pager);

        ArrayList listaFragments = new ArrayList();
        listaFragments.add(new RecyclerFragment());

        pager.setAdapter(new AdapterViewPager(getSupportFragmentManager(),listaFragments));

    }
    }
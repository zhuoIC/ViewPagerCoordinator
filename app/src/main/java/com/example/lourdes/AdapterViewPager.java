package com.example.lourdes;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class AdapterViewPager extends FragmentPagerAdapter {

    private ArrayList listaFg;

    public AdapterViewPager(FragmentManager fm, ArrayList lista) {
        super(fm);
        listaFg = lista;
    }

    @Override
    public Fragment getItem(int position) {
        return (Fragment) listaFg.get(position);
    }

    @Override
    public int getCount() {
        return listaFg.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Ejemplo ViewPager";
    }
}


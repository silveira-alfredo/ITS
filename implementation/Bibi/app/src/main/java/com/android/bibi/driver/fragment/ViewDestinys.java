package com.android.bibi.driver.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.bibi.R;

/**
 * Created by jsalgado on 30/05/15.
 */
public class ViewDestinys extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.driver_view_destinys,container,false);
        return v;
    }
}
package com.example.assigment_minhngph25430.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.assigment_minhngph25430.R;

public class Fragment_GioiThieu extends Fragment {

    public static Fragment_GioiThieu newInstance() {
        Fragment_GioiThieu fragment = new Fragment_GioiThieu();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment__gioi_thieu, container, false);
    }
}
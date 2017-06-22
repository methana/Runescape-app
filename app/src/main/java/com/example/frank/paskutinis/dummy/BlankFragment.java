package com.example.frank.paskutinis.dummy;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



import com.example.frank.paskutinis.R;



public class BlankFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View view =inflater.inflate(R.layout.fragment_blank,container, false);
        return view;
    }


}

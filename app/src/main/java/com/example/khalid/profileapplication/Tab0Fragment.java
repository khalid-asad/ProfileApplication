package com.example.khalid.profileapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;

/**
 * Created by Khalid on 2018-03-22.
 */

public class Tab0Fragment extends Fragment {

    //private static imageViewGitHub;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        //imageViewGitHub = (ImageView) findViewById(R.id.imageViewGitHub);

        return view;
    }
}

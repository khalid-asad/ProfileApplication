package com.xeroy.profileapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.xeroy.profileapplication.R;


/**
 * Created by Khalid on 2018-03-22.
 */

public class Tab4Fragment extends Fragment {

    GridView gridview;

    public static String[] osNameList = {
            "Java",
            "Python",
            "C",
            "Embedded",
            "C++",
            "XML",
            "JavaScript",
            "IAM",
            "SQL",
            "Automation",
    };
    public static int[] osImages = {
            R.drawable.j,
            R.drawable.p,
            R.drawable.c,
            R.drawable.e,
            R.drawable.c,
            R.drawable.x,
            R.drawable.j,
            R.drawable.i,
            R.drawable.s,
            R.drawable.a,};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_skills, container, false);
        gridview = view.findViewById(R.id.customgrid);
        gridview.setAdapter(new GridViewAdapter(this.getContext(), osNameList, osImages));
        return view;
    }
}
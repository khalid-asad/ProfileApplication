package com.example.khalid.profileapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import java.util.ArrayList;

/**
 * Created by Khalid on 2018-03-22.
 */

public class Tab1Fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_experience, container, false);

        //THE EXPANDABLE
        ExpandableListView elv=(ExpandableListView) view.findViewById(R.id.expandableListView1);

        final ArrayList<Job> job=getData();

        //CREATE AND BIND TO ADAPTER
        CustomAdapter adapter=new CustomAdapter(this.getContext(), job);
        elv.setAdapter(adapter);

        return view;
    }

    private ArrayList<Job> getData()
    {

        Job j1=new Job("Rogers");
        j1.description.add("Wayne Rooney");
        j1.description.add("Van Persie");
        j1.description.add("Ander Herera");
        j1.description.add("Juan Mata");

        Job j2=new Job("N8 Identity");
        j2.description.add("Aaron Ramsey");
        j2.description.add("Mesut Ozil");
        j2.description.add("Jack Wilshere");
        j2.description.add("Alexis Sanchez");

        Job j3=new Job("Ford");
        j3.description.add("John Terry");
        j3.description.add("Eden Hazard");
        j3.description.add("Diego Costa");
        j3.description.add("Oscar");

        ArrayList<Job> allJobs=new ArrayList<Job>();
        allJobs.add(j1);
        allJobs.add(j2);
        allJobs.add(j3);

        return allJobs;
    }
}

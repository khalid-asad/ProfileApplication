package com.example.khalid.profileapplication;

import java.util.ArrayList;

/**
 * Created by Khalid on 2018-03-25.
 */

public class Job {

    // Job properties
    public String Name;
    public String Image;
    public ArrayList<String> description = new ArrayList<String>();

    public Job(String Name) {
        this.Name = Name;
    }

    @Override
    public String toString() {
        return Name;
    }
}

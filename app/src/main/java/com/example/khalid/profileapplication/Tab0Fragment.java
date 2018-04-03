package com.example.khalid.profileapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Khalid on 2018-03-22.
 */

public class Tab0Fragment extends Fragment {

    private ImageView imageViewGitHub, imageViewLinkedIn, imageViewWebsite, imageViewEmail, imageViewGooglePlay, imageViewChangelog, imageViewFeedback, imageViewStar, imageViewDonate, imageViewHelp;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        imageViewGitHub = view.findViewById(R.id.imageViewGitHub);
        imageViewLinkedIn = view.findViewById(R.id.imageViewLinkedIn);
        imageViewWebsite = view.findViewById(R.id.imageViewWebsite);
        imageViewEmail = view.findViewById(R.id.imageViewEmail);
        imageViewGooglePlay = view.findViewById(R.id.imageViewGooglePlay);
        imageViewChangelog = view.findViewById(R.id.imageViewChangelog);
        imageViewFeedback = view.findViewById(R.id.imageViewFeedback);
        imageViewStar = view.findViewById(R.id.imageViewStar);
        imageViewDonate = view.findViewById(R.id.imageViewDonate);
        imageViewHelp = view.findViewById(R.id.imageViewHelp);

        imageViewGitHub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(getActivity(), "GitHub Clicked", Toast.LENGTH_LONG).show();
            }
        });

        imageViewLinkedIn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(getActivity(), "LinkedIn Clicked", Toast.LENGTH_LONG).show();
            }
        });

        imageViewWebsite.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(getActivity(), "Website Clicked", Toast.LENGTH_LONG).show();
            }
        });

        imageViewEmail.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(getActivity(), "Email Clicked", Toast.LENGTH_LONG).show();
            }
        });

        imageViewGooglePlay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(getActivity(), "Google Play Clicked", Toast.LENGTH_LONG).show();
            }
        });

        imageViewChangelog.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(getActivity(), "Changelog Clicked", Toast.LENGTH_LONG).show();
            }
        });

        imageViewFeedback.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(getActivity(), "Feedback Clicked", Toast.LENGTH_LONG).show();
            }
        });

        imageViewStar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(getActivity(), "Star Clicked", Toast.LENGTH_LONG).show();
            }
        });

        imageViewDonate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(getActivity(), "Donate Clicked", Toast.LENGTH_LONG).show();
            }
        });

        imageViewHelp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(getActivity(), "Help Clicked", Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }
}

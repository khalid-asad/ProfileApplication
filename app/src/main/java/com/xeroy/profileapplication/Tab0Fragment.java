package com.xeroy.profileapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import com.xeroy.profileapplication.R;

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
                //Toast.makeText(getActivity(), "GitHub Clicked", Toast.LENGTH_LONG).show();
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.github.com/xeroyzenith"));
                startActivity(browserIntent);
            }
        });

        imageViewLinkedIn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                //Toast.makeText(getActivity(), "LinkedIn Clicked", Toast.LENGTH_LONG).show();
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/khalidasad"));
                startActivity(browserIntent);
            }
        });

        imageViewWebsite.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.khalidasad93.wixsite.com/khalidasad"));
                startActivity(browserIntent);
            }
        });

        imageViewEmail.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                //Toast.makeText(getActivity(), "Email Clicked", Toast.LENGTH_LONG).show();
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","khalidasad93@gmail.com", null));
                startActivity(emailIntent);
            }
        });

        imageViewGooglePlay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                //Toast.makeText(getActivity(), "Google Play Clicked", Toast.LENGTH_LONG).show()
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/dev?id=7067594522563633074"));
                startActivity(browserIntent);
            }
        });

        imageViewChangelog.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                //Toast.makeText(getActivity(), "Changelog Clicked", Toast.LENGTH_LONG).show();
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/xeroyzenith/ProfileApplication/commits/master"));
                startActivity(browserIntent);
            }
        });

        imageViewFeedback.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                //Toast.makeText(getActivity(), "Feedback Clicked", Toast.LENGTH_LONG).show();
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/khalidasad/detail/recommendation/write/"));
                startActivity(browserIntent);
            }
        });

        imageViewStar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                //Toast.makeText(getActivity(), "Star Clicked", Toast.LENGTH_LONG).show();
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/dev?id=7067594522563633074"));
                startActivity(browserIntent);
            }
        });

        imageViewDonate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                //Toast.makeText(getActivity(), "Donate Clicked", Toast.LENGTH_LONG).show();
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paypal.me/KhalidAsad"));
                startActivity(browserIntent);
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

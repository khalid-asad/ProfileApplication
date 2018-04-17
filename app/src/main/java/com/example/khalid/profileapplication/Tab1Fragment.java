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
        j1.description.add("Rotation 1: Production Support (June 2017 - October 2017)");
        j1.description.add("• Automated the strenuous verification and hourly updating of IT application statuses for 5 systems effectively during the critical days period saving 10,000 hours of overtime for 3 teams");
        j1.description.add("• Aptly reduced an IT application's daily health check operation time from 30 minutes to 2.5 through automation using Python-based SikuliX");
        j1.description.add("• Developed an automated provisioning tool for an IT application that improved efficiency by 98%");
        j1.description.add("• Intuitively designed a PowerShell script to retrieve employee fields via Employee IDs bypassing LDAP restrictions");
        j1.description.add("");
        j1.description.add("Rotation 2: Business Systems Analyst (October 2017 - February 2018)");
        j1.description.add("• Built a DDD, running PCR, use cases and SDS draft in a project that generated $0.5 million monthly");
        j1.description.add("• Automated Actuals vs. Forecasting costs for a massive mandatory project saving 8 hours a week");
        j1.description.add("");
        j1.description.add("Rotation 3: IT Security (February 2018 - March 2018)");
        j1.description.add("• Extensively researched Governance, Risk, and Compliance and participated in the first stage of Vendor Selection Process");
        j1.description.add("");
        j1.description.add("Rotation 4: Web Developer (March 2018 - June 2018)");
        j1.description.add("• Increased the performance by 10% of a handful of broadcast websites running on WordPress by performing upgrades, introducing new plugins, and optimizing PHP and CSS code");

        Job j2=new Job("N8 Identity");
        j2.description.add("• Tackled complex IAM scenarios by developing Logical Attribute Handlers (LAH) and Business Logic Task Handlers (BLTH) in Java");
        j2.description.add("• Implemented IIS websites attaching Identity and Access Management (IAM) solutions such as CA Single Sign-On");
        j2.description.add("• Analyzed and created XML, SOAP, HTML scripts as well as LDAP and SQL queries");
        j2.description.add("• Promptly resolved hundreds of Network and Security incidents, actively assisting Production Support daily");
        j2.description.add("• Created and maintained Incidents and Change Requests (CRQ) for all environments");
        j2.description.add("• Generated VM servers (Windows Server 2012) linking them via AD, SQL, DNS and DHCP to administer CA softwares");
        j2.description.add("• Enforced domain security to and from external companys by testing IP configuration and firewall connectivity");
        j2.description.add("");
        j2.description.add("Project: AD Harmonization (April 2017 - May 2017)");
        j2.description.add("• Flawlessly implemented and documented changes to CA Technology Suite files, data, and software to allow the ability to migrate accounts to and from two merged companies");
        j2.description.add("• Meticulously performed FUT and UAT for SIT, QA, and Production environment changes");
        j2.description.add("• Efficiently bulk loaded thousands of accounts while adding and maintaining access, authorization, and authentication to applications and websites");

        Job j3=new Job("Ford");
        j3.description.add("• Extensively tested internal websites by creating automation scripts and test cases in HP UFT (formerly HP QTP)");
        j3.description.add("• Identified, analyzed, documented, and resolved hundreds of defects saving millions of dollars");
        j3.description.add("• Counselled coworkers with automation help; providing them with viable solutions to their problems");
        j3.description.add("• Effectively trained an intern to test, develop and document MS Access Applications and Scripts");
        j3.description.add("• Augmented efficiency through daily scrums following the Agile Software Development method");
        j3.description.add("");
        j3.description.add("Relevant Project: Incentives Database");
        j3.description.add("• Developed a MS Access application for five managers that retrieved and manipulated incentive records from java-based web applications in a user-friendly GUI effectively reducing manager workload from days to minutes");
        j3.description.add("• Optimized VB/.NET functions and SQL statements to efficiently retrieve, store, and delete data");

        ArrayList<Job> allJobs=new ArrayList<Job>();
        allJobs.add(j1);
        allJobs.add(j2);
        allJobs.add(j3);

        return allJobs;
    }
}

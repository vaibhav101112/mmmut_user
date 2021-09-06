package com.vaibhavguptammmut.mmmut.ui.about;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.vaibhavguptammmut.mmmut.R;

import java.util.ArrayList;
import java.util.List;


public class AboutFragment extends Fragment {


    private ViewPager viewPager;
    private BranchAdapter adapter;
    private List<BranchModel> list;
    private ImageView map;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);
        list = new ArrayList<>();
        list.add(new BranchModel(R.drawable.ic_computer, "Computer Science", "This department was established in 1984 and with time it has earned the recognition as one of the top Computer Science & Engg. programs in the UP. The department offers B.Tech. in Computer Science & Engineering. The department has also started M.Tech. in Computer Science & Engineering and is the first in offering this PG program among UP Govt. aided Engineering Institutions."));
        list.add(new BranchModel(R.drawable.ic_information, "Information Technology", "The Department of Information Technology and Computer Application (ITCA) was inaugurated on 24th August 2018 by Hon’ble Chancellor of Uttar Pradesh Shri Ram Naik in the magnanimous presence of Hon’ble Vice-Chancellor of MMMUT Gorakhpur, Prof. S. N Singh. The department became functional from 25th August 2018 with two PG programs - MCA and M.Tech. It has also started one UG program- B.Tech. (IT) from session 2019-20."));
        list.add(new BranchModel(R.drawable.ic_electronics, "Electronics and Communication", "Electronics & Communication Engineering Department at MMMUT, Gorakhpur was established in the year 1973 with a vision to build proficient engineers capable of including values to professional excellence. The M.Tech was started in the year 2003 with the Digital Systems. Later on in the year 2012 M.Tech program in Communication Engineering was started. The Department of Electronics and Communication Engineering has incessantly maintained an excellent academic record."));
        list.add(new BranchModel(R.drawable.ic_electrical, "Electrical", "The department of electrical Engineering was established in 1962. This department has over the years established its reputation as an excellent center for importing high quality technical education to under graduates & consultancy to industries and government departments located in the eastern U.P."));
        list.add(new BranchModel(R.drawable.ic_mechacnical, "Mechanical", "Welcome to the Department of Mechanical Engineering at Madan Mohan Malaviya University of Technology Gorakhpur. We started our journey in the year of 1962. Over the years, we have grown our expertise and competence in the core of Mechanical Engineering Curriculum and Research. We are offering B.Tech. in Mechanical Engineering with 120 students, M.Tech. in Computer Integrated Manufacturing and Energy Technology & Management with 18 intakes and Ph.D students full time and Part time"));
        list.add(new BranchModel(R.drawable.ic_civil, "Civil", "The Civil Engineering Department established in 1962, in Madan Mohan Malaviya University of Technology, Gorakhpur, is one of the oldest departments of the University, working since its inception. The department has, over the years, established its status as a centre for imparting high quality technical education to undergraduate and post-graduate students and extending consultancy services to industries and various government departments located in the Eastern U. P. Besides undergraduate course of B. Tech. (Civil Engineering)."));
        list.add(new BranchModel(R.drawable.ic_chemicalscience, "Chemical", "On the behalf of Department of Chemical Engineering, Madan Mohan Malaviya University of Technology, Gorakhpur, Uttar Pradesh, I welcome to visitor. Department was established in year 2016 and approved by All India Council for Technical Education, New Delhi. Department of Chemical Engineering is started in the year 2016 with a total intake of 60 students and first batch graduate in year 2020. Department strives for the all-round development of students’ and nurtures them to cater the need of industry and society."));
        list.add(new BranchModel(R.drawable.ic_science, "Applied Science", "The Department of Applied Science was established on 22nd June, 1962. Which has been inaugurated by Shri Yogi Adiyanath Ji Maharaj, Hon’ble Chief Minister of Uttar Pradesh. Previously, it has been the constituent part of Department of Applied Sciences. The erstwhile Madan Mohan Malaviya Engineering College, Gorakhpur, which was started in 1962, by the then Government of Uttar Pradesh to foster technical education."));
        list.add(new BranchModel(R.drawable.ic_mba, "MBA", "Welcome to the Department of Humanities & Management Science, one of the nascent upcoming departments of Madan Mohan Malaviya University of Technology, Gorakhpur. With a pool of highly competent faculty members the department is striving ceaselessly to fostering excellence and to open novel vistas in the various domains and sub domains of Humanities and Management Science by making our outgoing talents industry ready."));
        adapter = new BranchAdapter(getContext(), list);
        viewPager = view.findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        ImageView imageView = view.findViewById(R.id.college_image);
        Glide.with(getContext()).load("https://firebasestorage.googleapis.com/v0/b/mmmut-82969.appspot.com/o/mmmutmain.jpg?alt=media&token=ec3830ca-ea1a-4146-ab7e-c4c9fc5fc6fe").into(imageView);
        map = view.findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMap();
            }
        });

        return view;
    }

    private void openMap() {
        Uri uri = Uri.parse("geo:0, 0?q=MMMUT Gorakhpur");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }
}
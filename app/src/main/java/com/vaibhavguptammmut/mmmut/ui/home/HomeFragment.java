package com.vaibhavguptammmut.mmmut.ui.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;



import com.smarteist.autoimageslider.SliderView;
import com.vaibhavguptammmut.mmmut.R;


public class HomeFragment extends Fragment {

  private SliderView sliderView;
  private String[] text;
  private SliderAdapter adapter;
  private int[] images;
  private ImageView map;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


           View view = inflater.inflate(R.layout.fragment_home, container, false);



        sliderView = view.findViewById(R.id.sliderView);
        images = new int[]{R.drawable.mmm_one,R.drawable.mmm_two,R.drawable.mmm_three,R.drawable.mmm_four,R.drawable.mmm_five};
        text = new String[]{"Administration","VC Office","Green Campus","Labs","Library"};

        adapter = new SliderAdapter(images,text);
        sliderView.setSliderAdapter(adapter);

        sliderView.setIndicatorAnimation(IndicatorAnimationType.DROP);
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.startAutoCycle();

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


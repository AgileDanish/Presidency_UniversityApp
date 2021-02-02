package com.example.presidencyuniversityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class MainActivity extends AppCompatActivity {
    //Initialize variable
    SliderView sliderView;
    int[] images = {R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five};
    SliderAdp sliderAdp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign variable an id
        sliderView=findViewById(R.id.slider_view);

        //Initialize adapter
        sliderAdp=new SliderAdp(images);
        //Set adapter
        sliderView.setSliderAdapter(sliderAdp);
        //Set indicator animation
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        //Set transformation animation
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        //Start auto cycle
        sliderView.startAutoCycle();
    }
}
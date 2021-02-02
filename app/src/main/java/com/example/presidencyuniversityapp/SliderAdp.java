package com.example.presidencyuniversityapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.smarteist.autoimageslider.SliderViewAdapter;

public class SliderAdp extends SliderViewAdapter<SliderAdp.Holder> {
  //Initialize variable for an array storing images
   int[] images;

   //Create a constructor
    public SliderAdp(int[] images){
        this.images=images;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent) {
        //Initialize the view
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_slider,parent,false);
        //Return view
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder viewHolder, int position) {
       //Set image on image_view
        viewHolder.imageView.setImageResource(images[position]);

    }

    @Override
    public int getCount() {
        //return image's length
        return images.length;
    }

    public class Holder extends SliderViewAdapter.ViewHolder {
      //Initialize variable
        ImageView imageView;
        public Holder(View itemView) {
            super(itemView);
            //Assign variable with an id
            imageView=itemView.findViewById(R.id.image_view);
        }
    }
}

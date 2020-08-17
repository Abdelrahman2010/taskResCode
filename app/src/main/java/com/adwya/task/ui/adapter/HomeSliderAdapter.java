package com.adwya.task.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.viewpager.widget.PagerAdapter;

import com.adwya.task.R;
import com.adwya.task.data.model.SliderResponce;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;



public class HomeSliderAdapter extends PagerAdapter {

    Context mContext;

    LayoutInflater mLayoutInflater;

    int[] mResources;
    ArrayList<SliderResponce.Data>Images;

    public HomeSliderAdapter(Context context, ArrayList<SliderResponce.Data> Images ) {
        mContext = context;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.Images = Images;
    }

    @Override
    public int getCount() {
        return Images.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View itemView = mLayoutInflater.inflate(R.layout.home_pager_item, container, false);

        ImageView imageView2 = (ImageView) itemView.findViewById(R.id.imageView);

        Glide.with(mContext).load(Images.get(position).getImage()).apply(new RequestOptions().placeholder(R.drawable.animate).error(R.drawable.animate)).into(imageView2);



        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }

    @Override
    public float getPageWidth(int position) {
        return 0.8f;
    }
}


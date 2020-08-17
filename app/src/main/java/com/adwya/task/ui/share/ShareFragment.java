package com.adwya.task.ui.share;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.adwya.task.R;
import com.adwya.task.constans.ViewModelProviderFactory;
import com.adwya.task.data.model.Country;
import com.adwya.task.data.model.MyCity;
import com.adwya.task.data.model.SliderResponce;
import com.adwya.task.databinding.FragmentGalleryBinding;
import com.adwya.task.databinding.FragmentSendBinding;
import com.adwya.task.databinding.FragmentShareBinding;
import com.adwya.task.ui.adapter.HomeSliderAdapter;
import com.adwya.task.ui.base.BaseFragment;
import com.adwya.task.ui.base.BaseNavigator;
import com.adwya.task.ui.gallery.GalleryViewModel;
import com.adwya.task.ui.send.SendViewModel;

import java.util.ArrayList;

import javax.inject.Inject;

public class ShareFragment  extends BaseFragment<FragmentShareBinding, ShareViewModel> implements SignUpNavigator {


    @Inject
    ViewModelProviderFactory factory;
    private ShareViewModel shareViewModel;
    private FragmentShareBinding mBinding;

    @Override
    public int getBindingVariable() {
        return com.adwya.task.BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_share;
    }

    @Override
    public ShareViewModel getViewModel() {
        shareViewModel = ViewModelProviders.of(this, factory).get(ShareViewModel.class);
        return shareViewModel;
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mBinding = getViewDataBinding();
        shareViewModel.setNavigator(this);


        mBinding.pager1.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            public void onPageScrollStateChanged(int state) {
            }

            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            public void onPageSelected(int position) {
//                int x = mViewPager.getCurrentItem();


                mBinding.pageIndicatorView.setSelection(position);

            }
        });

        ArrayList<SliderResponce.Data> sliders = new ArrayList<SliderResponce.Data>();

        SliderResponce.Data slider = new SliderResponce.Data();
        slider.setImage("https://sae-marketing.com/Chat/chat/free2.jpeg");

        SliderResponce.Data slider2 = new SliderResponce.Data();
        slider2.setImage("https://sae-marketing.com/Chat/chat/freeone.jpg");

        SliderResponce.Data slider3 = new SliderResponce.Data();
        slider3.setImage("https://sae-marketing.com/Chat/chat/freethree.jpg");

        sliders.add(slider);
        sliders.add(slider2);
        sliders.add(slider3);




        HomeSliderAdapter mCustomPagerAdapter = new HomeSliderAdapter(getContext(), sliders);
        mBinding.pager1.setAdapter(mCustomPagerAdapter);

    }

    @Override
    public void showAlertDialog(String message, String message_type) {

    }

    @Override
    public void getCountries(ArrayList<Country.Data> myCountry) {


    }

    @Override
    public void getMyCity(ArrayList<MyCity.Data> MyCity) {

    }
}
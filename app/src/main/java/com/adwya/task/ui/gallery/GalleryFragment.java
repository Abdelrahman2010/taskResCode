package com.adwya.task.ui.gallery;

import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.adwya.task.BR;
import com.adwya.task.MainActivityViewModel;
import com.adwya.task.R;
import com.adwya.task.constans.ViewModelProviderFactory;
import com.adwya.task.databinding.ActivityMainBinding;
import com.adwya.task.databinding.FragmentGalleryBinding;
import com.adwya.task.ui.base.BaseFragment;
import com.adwya.task.ui.base.BaseNavigator;

import javax.inject.Inject;

public class GalleryFragment extends BaseFragment<FragmentGalleryBinding,GalleryViewModel> implements BaseNavigator.ShowAlert {

    ProgressBar pb;
    public static TextView myText;

    @Inject
    ViewModelProviderFactory factory;
    private GalleryViewModel galleryViewModel;
    private FragmentGalleryBinding mBinding;

    @Override
    public int getBindingVariable() {
        return com.adwya.task.BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_gallery;
    }

    @Override
    public GalleryViewModel getViewModel() {
        galleryViewModel = ViewModelProviders.of(this, factory).get(GalleryViewModel.class);
        return galleryViewModel;
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mBinding = getViewDataBinding();
        galleryViewModel.setNavigator(this);




         pb = (ProgressBar) mBinding.progressBarToday;
        myText = (TextView) mBinding.myText;


        mBinding.ListenText.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                handler();
            }
        });





    }

    private void handler() {
        final Handler handler = new Handler();

        final int[] i = {0};

        final Runnable r = new Runnable() {
            public void run() {
                i[0]++;
                pb.setProgress(i[0]);
                handler.postDelayed(this, 1000);
                if(i[0]<11)
                myText.setText(Integer.toString(i[0]));

            }
        };

        handler.postDelayed(r, 1000);

    }

    @Override
    public void showAlertDialog(String message, String message_type) {

    }
}
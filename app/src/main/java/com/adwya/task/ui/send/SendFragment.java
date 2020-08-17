package com.adwya.task.ui.send;

import android.location.Location;
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

import com.adwya.task.R;
import com.adwya.task.constans.ViewModelProviderFactory;
import com.adwya.task.databinding.FragmentGalleryBinding;
import com.adwya.task.databinding.FragmentSendBinding;
import com.adwya.task.ui.base.BaseFragment;
import com.adwya.task.ui.base.BaseNavigator;
import com.adwya.task.ui.gallery.GalleryViewModel;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;

import javax.inject.Inject;

public class SendFragment extends BaseFragment<FragmentSendBinding, SendViewModel> implements BaseNavigator.ShowAlert {

    @Inject
    ViewModelProviderFactory factory;
    private SendViewModel sendViewModel;
    private FragmentSendBinding mBinding;

    private FusedLocationProviderClient fusedLocationClient;



    @Override
    public int getBindingVariable() {
        return com.adwya.task.BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_send;
    }

    @Override
    public SendViewModel getViewModel() {
        sendViewModel = ViewModelProviders.of(this, factory).get(SendViewModel.class);
        return sendViewModel;
    }


    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mBinding = getViewDataBinding();
        sendViewModel.setNavigator(this);


        fusedLocationClient = LocationServices.getFusedLocationProviderClient(getContext());

        fusedLocationClient.getLastLocation()
                .addOnSuccessListener(getActivity(), new OnSuccessListener<Location>() {
                    @Override
                    public void onSuccess(Location location) {
                        // Got last known location. In some rare situations this can be null.
                        if (location != null) {
                            // Logic to handle location object

                            mBinding.Latt.setText(Double.toString(location.getLatitude()));
                            mBinding.Longt.setText(Double.toString(location.getLongitude()));

                        }
                    }
                });


    }


        @Override
    public void showAlertDialog(String message, String message_type) {

    }
}
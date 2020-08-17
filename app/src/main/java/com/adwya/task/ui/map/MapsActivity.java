package com.adwya.task.ui.map;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.adwya.task.R;
import com.adwya.task.constans.ViewModelProviderFactory;
import com.adwya.task.data.model.Task;
import com.adwya.task.databinding.ActivityMapsBinding;
import com.adwya.task.databinding.ActivitySignUpBinding;
import com.adwya.task.ui.adapter.MapAdapter;
import com.adwya.task.ui.auth.signup.SignUpSignViewModel;
import com.adwya.task.ui.base.BaseActivity;
import com.adwya.task.ui.base.BaseNavigator;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class MapsActivity extends BaseActivity<ActivityMapsBinding, MapViewModel> implements OnMapReadyCallback, MapNavigation {

    private GoogleMap mMap;

    @Inject
    ViewModelProviderFactory factory;
    private MapViewModel mapViewModel;
    private ActivityMapsBinding mBinding;
    Marker marker;


    @Override
    public int getBindingVariable() {
        return 0;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_maps;
    }

    @Override
    public MapViewModel getViewModel() {
        mapViewModel = ViewModelProviders.of(this, factory).get(MapViewModel.class);
        return mapViewModel;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        mBinding = getViewDataBinding();
        mapViewModel.setNavigator(this);


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        mapViewModel.getCity();
        mBinding.loader.setVisibility(View.VISIBLE);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(34, 30);
        //mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }

    @Override
    public void showAlertDialog(String message, String message_type) {
        Toast.makeText(getApplicationContext(), message_type, Toast.LENGTH_LONG).show();

    }

    @Override
    public void getCitys(ArrayList<Task.feed.entry> citys) {

        mBinding.loader.setVisibility(View.GONE);

        MapAdapter vipsAdapter = new MapAdapter(getApplicationContext(), citys);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        mBinding.offerRes.setLayoutManager(layoutManager);
        //   mBinding.catRes.setLayoutManager(new GridLayoutManager(getContext(), 1));
        mBinding.offerRes.setAdapter(vipsAdapter);


        for (int i = 0; i < citys.size(); i++) {



            String split[] =citys.get(i).getContent().get$t().split(",");
            String split2[] = split[1].split(":");
            String title =split2[1];


            if(Geocoder.isPresent()){
                try {
                    String location = split2[1];
                    Geocoder gc = new Geocoder(this);
                    List<Address> addresses= gc.getFromLocationName(location, 5); // get the found Address Objects

                    List<LatLng> ll = new ArrayList<LatLng>(addresses.size()); // A list to save the coordinates if they are available
                    for(Address a : addresses){
                        if(a.hasLatitude() && a.hasLongitude()){
                            ll.add(new LatLng(a.getLatitude(), a.getLongitude()));


                            LatLng sydney = new LatLng(a.getLatitude(), a.getLongitude());

                            if(citys.get(i).getContent().get$t().contains("Negative")){

                                marker = mMap.addMarker(new MarkerOptions()
                                        .position(sydney)
                                        .title( title));

                            }else if(citys.get(i).getContent().get$t().contains("Positive")){


                                marker = mMap.addMarker(new MarkerOptions().
                                        icon(BitmapDescriptorFactory.defaultMarker(200))
                                        .position(sydney)
                                        .title( title));


                            }else{

                                marker = mMap.addMarker(new MarkerOptions().
                                        icon(BitmapDescriptorFactory.defaultMarker(80))
                                        .position(sydney)
                                        .title( title));


                            }



                        }
                    }
                } catch (IOException e) {
                    // handle the exception
                }
            }






            }








        }




    }







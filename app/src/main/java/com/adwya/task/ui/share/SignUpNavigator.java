package com.adwya.task.ui.share;

import com.adwya.task.data.model.Country;
import com.adwya.task.data.model.MyCity;
import com.adwya.task.ui.base.BaseNavigator;

import java.util.ArrayList;

public interface SignUpNavigator extends BaseNavigator.ShowAlert{

    void getCountries(ArrayList<Country.Data>myCountry);
    void getMyCity(ArrayList<MyCity.Data>MyCity);


}

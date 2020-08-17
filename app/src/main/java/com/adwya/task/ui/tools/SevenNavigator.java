package com.adwya.task.ui.tools;

import com.adwya.task.data.model.SevenDays;
import com.adwya.task.ui.base.BaseNavigator;

import java.util.ArrayList;

public interface SevenNavigator extends BaseNavigator.ShowAlert {

    void getSevenCat(ArrayList<SevenDays.Data> sevens);

}

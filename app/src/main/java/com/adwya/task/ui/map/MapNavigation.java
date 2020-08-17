package com.adwya.task.ui.map;

import com.adwya.task.data.model.Task;
import com.adwya.task.ui.base.BaseNavigator;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface MapNavigation extends BaseNavigator.ShowAlert {


    void getCitys(ArrayList<Task.feed.entry>citys);

}

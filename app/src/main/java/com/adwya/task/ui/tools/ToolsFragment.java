package com.adwya.task.ui.tools;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.adwya.task.R;
import com.adwya.task.constans.ViewModelProviderFactory;
import com.adwya.task.data.model.SevenDays;
import com.adwya.task.databinding.FragmentToolsBinding;
import com.adwya.task.ui.base.BaseFragment;
import com.adwya.task.ui.base.BaseNavigator;
import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Cartesian;
import com.anychart.charts.Pie;
import com.anychart.core.cartesian.series.Area;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class ToolsFragment extends BaseFragment<FragmentToolsBinding, ToolsViewModel> implements SevenNavigator  {


    @Inject
    ViewModelProviderFactory factory;
    private ToolsViewModel toolsViewModel;
    private FragmentToolsBinding mBinding;
    Cartesian pie;


    @Override
    public int getBindingVariable() {
        return com.adwya.task.BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_tools;
    }

    @Override
    public ToolsViewModel getViewModel() {
        toolsViewModel = ViewModelProviders.of(this, factory).get(ToolsViewModel.class);
        return toolsViewModel;
    }


    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mBinding = getViewDataBinding();
        toolsViewModel.setNavigator(this);

         pie = AnyChart.area();





    }

    @Override
    public void showAlertDialog(String message, String message_type) {

        Toast.makeText(getContext(),message_type,Toast.LENGTH_LONG).show();

    }

    @Override
    public void getSevenCat(ArrayList<SevenDays.Data> sevens) {

        Toast.makeText(getContext(),sevens.get(0).getDate(),Toast.LENGTH_LONG).show();


        List<DataEntry> data = new ArrayList<>();

        for(int i=0;i<sevens.size();i++){

            int numers =Integer.parseInt(sevens.get(i).getNumberofOrders());
            data.add(new ValueDataEntry(sevens.get(i).getDate(), numers));


        }


        pie.data(data);

        AnyChartView anyChartView = mBinding.anyChartView;
        anyChartView.setChart(pie);

    }
}
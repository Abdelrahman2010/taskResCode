
package com.adwya.task.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class SevenDays {


  public String getResult() {
    return Result;
  }

  public void setResult(String result) {
    Result = result;
  }

  @Expose
  @SerializedName("Result")
  private String Result;


  public ArrayList<Data> getmData() {
    return mData;
  }

  public void setmData(ArrayList<Data> mData) {
    this.mData = mData;
  }

  @Expose
  @SerializedName("info")
  private ArrayList<Data> mData;


  public static class Data {


    @Expose
    @SerializedName("id")
    private String id;

    @Expose
    @SerializedName("NumberofOrders")
    private String NumberofOrders;

    public String getId() {
      return id;
    }

    public void setId(String id) {
      this.id = id;
    }

    public String getNumberofOrders() {
      return NumberofOrders;
    }

    public void setNumberofOrders(String numberofOrders) {
      NumberofOrders = numberofOrders;
    }

    public String getDate() {
      return date;
    }

    public void setDate(String date) {
      this.date = date;
    }

    public String getOverAllResult() {
      return OverAllResult;
    }

    public void setOverAllResult(String overAllResult) {
      OverAllResult = overAllResult;
    }

    @Expose
    @SerializedName("date")
    private String date;

    @Expose
    @SerializedName("OverAllResult")
    private String OverAllResult;




  }

}

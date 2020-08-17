
package com.adwya.task.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class MyCity {


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


    public String getId() {
      return id;
    }

    public void setId(String id) {
      this.id = id;
    }

    public String getCityNameName() {
      return CityName;
    }

    public void setCityNameName(String CityName) {
      CityName = CityName;
    }

    public String getOverAllResult() {
      return OverAllResult;
    }

    public void setOverAllResult(String overAllResult) {
      OverAllResult = overAllResult;
    }

    @Expose
    @SerializedName("Id")
    private String id;

    @Expose
    @SerializedName("CityName")
    private String CityName;


    @Expose
    @SerializedName("OverAllResult")
    private String OverAllResult;


  }

}

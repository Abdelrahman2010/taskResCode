
package com.adwya.task.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class SliderResponce {


  @Expose
  @SerializedName("message")
  private String mMessage;

  @Expose
  @SerializedName("status_code")
  private String mStatusCode;
  @Expose
  @SerializedName("success")
  private Boolean mSuccess;


  public ArrayList<Data> getmData() {
    return mData;
  }

  public void setmData(ArrayList<Data> mData) {
    this.mData = mData;
  }

  @Expose
  @SerializedName("data")
  private ArrayList<Data> mData;

  public void setmMessage(String mMessage) {
    this.mMessage = mMessage;
  }

  public void setmStatusCode(String mStatusCode) {
    this.mStatusCode = mStatusCode;
  }

  public void setmSuccess(Boolean mSuccess) {
    this.mSuccess = mSuccess;
  }

  public String getMessage() {
    return mMessage;
  }

  public void setMessage(String message) {
    mMessage = message;
  }

  public String getStatusCode() {
    return mStatusCode;
  }

  public void setStatusCode(String statusCode) {
    mStatusCode = statusCode;
  }

  public Boolean getSuccess() {
    return mSuccess;
  }

  public void setSuccess(Boolean success) {
    mSuccess = success;
  }

  public static class Data {


    public String getImage() {
      return image;
    }

    public void setImage(String image) {
      this.image = image;
    }

    @Expose
    @SerializedName("image")
    private String image;



  }

}

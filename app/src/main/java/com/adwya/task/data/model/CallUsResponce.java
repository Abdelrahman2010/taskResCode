package com.adwya.task.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CallUsResponce {

    @Expose
    @SerializedName("data")
    private Data mData;
    @Expose
    @SerializedName("message")
    private String mMessage;
    @Expose
    @SerializedName("status_code")
    private String mStatusCode;
    @Expose
    @SerializedName("success")
    private Boolean mSuccess;

    public Data getData() {
        return mData;
    }

    public void setData(Data data) {
        mData = data;
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


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Expose
        @SerializedName("name")
        private String name;






    }
}

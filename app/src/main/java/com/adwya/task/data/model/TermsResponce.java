package com.adwya.task.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TermsResponce {

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


        public String getPrivacy_policy() {
            return privacy_policy;
        }

        public void setPrivacy_policy(String privacy_policy) {
            this.privacy_policy = privacy_policy;
        }

        @Expose
        @SerializedName("privacy_policy")
        private String privacy_policy;






    }
}

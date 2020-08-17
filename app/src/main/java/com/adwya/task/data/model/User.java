package com.adwya.task.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class User {

    public ArrayList<Data> getmData() {
        return mData;
    }

    public void setmData(ArrayList<Data> mData) {
        this.mData = mData;
    }

    @Expose
    @SerializedName("data")
    private ArrayList<Data> mData;
    @Expose
    @SerializedName("message")
    private String mMessage;
    @Expose
    @SerializedName("status_code")
    private String mStatusCode;
    @Expose
    @SerializedName("success")
    private Boolean mSuccess;



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

        @Expose
        @SerializedName("UserID")
        private String UserID;
        @Expose
        @SerializedName("Email")
        private String Email;
        @Expose
        @SerializedName("Phone")
        private String Phone;
        @Expose
        @SerializedName("Password")
        private String Password;
        @Expose
        @SerializedName("Rate")
        private String Rate;
        @Expose
        @SerializedName("Photo")
        private String Photo;
        @Expose
        @SerializedName("JobsNum")
        private String JobsNum;
        @Expose
        @SerializedName("Describtion")
        private String Describtion;

        @Expose
        @SerializedName("UserToken")
        private String UserToken;

        public String getUserID() {
            return UserID;
        }

        public void setUserID(String userID) {
            UserID = userID;
        }

        public String getEmail() {
            return Email;
        }

        public void setEmail(String email) {
            Email = email;
        }

        public String getPhone() {
            return Phone;
        }

        public void setPhone(String phone) {
            Phone = phone;
        }

        public String getPassword() {
            return Password;
        }

        public void setPassword(String password) {
            Password = password;
        }

        public String getRate() {
            return Rate;
        }

        public void setRate(String rate) {
            Rate = rate;
        }

        public String getPhoto() {
            return Photo;
        }

        public void setPhoto(String photo) {
            Photo = photo;
        }

        public String getJobsNum() {
            return JobsNum;
        }

        public void setJobsNum(String jobsNum) {
            JobsNum = jobsNum;
        }

        public String getDescribtion() {
            return Describtion;
        }

        public void setDescribtion(String describtion) {
            Describtion = describtion;
        }

        public String getUserToken() {
            return UserToken;
        }

        public void setUserToken(String userToken) {
            UserToken = userToken;
        }

        public String getUserName() {
            return UserName;
        }

        public void setUserName(String userName) {
            UserName = userName;
        }

        public String getFinishedJobSuc() {
            return FinishedJobSuc;
        }

        public void setFinishedJobSuc(String finishedJobSuc) {
            FinishedJobSuc = finishedJobSuc;
        }

        public String getRateForCalculate() {
            return RateForCalculate;
        }

        public void setRateForCalculate(String rateForCalculate) {
            RateForCalculate = rateForCalculate;
        }

        @Expose
        @SerializedName("UserName")
        private String UserName;


        @Expose
        @SerializedName("FinishedJobSuc")
        private String FinishedJobSuc;

        @Expose
        @SerializedName("RateForCalculate")
        private String RateForCalculate;










    }
}

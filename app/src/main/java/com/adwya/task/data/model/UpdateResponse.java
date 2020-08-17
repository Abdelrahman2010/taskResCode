package com.adwya.task.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UpdateResponse {

    @Expose
    @SerializedName("data")
    private User.Data mData;
    @Expose
    @SerializedName("message")
    private String mMessage;
    @Expose
    @SerializedName("status_code")
    private String mStatusCode;
    @Expose
    @SerializedName("success")
    private Boolean mSuccess;

    public User.Data getData() {
        return mData;
    }

    public void setData(User.Data data) {
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

        @Expose
        @SerializedName("first_name")
        private String first_name;
        @Expose
        @SerializedName("id")
        private String id;
        @Expose
        @SerializedName("last_name")
        private String last_name;
        @Expose
        @SerializedName("email")
        private String email;
        @Expose
        @SerializedName("phone_number")
        private String phone_number;
        @Expose
        @SerializedName("image")
        private String image;
        @Expose
        @SerializedName("token")
        private String mToken;
        @Expose
        @SerializedName("valid")
        private String valid;

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone_number() {
            return phone_number;
        }

        public void setPhone_number(String phone_number) {
            this.phone_number = phone_number;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getmToken() {
            return mToken;
        }

        public void setmToken(String mToken) {
            this.mToken = mToken;
        }

        public String getValid() {
            return valid;
        }

        public void setValid(String valid) {
            this.valid = valid;
        }

    }
}

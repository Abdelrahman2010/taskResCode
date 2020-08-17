package com.adwya.task.data.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class CategoryResponse implements Parcelable {

    protected CategoryResponse(Parcel in) {
        mMessage = in.readString();
        mStatusCode = in.readString();
        byte tmpMSuccess = in.readByte();
        mSuccess = tmpMSuccess == 0 ? null : tmpMSuccess == 1;
    }

    public static final Creator<CategoryResponse> CREATOR = new Creator<CategoryResponse>() {
        @Override
        public CategoryResponse createFromParcel(Parcel in) {
            return new CategoryResponse(in);
        }

        @Override
        public CategoryResponse[] newArray(int size) {
            return new CategoryResponse[size];
        }
    };

    public ArrayList<Data> getmData() {
        return mData;
    }

    public void setmData(ArrayList<Data> mData) {
        this.mData = mData;
    }

    public String getmMessage() {
        return mMessage;
    }

    public void setmMessage(String mMessage) {
        this.mMessage = mMessage;
    }

    public String getmStatusCode() {
        return mStatusCode;
    }

    public void setmStatusCode(String mStatusCode) {
        this.mStatusCode = mStatusCode;
    }

    public Boolean getmSuccess() {
        return mSuccess;
    }

    public void setmSuccess(Boolean mSuccess) {
        this.mSuccess = mSuccess;
    }

    @Expose
    @SerializedName("data")
    private ArrayList<Data>mData;
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mMessage);
        parcel.writeString(mStatusCode);
        parcel.writeByte((byte) (mSuccess == null ? 0 : mSuccess ? 1 : 2));
    }

    public static class Data implements Parcelable{

        protected Data(Parcel in) {
            id = in.readString();
            image = in.readString();
            name = in.readString();
        }

        public static final Creator<Data> CREATOR = new Creator<Data>() {
            @Override
            public Data createFromParcel(Parcel in) {
                return new Data(in);
            }

            @Override
            public Data[] newArray(int size) {
                return new Data[size];
            }
        };

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Expose
        @SerializedName("id")
        private String id;
        @Expose
        @SerializedName("image")
        private String image;
        @Expose
        @SerializedName("name")
        private String name;


        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(id);
            parcel.writeString(image);
            parcel.writeString(name);
        }
    }
}

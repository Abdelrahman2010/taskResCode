package com.adwya.task.data.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Addresses implements Parcelable {

    @Expose
    @SerializedName("message")
    private String mMessage;

    @Expose
    @SerializedName("status_code")
    private String mStatusCode;
    @Expose
    @SerializedName("success")
    private Boolean mSuccess;


    protected Addresses(Parcel in) {
        mMessage = in.readString();
        mStatusCode = in.readString();
        byte tmpMSuccess = in.readByte();
        mSuccess = tmpMSuccess == 0 ? null : tmpMSuccess == 1;
    }

    public static final Creator<Addresses> CREATOR = new Creator<Addresses>() {
        @Override
        public Addresses createFromParcel(Parcel in) {
            return new Addresses(in);
        }

        @Override
        public Addresses[] newArray(int size) {
            return new Addresses[size];
        }
    };

    public ArrayList<Data> getmData() {
        return mData;
    }

    public void setmData(ArrayList<Data> mData) {
        this.mData = mData;
    }

    @Expose
    @SerializedName("data")
    private ArrayList<Data> mData;

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


        @Expose
        @SerializedName("name")
        private String name;

        @Expose
        @SerializedName("address")
        private String address;

        protected Data(Parcel in) {
            name = in.readString();
            address = in.readString();
            latitude = in.readString();
            longitude = in.readString();
            id = in.readString();
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

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        @Expose
        @SerializedName("latitude")
        private String latitude;

        @Expose
        @SerializedName("longitude")
        private String longitude;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        @Expose
        @SerializedName("id")
        private String id;


        public Data.City getCity() {
            return City;
        }

        public void setCity(Data.City city) {
            City = city;
        }

        @Expose
        @SerializedName("city")
        private City City;

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name);
            parcel.writeString(address);
            parcel.writeString(latitude);
            parcel.writeString(longitude);
            parcel.writeString(id);
        }

        public static class City implements Parcelable{

            protected City(Parcel in) {
                id = in.readString();
                name = in.readString();
            }

            public static final Creator<City> CREATOR = new Creator<City>() {
                @Override
                public City createFromParcel(Parcel in) {
                    return new City(in);
                }

                @Override
                public City[] newArray(int size) {
                    return new City[size];
                }
            };

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            @Expose
            @SerializedName("id")
            private String id;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

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
                parcel.writeString(name);
            }
        }


    }
}

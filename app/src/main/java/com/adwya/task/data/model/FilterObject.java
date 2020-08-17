package com.adwya.task.data.model;

import android.os.Parcel;
import android.os.Parcelable;

public class FilterObject implements Parcelable {

    String CategoryID;
    String SizeName;

    protected FilterObject(Parcel in) {
        CategoryID = in.readString();
        SizeName = in.readString();
        PriceSort = in.readString();
        Offer = in.readString();
    }

    public static final Creator<FilterObject> CREATOR = new Creator<FilterObject>() {
        @Override
        public FilterObject createFromParcel(Parcel in) {
            return new FilterObject(in);
        }

        @Override
        public FilterObject[] newArray(int size) {
            return new FilterObject[size];
        }
    };

    public String getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(String categoryID) {
        CategoryID = categoryID;
    }

    public String getSizeName() {
        return SizeName;
    }

    public void setSizeName(String sizeName) {
        SizeName = sizeName;
    }

    public String getPriceSort() {
        return PriceSort;
    }

    public void setPriceSort(String priceSort) {
        PriceSort = priceSort;
    }

    public String getOffer() {
        return Offer;
    }

    public void setOffer(String offer) {
        Offer = offer;
    }

    String PriceSort;
    String Offer;


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(CategoryID);
        parcel.writeString(SizeName);
        parcel.writeString(PriceSort);
        parcel.writeString(Offer);
    }
}

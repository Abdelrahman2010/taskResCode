package com.adwya.task.data.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Product implements Parcelable {


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


    protected Product(Parcel in) {
        mMessage = in.readString();
        mStatusCode = in.readString();
        byte tmpMSuccess = in.readByte();
        mSuccess = tmpMSuccess == 0 ? null : tmpMSuccess == 1;
    }

    public static final Creator<Product> CREATOR = new Creator<Product>() {
        @Override
        public Product createFromParcel(Parcel in) {
            return new Product(in);
        }

        @Override
        public Product[] newArray(int size) {
            return new Product[size];
        }
    };

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

    public ArrayList<Data> getmData() {
        return mData;
    }

    public void setmData(ArrayList<Data> mData) {
        this.mData = mData;
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

    public static class Data implements Parcelable, Comparable {


        @Expose
        @SerializedName("id")
        private String id;

        @Expose
        @SerializedName("price")
        private String price;
        @Expose
        @SerializedName("quantity")
        private String quantity;

        protected Data(Parcel in) {
            id = in.readString();
            price = in.readString();
            quantity = in.readString();
            video = in.readString();
            name = in.readString();
            description = in.readString();
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

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getQuantity() {
            return quantity;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        public String getVideo() {
            return video;
        }

        public void setVideo(String video) {
            this.video = video;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Category getCategory() {
            return category;
        }

        public void setCategory(Category category) {
            this.category = category;
        }

        @Expose
        @SerializedName("video")
        private String video;
        @Expose
        @SerializedName("name")
        private String name;
        @Expose
        @SerializedName("description")
        private String description;

        @Expose
        @SerializedName("category")
        private Category category;


        public ArrayList<Image> getImage() {
            return image;
        }

        public void setImage(ArrayList<Image> image) {
            this.image = image;
        }

        @Expose
        @SerializedName("images")
        private ArrayList<Image> image;

        public ArrayList<Sizes> getSizes() {
            return sizes;
        }

        public void setSizes(ArrayList<Sizes> sizes) {
            this.sizes = sizes;
        }

        @Expose
        @SerializedName("sizes")
        private ArrayList<Sizes> sizes;

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(id);
            parcel.writeString(price);
            parcel.writeString(quantity);
            parcel.writeString(video);
            parcel.writeString(name);
            parcel.writeString(description);
        }


        public boolean isAssending() {
            return assending;
        }

        public void setAssending(boolean assending) {
            this.assending = assending;
        }

        boolean assending;


        @Override
        public int compareTo(Object product) {

            Product.Data Firstproduct = (Data) product;
            int compareage = Integer.parseInt(Firstproduct.getPrice());

            if (isAssending()) {
                return Integer.parseInt(this.price) - compareage;
            }else{
                return compareage - Integer.parseInt(this.price);

            }
        }


        public static class Category implements Parcelable {

            protected Category(Parcel in) {
                id = in.readString();
                name = in.readString();
            }

            public static final Creator<Category> CREATOR = new Creator<Category>() {
                @Override
                public Category createFromParcel(Parcel in) {
                    return new Category(in);
                }

                @Override
                public Category[] newArray(int size) {
                    return new Category[size];
                }
            };

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
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

        public static class Image implements Parcelable {

            protected Image(Parcel in) {
                image = in.readString();
            }

            public static final Creator<Image> CREATOR = new Creator<Image>() {
                @Override
                public Image createFromParcel(Parcel in) {
                    return new Image(in);
                }

                @Override
                public Image[] newArray(int size) {
                    return new Image[size];
                }
            };

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            @Expose
            @SerializedName("image")
            private String image;

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(image);
            }
        }


        public static class Sizes implements Parcelable {
            protected Sizes(Parcel in) {
                id = in.readString();
                name = in.readString();
            }

            public static final Creator<Sizes> CREATOR = new Creator<Sizes>() {
                @Override
                public Sizes createFromParcel(Parcel in) {
                    return new Sizes(in);
                }

                @Override
                public Sizes[] newArray(int size) {
                    return new Sizes[size];
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

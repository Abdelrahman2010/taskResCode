package com.adwya.task.data.model;

public class CartObject {





    int id;
    String ProductName;
    String Price;
    String Size;
    String Clean;
    String Count;
    String Photo;



    String ItemID;

    public CartObject(){


    }

    public CartObject(int id,String ProductName,String Price,String Size,String Clean,String Count,String Photo){

        this.id = id;
        this.ProductName = ProductName;
        this.Price = Price;
        this.Size = Size;
        this.Clean = Clean;
        this.Count = Count;
        this.Photo = Photo;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getClean() {
        return Clean;
    }

    public void setClean(String clean) {
        Clean = clean;
    }

    public String getCount() {
        return Count;
    }

    public void setCount(String count) {
        Count = count;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String photo) {
        Photo = photo;
    }

    public String getItemID() {
        return ItemID;
    }

    public void setItemID(String itemID) {
        ItemID = itemID;
    }



}

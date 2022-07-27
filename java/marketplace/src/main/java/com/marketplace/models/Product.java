package com.marketplace.models;

import java.util.List;

public class Product {
    private int id;
    private int visits;
    private String name;
    private String categoryID;
    private String trademarkID;
    private int userID;

    public void setVisits(int visits) {
        this.visits = visits;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVisits() {
        return visits;
    }

    public void setVisits() {
        this.visits++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public String getTrademarkID() {
        return trademarkID;
    }

    public void setTrademarkID(String trademarkID) {
        this.trademarkID = trademarkID;
    }
}

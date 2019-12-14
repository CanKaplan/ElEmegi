package com.Elemegi.Elemegi.Model;

import java.util.List;

public class Product {
    private String name;
    private long productID;
    private long UserID;
    private List<String> labels;
    private String[] image;
    private String description;
    private double overallRating;
    private double price;
    private int deliverTime;
    private List<Comment> comments;

    public Product(String name, long productID, long userID, List<String> labels, String[] image, String description, double overallRating, double price, int deliverTime, List<Comment> comments) {
        this.name = name;
        this.productID = productID;
        this.UserID = userID;
        this.description  = description;
        this.labels = labels;
        this.image = image;
        this.price = price;
        this.overallRating = overallRating;
        this.comments = comments;
        this.deliverTime = deliverTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getProductID() {
        return productID;
    }

    public long getUserID() {
        return UserID;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public String[] getImage() {
        return image;
    }

    public void setImage(String[] image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(double overallRating) {
        this.overallRating = overallRating;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverTime(int deliverTime) {
        this.deliverTime = deliverTime;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}

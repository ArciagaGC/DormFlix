package com.example.dormflixv2;

public class bookings {
    private String id;
    private String date;
    private String roomname;
    private String availablebeds;
    private String price;
    private String description;
    private String url;


//from date to day/week/month/year


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

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public String getAvailablebeds() {
        return availablebeds;
    }

    public void setAvailablebeds(String availablebeds) {
        this.availablebeds = availablebeds;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public bookings(String id, String price, String roomname, String availablebeds, String date, String description, String url) {
        this.id = id;
        this.price = price;
        this.roomname = roomname;
        this.availablebeds = availablebeds;
        this.date = date;
        this.description = description;
        this.url = url;
    }
}

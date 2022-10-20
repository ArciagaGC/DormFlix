package com.example.dormflixv2;

import com.google.firebase.auth.FirebaseUser;

public class dorms {

    String dormName;
    String dormPlace;
    String dormPrice;
    int img;


    public dorms(String dormName, String dormPlace, String dormPrice, int img) {
        this.dormName = dormName;
        this.dormPlace = dormPlace;
        this.dormPrice = dormPrice;
        this.img = img;
    }

    public static void add(FirebaseUser user) {
    }


    public String getDormName() {
        return dormName;
    }

    public String getDormPlace() {
        return dormPlace;
    }

    public String getDormPrice() {
        return dormPrice;
    }

    public int getImg() {
        return img;
    }
}

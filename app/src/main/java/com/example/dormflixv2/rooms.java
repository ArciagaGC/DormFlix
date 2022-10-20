package com.example.dormflixv2;

public class rooms {
    String availablebed, desc, price, roomno, thumb, totalbed;
    rooms()
    {

    }

    public rooms(String availablebed, String desc, String price, String roomno, String thumb, String totalbed) {
        this.availablebed = availablebed;
        this.desc = desc;
        this.price = price;
        this.roomno = roomno;
        this.thumb = thumb;
        this.totalbed = totalbed;
    }

    public String getAvailablebed() {
        return availablebed;
    }

    public void setAvailablebed(String availablebed) {
        this.availablebed = availablebed;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRoomno() {
        return roomno;
    }

    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getTotalbed() {
        return totalbed;
    }

    public void setTotalbed(String totalbed) {
        this.totalbed = totalbed;
    }
}

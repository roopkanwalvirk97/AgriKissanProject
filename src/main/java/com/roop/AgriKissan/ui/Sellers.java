package com.roop.AgriKissan.ui;
import java.io.Serializable;

public class Sellers implements  Serializable {

    public int image;
    public String name;
    public String quantity;
    public String contact;
    public String price;

    public Sellers() {
    }

    public Sellers(int image, String name, String quantity, String contact, String price) {
        this.image = image;
        this.name = name;
        this.quantity = quantity;
        this.contact = contact;
        this.price = price;
    }
}

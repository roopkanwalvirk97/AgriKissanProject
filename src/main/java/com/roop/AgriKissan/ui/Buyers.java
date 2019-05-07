package com.roop.AgriKissan.ui;

import java.io.Serializable;

public class Buyers implements Serializable {

        // Attributes
        public int image;
        public String cropname;
        public String name;
        public String quantity;
        public String grade;
        public String contact;
        public String price;


        public Buyers(){

        }

    public Buyers(int image, String cropname, String name, String quantity, String grade, String contact, String price) {
        this.image = image;
        this.cropname = cropname;
        this.name = name;
        this.quantity = quantity;
        this.grade = grade;
        this.contact = contact;
        this.price = price;
    }
}



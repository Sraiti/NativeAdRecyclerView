package com.example.nativeadvancedrecyclerview.Model;

import java.util.ArrayList;

public class Product {

    String Name;
    String Desc;
    String ImagePath;
    int Price;

    public Product() {
    }

    public Product(String name, String desc, String imagePath, int price) {
        Name = name;
        Desc = desc;
        ImagePath = imagePath;
        Price = price;
    }

    public static ArrayList<Product> createProductsList(int numProducts) {

        ArrayList<Product> Products = new ArrayList<Product>();

        for (int i = 1; i <= numProducts; i++) {
            Products.add(new Product("Name " + i, "Desc " + i, "product_image", 99));
        }

        return Products;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public String getImagePath() {
        return ImagePath;
    }

    public void setImagePath(String imagePath) {
        ImagePath = imagePath;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}

package com.EcomJava.ecommerceSpringBootBase;

class Auto {
    private String name;
    private String color;
    private String model;
    private String price;
    private String year;
    private String brand;
    private String description;

    public Auto(String name, String color, String model, String price, String year, String brand, String description) {
        this.name = name;
        this.color = color;
        this.model = model;
        this.price = price;
        this.year = year;
        this.brand = brand;
        this.description = description;
    }

    public Auto() {
        this.name = "";
        this.color = "";
        this.model = "";
        this.price = "";
        this.year = "";
        this.brand = "";
        this.description = "";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }

    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}

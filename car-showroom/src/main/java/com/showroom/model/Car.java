
package com.showroom.model;

public class Car {
    private int id;
    private String model;
    private String brand;
    private double price;
    private int stock;

    public Car(int id, String model, String brand, double price, int stock) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.stock = stock;
    }

    public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString() {
        return id + ": " + brand + " " + model + " - ₹" + price + " (Stock: " + stock + ")";
    }

    public int getId() { return id; }
}


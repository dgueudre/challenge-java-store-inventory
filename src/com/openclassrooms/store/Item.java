package com.openclassrooms.store;

abstract class Item {

    protected final BrandEnum brand;
    protected final double price;

    protected Item(BrandEnum brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    abstract String getType();

    public String toString() {
        return getType() + " " + brand;
    }

    public String getCaracteristics() {
        return " - Price: " + price + " €\n";
    }

}

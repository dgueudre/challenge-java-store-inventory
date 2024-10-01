package com.openclassrooms.store;

public class Screen extends Item {

    protected final String resolution;

    public Screen(BrandEnum brand, double price, String resolution) {
        super(brand, price);
        this.resolution = resolution;
    }

    @Override
    String getType() {
        return "Screen";
    }

    @Override
    public String getCaracteristics() {
        return super.getCaracteristics() + " - Resolution: " + resolution + "\n";
    }
}

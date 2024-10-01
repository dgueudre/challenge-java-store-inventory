package com.openclassrooms.store;

public class Mouse extends Item {

    public Mouse(BrandEnum brand, double price) {
        super(brand, price);
    }

    @Override
    String getType() {
        return "Mouse";
    }
}

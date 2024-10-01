package com.openclassrooms;

import com.openclassrooms.store.BrandEnum;
import com.openclassrooms.store.Inventory;
import com.openclassrooms.store.Mouse;
import com.openclassrooms.store.Screen;

public class Main {

    public static void main(String[] args) {

        Mouse m = new Mouse(BrandEnum.DELL, 20.0);
        Screen s = new Screen(BrandEnum.SAMSUNG, 150.0, "1920x1080");

        Inventory inventory = new Inventory();
        inventory.add(s, 1);
        inventory.add(m, 1);
        inventory.add(s, 12);
        inventory.add(m, 8);
        inventory.add(s, 1);
        inventory.add(m, 1);
        inventory.remove(m, 1);
        inventory.remove(m, 1);
        inventory.remove(m, 0);
        inventory.remove(m, 1);

        System.out.println(inventory);


    }
}

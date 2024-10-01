package com.openclassrooms.store;


import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private final Map<Item, Integer> items;

    public Inventory() {
        items = new HashMap<>();
    }

    public void add(Item inventoryItem, int quantity) {
        int newQuantity = quantity;
        if (items.containsKey(inventoryItem)) {
            newQuantity += items.get(inventoryItem);
        }
        items.put(inventoryItem, newQuantity);
    }

    public void remove(Item inventoryItem, int quantity) {
        int newQuantity = -quantity;
        if (!items.containsKey(inventoryItem)) {
            return;
        }
        
        newQuantity += items.get(inventoryItem);

        if (newQuantity <= 0) {
            items.remove(inventoryItem);
        } else {
            items.put(inventoryItem, newQuantity);
        }
    }

    public String toString() {
        String result = "Store Inventory:\n\n";
        for (Map.Entry<Item, Integer> entry : items.entrySet()) {
            result += entry.getKey() + ": " + entry.getValue() + "x " + "\n";
            result += entry.getKey().getCaracteristics() + "\n";
        }
        return result;
    }

}

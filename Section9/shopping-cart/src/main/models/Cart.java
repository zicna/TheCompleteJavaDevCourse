package main.models;

import java.util.ArrayList;

public class Cart {
    ArrayList<Item> items;

    public Cart() {
        this.items = new ArrayList<Item>();
    }

    public Item getItem(int index) {
        return new Item(this.items.get(index));
    }

    public void setItem(int index, Item item) {
        this.items.set(index, new Item(item));
    }

    public boolean add(Item item){
        if(items.contains(item)){
            return false;
        }
        this.items.add(new Item(item));
        return true;
    }

    public void remove(String name){
        // for (int i = 0; i < items.size(); i++) {
        //     if(items.get(i).getName().equals(name)){
        //         items.remove(i);
        //         return true; 
        //     }
        // }
        // return false;
        items.removeIf((item) -> item.getName().equals(name));
    }

    public boolean contains(Item item){
        return this.items.contains(item);
    }

    public double getSubtotal(){
        // double temp = 0;

        // for (int i = 0; i < items.size(); i++) {
        //     temp += items.get(i).getPrice();
        // }
        // return temp;

        return items.stream()
            .mapToDouble(item -> item.getPrice())
            .sum();
    }

    public double getTax(){
        return getSubtotal() * 0.13;
    }

    public double getTotal(){
        return (this.getTax() + this.getSubtotal());
    }






    
    public String toString() {
        String temp = "";
        for (int i = 0; i < this.items.size(); i++) {
            temp += this.items.get(i).toString();
            temp += "\n";
        }
        return temp;
    }

}

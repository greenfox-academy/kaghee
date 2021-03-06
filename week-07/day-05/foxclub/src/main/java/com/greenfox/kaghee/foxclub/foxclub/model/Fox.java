package com.greenfox.kaghee.foxclub.foxclub.model;

import java.util.ArrayList;
import java.util.List;

public class Fox {
    String name;
    String food;
    String drink;
    List<Trick> tricks;
    String image;

    public Fox() {
        image = "greenfox";
        name = "Mr. Fox";
        food = "pizza";
        drink = "lemonade";
        tricks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public List<Trick> getTricks() {
        return tricks;
    }

    public int getNumOfTricks() {
        return tricks.size();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void learnTrick(String trick) {
        tricks.add(new Trick(trick));
    }


}

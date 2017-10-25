package com.greenfox.bankofsimba.model;

public class BankAccount {
    String name;
    int balance;
    String currency;
    String animalType;

    boolean isKing;

    public BankAccount(String name, int balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.currency = "Zebra";
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public String getAnimalType() {
        return animalType;
    }

    public boolean isKing() {
        return isKing;
    }

    public void setKing() {
        this.isKing = true;
    }
}

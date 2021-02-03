package com.company;

public class LimitExeption extends Exception{
    private double remainingAmount;

    LimitExeption(String message, double remainingAmount){
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public double getRemainingAmount(){
        return remainingAmount;
    }

}

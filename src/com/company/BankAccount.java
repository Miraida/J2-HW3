package com.company;

public class BankAccount {
    private double amount;

    public double getAmount(){
        return amount;
    }
    public void deposit(double sum){
        amount = amount + sum;
    }

    public void withDraw(int sum) throws LimitExeption {
        if (amount < sum )
            throw new LimitExeption("Не достаточно средств для снятия 6000 coma!!! ",amount);
        else amount -= sum;

    }
}

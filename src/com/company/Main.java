package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        boolean isTrue = true;
        while (isTrue){

            try{
                System.out.println(bankAccount.getAmount()+" som");
                bankAccount.withDraw(6000);
            }catch (LimitExeption le){
                System.out.println(le.getMessage());
                try {
                    bankAccount.withDraw((int) le.getRemainingAmount());
                } catch (LimitExeption limitExeption) {
                    limitExeption.printStackTrace();
                }
                System.out.println(bankAccount.getAmount()+" som");
                isTrue = false;
            }
        }
    }
}

package com.company;

public class Player {
    private BankAccount account;
    private String name;

    public Player(String name, int balance)
    {
        this.name = name;

        this.account = new BankAccount(balance);

    }

    public String getName()
    {
        return name;
    }

    public int getBalance()
    {
        return account.getBalance();
    }


    @Override
    public String toString()
    {
        return name+": "+account.getBalance();
    }







}

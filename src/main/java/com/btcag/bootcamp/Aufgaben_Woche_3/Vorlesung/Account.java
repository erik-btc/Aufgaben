package com.btcag.bootcamp.Aufgaben_Woche_3.Vorlesung;

public class Account {
    private int saldo;

    public Account(int saldo){
        this.saldo = saldo;
    }


    public int cashIn(int amount){
        this.saldo += amount;
        return this.saldo;
    }

    public int cashOut(int amount){
        this.saldo -= amount;
        return amount;
    }

    public int getSaldo(){
        return this.saldo;
    }

}

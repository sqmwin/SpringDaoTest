package com.sqm.transaction.pojo;

/**
 * <p>
 *
 * @author sqm
 * @version 1.0
 */
public class Account {
    private int aid;
    private String aname;
    private double balance;

    public Account() {
    }

    public Account(int aid, String aname, double balance) {
        this.aid = aid;
        this.aname = aname;
        this.balance = balance;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "Account{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", balance=" + balance +
                '}';
    }
}

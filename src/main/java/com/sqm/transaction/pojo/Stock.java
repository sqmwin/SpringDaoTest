package com.sqm.transaction.pojo;

/**
 * <p>
 *
 * @author sqm
 * @version 1.0
 */
public class Stock {
    private int sid;
    private String sname;
    private int count;

    public Stock() {
    }

    public Stock(int sid, String sname, int count) {
        this.sid = sid;
        this.sname = sname;
        this.count = count;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", count=" + count +
                '}';
    }
}

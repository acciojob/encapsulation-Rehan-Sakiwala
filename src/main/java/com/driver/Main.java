package com.driver;

public class Main {
    public static void main(String args[]){
        RWOnly r= new RWOnly();
        //r.name="Rehan";
        //name has private access in com.driver.RWOnly
        r.setName("Rehan");
        System.out.println(r.getName());
    }
}
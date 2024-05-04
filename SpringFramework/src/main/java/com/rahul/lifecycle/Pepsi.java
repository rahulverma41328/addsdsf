package com.rahul.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
    private double Price;

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "Price=" + Price +
                '}';
    }

    public Pepsi() {
        super();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // this method will work as init method
        System.out.println("taking pepsi: init");
    }

    @Override
    public void destroy() throws Exception {
        // this method will work as destroy
        System.out.println("drunk the pepsi: destroy");
    }
}

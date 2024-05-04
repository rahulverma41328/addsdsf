package com.rahul.lifecycle;

public class Chips {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Chips() {
        super();
    }

    @Override
    public String toString() {
        return "Chips{" +
                "name='" + name + '\'' +
                '}';
    }
}

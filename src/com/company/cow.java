package com.company;

public class cow extends animal {
    protected String lastFed;

    public cow(String name, int age, String breed, String lastFed) {
        super(name, age, breed);
        this.lastFed = lastFed;
    }

    @Override
    public String toString() {
        return "cow{" +
                "lastFed='" + lastFed + '\'' +
                '}';
    }

    public String getLastFed() {
        return lastFed;
    }

    public void setLastFed(String lastFed) {
        this.lastFed = lastFed;
    }
}

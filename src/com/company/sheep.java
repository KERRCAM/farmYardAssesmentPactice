package com.company;

public class sheep extends animal{
    protected String lastSheared;

    public sheep(String name, int age, String breed, String lastSheared) {
        super(name, age, breed);
        this.lastSheared = lastSheared;
    }

    @Override
    public String toString() {
        return "sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", lastSheared='" + lastSheared + '\'' +
                '}';
    }

    public String getLastSheared() {
        return lastSheared;
    }

    public void setLastSheared(String lastSheared) {
        this.lastSheared = lastSheared;
    }
}

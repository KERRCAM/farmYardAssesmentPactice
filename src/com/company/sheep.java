package com.company;

public class sheep extends animal{
    protected String lastSheared;

    @Override
    public String toString() {
        return "sheep{" +
                "lastSheared='" + lastSheared + '\'' +
                '}';
    }

    public String getLastSheared() {
        return lastSheared;
    }

    public void setLastSheared(String lastSheared) {
        this.lastSheared = lastSheared;
    }
}

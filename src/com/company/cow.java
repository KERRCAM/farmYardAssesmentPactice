package com.company;

public class cow extends animal {
    protected String lastFed;

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

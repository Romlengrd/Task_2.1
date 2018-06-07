package com.company;

import java.util.Objects;

public class Pen {
    private int price;
    private String color;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;
        if (obj==null) return false;
        if (!(obj instanceof Pen))  return false;

        Pen pen=(Pen) obj;
        return pen.price==price && pen.color.equals(color);


    }

    @Override
    public int hashCode () {
        int result = 17;
        result = 31*result+price;
        result = 31*result+color.hashCode();
        return result;
    }

    @Override
    public String toString () {
        return getClass().getName() + "@" + "price - " + price + "color - " + color;
    }
}

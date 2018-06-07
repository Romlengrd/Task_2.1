package com.company;

public class Main {

    public static void main(String[] args) {
	Pen pen = new Pen ();
	pen.setPrice(500);
	pen.setColor("black");
        System.out.println("Цена 1й ручки - " + pen.getPrice());
        System.out.println("Цвет 1й ручки - " + pen.getColor());

    Pen pen1 = new Pen ();
        pen1.setPrice(200);
        pen1.setColor("red");
        System.out.println("Цена 2й ручки - " + pen1.getPrice());
        System.out.println("Цвет 2й ручки - " + pen1.getColor());

        System.out.println("Одинаковы ли ручки? - " + pen.equals(pen1));
    }
}

package com.codecool.oopws2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        rectangle.printRectangle();

        RoundedRectangle roundedRectangle = new RoundedRectangle(5, 6 , 1);
        roundedRectangle.printRoundRadius();
        System.out.println(roundedRectangle.toString());
    }
}

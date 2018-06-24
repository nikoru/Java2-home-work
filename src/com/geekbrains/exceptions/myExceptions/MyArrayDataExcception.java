package com.geekbrains.exceptions.myExceptions;

public class MyArrayDataExcception extends NumberFormatException {

    public MyArrayDataExcception(String message, int x, int y) {
        super(message);
        System.out.println("Incorrect data in cell "+ x +","+ y);
    }
}

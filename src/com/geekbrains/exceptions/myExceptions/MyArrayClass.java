package com.geekbrains.exceptions.myExceptions;

public class MyArrayClass {
    private int sum = 0;
    private String[][] arr;

    public int getSum() {
        return sum;
    }

    public MyArrayClass(String[][] arr){
        this.arr = arr;
    }

    public void arraySum() throws MyArraySizeException, MyArrayDataExcception{

        if (arr.length != 4) throw new MyArraySizeException();

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].length != 4) throw new MyArraySizeException();

            for (int j = 0; j < arr[i].length; j++){
              try{
                  sum += Integer.parseInt(arr[i][j]);
              }
              catch (NumberFormatException e){
                  throw new MyArrayDataExcception("Format problem",(i+1),(j+1));
              }

            }
        }
    }
}

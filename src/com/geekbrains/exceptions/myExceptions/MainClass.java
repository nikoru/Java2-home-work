package com.geekbrains.exceptions.myExceptions;

public class MainClass {
    public static void main(String[] args) {
        String[][] testArray = {{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};
        MyArrayClass t1 = new MyArrayClass(testArray);

        try{
            t1.arraySum();
        } catch (MyArraySizeException e){
            e.printStackTrace();
        } catch (MyArrayDataExcception f){
            f.printStackTrace();
        }
        System.out.println("Sum result = " + t1.getSum());
    }
}

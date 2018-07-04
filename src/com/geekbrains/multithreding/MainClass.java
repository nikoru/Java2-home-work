package com.geekbrains.multithreding;

public class MainClass {
    static final int size = 10000000;
    static final int h = size / 2;
    float[] arr = new float[size];

    public static void main(String[] args) {
        MainClass m = new MainClass();
        m.calculationInOneThread();
        try {
            m.calculationInTwoThreads();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void calculationInOneThread(){
        for (int i = 0; i < size ; i++){
            arr[i] = 1;
        }

        long start = System.currentTimeMillis();

        for (int i = 0; i < size ; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println(System.currentTimeMillis() - start);
    }

    private void calculationInTwoThreads() throws InterruptedException {
        for (int i = 0; i < size ; i++){
            arr[i] = 1;
        }

        float[] a1 = new float[h];
        float[] a2 = new float[h];

        long start = System.currentTimeMillis();

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        System.out.println("Array divider: " + (System.currentTimeMillis() - start));

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                long s = System.currentTimeMillis();
                for (int i = 0; i < h ; i++) {
                    a1[i] = (float)(a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                System.out.println("First thread time: " + (System.currentTimeMillis() - s));
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                long s = System.currentTimeMillis();
                for (int i = 0; i < h ; i++) {
                    a2[i] = (float)(a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                System.out.println("Second thread time: " + (System.currentTimeMillis() - s));

            }
        });
        t1.start();
        t2.start();

        try{
        t1.join();
        } catch (Exception e){
            e.printStackTrace();
        }

        try{
            t2.join();
        } catch (Exception e){
            e.printStackTrace();
        }

        start = System.currentTimeMillis();
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        System.out.println("Array concat: " + (System.currentTimeMillis() - start));
    }
}

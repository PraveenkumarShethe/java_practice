package com.praveen.shethe;

/**
 * Created by Praveenkumar on 7/7/2020.
 */
public class NumberOperations {

    public void swapNumbers(int a, int b){
        System.out.println("Input ==========> a "+ a + " ---------------- b " + b);
        a = a + b ;
        b = a - b ;
        a = a - b ;
        System.out.println("Output =========> a "+ a + " ---------------- b " + b);
    }

    public static void main(String[] args) {
        NumberOperations numberOperations = new NumberOperations();
        numberOperations.swapNumbers(10, 20);

    }
}

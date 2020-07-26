package com.praveen.shethe;

/**
 * Created by user on 7/7/2020.
 */
public class ReverseString {

    public void stringBuilderWay(String test){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(test);
        stringBuilder = stringBuilder.reverse();
        System.out.println(stringBuilder);
    }

    public void withOutUsingStingBuiltin(String test){
        String result = "";
        for (int i = test.length()-1 ; i >= 0 ; i--){
            result = result + test.charAt(i);
        }
        System.out.println(result);
    }

    /**
    Testing reverse string results
    */
    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        reverseString.stringBuilderWay("MADAM");
        reverseString.withOutUsingStingBuiltin("MADAM");
    }
}

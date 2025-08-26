package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    }

    public static int multiply(int a, int b){
        return a*b;
    }
    public static boolean isPositive(int a){
        return a >= 0;
    }
    public static String getFirstLetter(String text){
        if (text == null || text.equals("")){
            return null;
        } else {
            return "" + text.charAt(0);
        }
    }
    public static int devideNum(int a, int b){
        if (b <= 0){
            throw new IllegalArgumentException("second integer must be bigger 0");
        } else {
            return a / b;
        }
    }

    public static boolean isPrime(int a){
        for (int i = 2; i < a; i++)
            if (a % i == 0){
                return false;
            }

        return true;
    }

    public static int sum(int a, int b) {
        return a+b;
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }



    public static String reverseString(String text) {
        String resultString = "";
        for (int i = text.length()-1; i >= 0; i--){
            resultString += text.charAt(i);
        }
        return resultString;
    }

    public static boolean palindrome(String text) {
        String reversedString = reverseString(text);
        return reversedString.toLowerCase().equals(text.toLowerCase());

    }

    public static int countVowels(String text) {
        int vowelCount = 0;
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == 'a' ||
                    text.charAt(i) == 'e' ||
                    text.charAt(i) == 'i' ||
                    text.charAt(i) == 'o' ||
                    text.charAt(i) == 'u'){
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public static int[] mergeArrays(int[] a, int[] b, int[] c) {
        int[] result = new int[a.length+b.length+c.length];
        int index = 0;
            for (int x = 0; x <a.length; x++){
                result[index] = a[x];
                index++;
            }
            for (int y = 0; y <b.length; y++){
                result[index] = b[y];
                index++;
            }
            for (int z = 0; z <c.length; z++){
                result[index] = c[z];
                index++;
            }

        return result;
    }
}
package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {




    }

    public static boolean isEven(int num){
        return num % 2 == 0;
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
}
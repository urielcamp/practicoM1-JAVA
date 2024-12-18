package EjerciciosDelExamen;

import javax.swing.*;

public class Fibonacci {
    public static void main(String[] args) {

    }

    //Fibonacci

    public int[] fibonacci(int n) {


        if(n<= 0){
            return new int[0];
        }

        int[] padovan = new int[n];

        padovan[0] = 1;
        if(n> 1) padovan[1] = 1;
        if (n>2) padovan[2] = 1;

        for (int i = 3; i<= n; i++){
            padovan[i] = padovan[i - 2] + padovan[i - 3];
        }

        return padovan;

    }








}

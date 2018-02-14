package com.chnu.oop.lab02;

/**
 *
 * @author 1610606
 */
import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        System.out.print("Вводить числа самому?(0 - нет, 1 - да) \n");
        int i = inn.nextInt();
        if ((i<=1) & (i>=0)) {
            float x,a,b,c;
            if (i == 0) {
                x = 0.5f;  a = 7.12f; b = 8.12f; c = -4.15f;
            } else {
                System.out.print("x =  \n");
                x = inn.nextFloat();
                System.out.print("a =  \n");
                a = inn.nextFloat();
                System.out.print("b =  \n");
                b = inn.nextFloat();
                System.out.print("c =  \n");
                c = inn.nextFloat();
            }
            double p = (Math.log10(a*x-c)/Math.log10(2));
            double r = (Math.exp(a*x)*Math.tan(b*x+c)+(p/(Math.exp(b*x*x-1))));
            System.out.println("res="+r);
        } else System.out.println("Не верный выбор!");
    }
    
}

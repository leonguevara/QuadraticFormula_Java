/*
 *  Main.java
 *  QuadraticFormula_Java
 *
 *  This program will help you get the value(s) of x that solve the quadratic equation
 *
 *  ax^2 + bx + c = 0
 *
 *  Java:   SDK 1.8 - Language level 8
 *
 *  Author: León Felipe Guevara Chávez
 *  email:  leon.guevara@itesm.mx
 *  date:   May 28th, 2017
 */
package com.leonguevara;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // We ask for and read the values of a, b and c
        System.out.print("Give me the value of a: ");
        float a = scanner.nextFloat();
        System.out.print("Give me the value of b: ");
        float b = scanner.nextFloat();
        System.out.print("Give me the value of c: ");
        float c = scanner.nextFloat();

        // We compute the values of x1 and x2
        float x1 = (-b + (float)Math.sqrt(b*b - 4*a*c))/(2*a);
        float x2 = (-b - (float)Math.sqrt(b*b - 4*a*c))/(2*a);

        // We display the values of x1 and x2
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}

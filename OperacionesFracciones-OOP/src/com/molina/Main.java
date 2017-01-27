package com.molina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,den1,num2,den2;
        Fraction fraction1, fraction2, plusResult, minusResult, timesResult, dividedResult;

        System.out.println("Introduzca el numerador de la primera fraccion:");
        num1 = input.nextInt();
        System.out.println("Introduzca el denominador de la primera fraccion");
        den1 = input.nextInt();
        fraction1 = new Fraction(num1,den1);
        System.out.println();

        System.out.println("Introduzca el numerador de la segunda fraccion:");
        num2 = input.nextInt();
        System.out.println("Introduzca el denominador de la segunda fraccion:");
        den2 = input.nextInt();
        fraction2 = new Fraction(num2,den2);
        System.out.println();

        plusResult = fraction1.plus(fraction2);
        minusResult = fraction1.minus(fraction2);
        timesResult = fraction1.times(fraction2);
        dividedResult = fraction1.dividedBy(fraction2);

        System.out.println("Suma:");
        System.out.println(fraction1 + " + " + fraction2 + " = " + plusResult);
        System.out.println("Resta:");
        System.out.println(fraction1 + " - " + fraction2 + " = " + minusResult);
        System.out.println("Multiplicacion:");
        System.out.println(fraction1 + " * " + fraction2 + " = " + timesResult);
        System.out.println("Division:");
        System.out.println(fraction1 + " / " + fraction2 + " = " + dividedResult);
        System.out.println("Mixto fracción 1:");
        System.out.println(fraction1.mix());
        System.out.println("Mixto fracción 2:");
        System.out.println(fraction2.mix());
    }
}

import java.util.Scanner;

/**
  Created by artiaga on 17/11/16.

  Programa: Ejercicio - GRUPO B
  Descripción: Aplicación para calcular el sueldo neto semanal de un caza

 recompensas y la deducción por impuestos que se lleva el Imperio

 Galáctico en función de las horas trabajadas en una semana.


 Constantes:

 Variables:
 DECIMAL: sueldoBruto, impuestos, sueldoNeto, horasTrabajadas, horasExtra;
 String: nombreEmpleado

 Algoritmo:

Pedir nombreEmpleado
Pedir horasTrabajadas
Si horasTrabajadas < 45
horasTrabajadas * 9.5 = sueldoBruto

Si no
horasExtra = (((horasTrabajadas - 45) * 55) / 100)))
salarioBruto = horasExtra + horas trabajadas * 9.5

Si sueldoBruto > 200
impuestos = (((sueldoBruto - 200) * 16) / 100)))
salarioNeto = ((sueldoBruto  * 16) / 100))
Si sueldoBruto > 400
impuestos = (((sueldoBruto - 400) * 32) / 100)))
salarioNeto = ((sueldoBruto  * 32) / 100))
Imprimir "Sueldo Bruto: " + sueldoBruto;
Imprimir "Impuestos: " + impuestos;
Imprimir "Sueldo Neto: " + sueldoNeto;




 Fin algoritmo

 **/


public class Prueba {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double horasTrabajadas;
        double sueldoBruto = 0, impuestosA, impuestosB, impuestos, sueldoNeto, horasExtra;
        String nombreEmpleado;


        System.out.println("Introducir nombre Empleado ");
        nombreEmpleado = input.nextLine();

        System.out.println("Introducir Horas Trabajadas ");
        horasTrabajadas = input.nextInt();

        if (horasTrabajadas < 45) {

            sueldoBruto = horasTrabajadas * 9.5;

            if (sueldoBruto < 200) {
                impuestos = 0;
                sueldoNeto = sueldoBruto;
                System.out.printf("Sueldo Bruto: %.2f %n ", sueldoBruto);
                System.out.printf("Impuestos: %.2f %n ", impuestos);
                System.out.printf("Sueldo Neto: %.2f %n ", sueldoNeto);

            }else if (sueldoBruto > 200) {
                    impuestosA = (((sueldoBruto - 200) * 16) / 100);
                    sueldoNeto = ((sueldoBruto * 16) / 100);
                    sueldoNeto = sueldoBruto - sueldoNeto;
                    System.out.printf("Sueldo Bruto: %.2f %n ", sueldoBruto);
                    System.out.printf("Impuestos: %.2f %n ", impuestosA);
                    System.out.printf("Sueldo Neto: %.2f %n ", sueldoNeto);

                } else {
                    impuestosA = (((sueldoBruto - 200) * 16) / 100);
                    impuestosB = (((sueldoBruto - 400) * 32) / 100);
                    impuestosB= impuestosA + impuestosB;
                    sueldoNeto = ((sueldoBruto * 32) / 100);
                    sueldoNeto = sueldoBruto - sueldoNeto;
                    System.out.printf("Sueldo Bruto: %.2f %n ", sueldoBruto);
                    System.out.printf("Impuestos: %.2f %n ", impuestosB);
                    System.out.printf("Sueldo Neto: %.2f %n ", sueldoNeto);

                }


            }else {

            if (horasTrabajadas > 45) {

                horasExtra = ((((horasTrabajadas - 45) * 9.5) * 55) / 100);
                sueldoBruto = horasExtra + horasTrabajadas * 9.5;

                } if (sueldoBruto < 200) {
                    impuestos = 0;
                    sueldoNeto = sueldoBruto;
                    System.out.printf("Sueldo Bruto: %.2f %n ", sueldoBruto);
                    System.out.printf("Impuestos: %.2f %n ", impuestos);
                    System.out.printf("Sueldo Neto: %.2f %n ", sueldoNeto);

                } else if (sueldoBruto > 200) {
                    impuestosA = (((sueldoBruto - 200) * 16) / 100);
                    sueldoNeto = ((sueldoBruto * 16) / 100);
                    sueldoNeto = sueldoBruto - sueldoNeto;
                    System.out.printf("Sueldo Bruto: %.2f %n ", sueldoBruto);
                    System.out.printf("Impuestos: %.2f %n ", impuestosA);
                    System.out.printf("Sueldo Neto: %.2f %n ", sueldoNeto);
            } else {
                    impuestosA = (((sueldoBruto - 200) * 16) / 100);
                    impuestosB = (((sueldoBruto - 400) * 32) / 100);
                    impuestosB= impuestosA + impuestosB;
                    sueldoNeto = ((sueldoBruto * 32) / 100);
                    sueldoNeto = sueldoBruto - sueldoNeto;
                    System.out.printf("Sueldo Bruto: %.2f %n ", sueldoBruto);
                    System.out.printf("Impuestos: %.2f %n ", impuestosB);
                    System.out.printf("Sueldo Neto: %.2f %n ", sueldoNeto);
                }
            }
        }
    }


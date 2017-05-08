/**
 * Created by artiaga on 23/11/16.
 */

import java.util.Scanner;

public class ExamenCorregido {

    public static void main(String[] args) {
        // Constantes
        final double PRECIO_HORA = 7.5;                 // Precio base de hora trabajada
        final int LIMITE_HORAS_EXTRA = 40;              // A partir de este número de horas se cobrarán como horas extra
        final double INCREMENTO_HORAS_EXTRA = 0.50;     // Incremento de la hora extra con respecto al precio base
        final double LIMITE_FRANJA_IMPUESTOS_1 = 150;   // Hasta este límite no se pagan impuestos
        final double LIMITE_FRANJA_IMPUESTOS_2 = 300;   // Hasta este límite se paga el primer tipo de impuestos
        final double FRANJA_IMPUESTOS_1 = 0.15;         // Porcentaje de impuestos para la primera franja
        final double FRANJA_IMPUESTOS_2 = 0.35;         // Porcentaje de impuestos para la segunda franja

        // Variables
        Scanner entrada = new Scanner(System.in);
        int horas;
        double impuestos, sueldo_bruto, sueldo_neto;
        String nombre;

        // Lectura de datos
        System.out.println("Introducir nombre de Empleado:");
        nombre = entrada.nextLine();
        System.out.println("Número de horas trabajadas:");
        horas = entrada.nextInt();

        // Cálculo del Sueldo Bruto
        if( horas < LIMITE_HORAS_EXTRA ){
            // Caso para cuando el número de horas trabajadas
            // no alcanzan el límite de las horas extras
            sueldo_bruto = horas * PRECIO_HORA;
        }else{
            // Cuando se supera el límite de las horas extras
            // el sueldo bruto será las horas hasta el límite
            // a su precio normal más el exceso de horas al
            // precio incrementado
            sueldo_bruto = LIMITE_HORAS_EXTRA * PRECIO_HORA +
                    (horas - LIMITE_HORAS_EXTRA) * PRECIO_HORA * (1 + INCREMENTO_HORAS_EXTRA);
        }

        // Cálculo de los impuestos
        if( sueldo_bruto <= LIMITE_FRANJA_IMPUESTOS_1){
            // Si el sueldo no supera la primera franja
            // no se deducen impuestos
            impuestos = 0;
        } else if (sueldo_bruto <= LIMITE_FRANJA_IMPUESTOS_2 ){
            // Si el sueldo es superior a la primera franja pero
            // no supera la segunda los impuestos serán los aplicables
            // en esa segunda franja
            impuestos = (sueldo_bruto - LIMITE_FRANJA_IMPUESTOS_1) * FRANJA_IMPUESTOS_1; // Impuestos 1ª Franja
        } else {
            // Si el sueldo supera la segunda franja los impuestos serán
            // todos los de la primera franja más los aplicables de la segunda
            impuestos = (LIMITE_FRANJA_IMPUESTOS_2 - LIMITE_FRANJA_IMPUESTOS_1) * FRANJA_IMPUESTOS_1 + // Impuestos 1ª Franja
                    (sueldo_bruto - LIMITE_FRANJA_IMPUESTOS_2) * FRANJA_IMPUESTOS_2; // Impuestos 2ª Franja
        }

        // Cálculo del Sueldo Neto
        // El sueldo neto es la diferencia del sueldo bruto y los impuestos.
        sueldo_neto = sueldo_bruto - impuestos;

        // Impresión de resultados
        System.out.println("Honorarios de " + nombre);
        System.out.printf("Sueldo Bruto: %.2f\n", sueldo_bruto);
        System.out.printf("Impuestos: %.2f\n", impuestos);
        System.out.printf("Sueldo Neto: %.2f", sueldo_neto);
    }
}
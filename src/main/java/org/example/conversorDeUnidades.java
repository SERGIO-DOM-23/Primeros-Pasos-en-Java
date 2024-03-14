package org.example;

import java.util.Scanner;

public class conversorDeUnidades {
    public static void main (String[] args){
        //corvertir millas en KM
        Scanner scanner = new Scanner(System.in);

        //solicitar al usuarios que ingrese milla
        System.out.println("Ingresar las millas");

        double millas = scanner.nextDouble();

        double kilometros = millas * 1.60934;

        //imprimir por pantalla el resultado

        System.out.println("la distancia en KM es:"+kilometros);
        scanner.close();

    }
}

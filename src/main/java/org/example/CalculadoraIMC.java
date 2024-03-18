package org.example;

import java.util.Scanner;

// creamos la clase calculadora IMC
public class CalculadoraIMC {

    //escribimos el metodo main
    public static void main(String[] args){

        //pedimos datos al ususario

        System.out.println("Ingresar peso");

        System.out.println("Ingresar Altura");

        // llamamos la clase scanner, que nos permite leer datos ingresados por el usuario.
        Scanner scanner = new Scanner(System.in);

        // variable 1
        double peso = scanner.nextDouble();

        //variable 2
        double altura = scanner.nextDouble();

        //calculamos la IMC aplicamos la formula "peso / (altura * altura)"
         double IMC = peso / (altura * altura);

         //mostramos el resultado del calculo de IMC
        System.out.println("Tu IMC es :" +peso / (altura * altura));

        // utiizamos el if-else-else if para comparar los resultados con los pesos promedio

        if ((IMC< 20)) {
            // Bloque de código a ejecutar si la condición1 es verdadera
            System.out.println("BAJO PESO");
        } else if (20 <= IMC && IMC< 25) {
            // Bloque de código a ejecutar si la condición2 es verdadera
            System.out.println("PESO NORMAL");
        } else if (25 <= IMC &&IMC < 30) {
            // Bloque de código a ejecutar si la condición3 es verdadera
            System.out.println("SOBREPESO");
        } else
            // Bloque de código a ejecutar si ninguna de las condiciones anteriores es verdadera
            System.out.println("OBESIDAD");

        // cerramos el scanner para que la informacion no se pierda
         scanner.close();

        }

    }


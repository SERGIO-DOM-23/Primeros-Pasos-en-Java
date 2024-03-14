package org.example;

import java.util.Scanner;

public class calcularAreaDeUnRectangulo {
    //calcular el area de un circulo
    public static void main(String[] args){

        System.out.println("Ingresar Longitud del rectangulo");

        System.out.println("Ingresar Altura del rectangulo");

        //instanciaremos un objeto de tipo scanner de la libreria util de java
        Scanner scanner = new Scanner(System.in);

        //crear una variable doble 1
        double base = scanner.nextDouble();

        //crear una variable doble 2
        double altura = scanner.nextDouble();

        //calculas el area del triangulo
        double area = base * altura;

        System.out.println("el area del triangulo es :"+ area);

        //cerrar el scanner
        scanner.close();


    }

}



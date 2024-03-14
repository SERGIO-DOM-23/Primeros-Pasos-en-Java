package org.example;

import javax.lang.model.element.VariableElement;
import java.util.Scanner;

public class areaDeUnCirculo {
         //calcular el area de un circulo
    public static void main(String[] args){
        System.out.println("Ingresar el radio del circulo");

        //instanciaremos un objeto de tipo scanner de la libreria util de java
        Scanner scanner = new Scanner(System.in);

        //crear una variable doble
            double radio = scanner.nextDouble();

        //calculas el area del circulo
        double area = Math.PI * radio * radio;

        System.out.println("el area del circulo es :"+ area);

        //cerrar el scanner
        scanner.close();


    }

}

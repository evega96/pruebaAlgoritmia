/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebaalgoritmia;

import java.util.Scanner;

/**
 *
 * @author zeki5
 */
public class Clasificacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPersonas = 50;
        int mayoresDeEdad = 0;
        int menoresDeEdad = 0;
        int hombresMayores = 0;
        int mujeresMenores = 0;

        for (int i = 0; i < totalPersonas; i++) {
            System.out.print("Ingrese el sexo (H/M) de la persona " + (i + 1) + ": ");
            char sexo = scanner.next().toUpperCase().charAt(0);
            System.out.print("Ingrese la edad de la persona " + (i + 1) + ": ");
            int edad = scanner.nextInt();
            if (edad >= 18) {
                mayoresDeEdad++;
                if (sexo == 'H') {
                    hombresMayores++;
                }
            } else {
                menoresDeEdad++;
                if (sexo == 'M') {
                    mujeresMenores++;
                }
            }
        }

        double porcentajeMayores = (mayoresDeEdad * 100.0) / totalPersonas;
        double porcentajeMujeres = (mujeresMenores * 100.0) / totalPersonas;

        System.out.println("Cantidad de personas mayores de edad: " + mayoresDeEdad);
        System.out.println("Cantidad de personas menores de edad: " + menoresDeEdad);
        System.out.println("Cantidad de personas masculinas mayores de edad: " + hombresMayores);
        System.out.println("Cantidad de personas femeninas menores de edad: " + mujeresMenores);
        System.out.println("Porcentaje de personas mayores de edad: " + porcentajeMayores + "%");
        System.out.println("Porcentaje de mujeres respecto al total de personas: " + porcentajeMujeres + "%");
    }
}
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
public class HorasTrabajadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese las horas trabajadas: ");
        double horasTrabajadas = scanner.nextDouble();

        System.out.print("Ingrese la tarifa por hora: ");
        double tarifa = scanner.nextDouble();

        double salario;
        if (horasTrabajadas > 40) {
            double horasExtras = horasTrabajadas - 40;
            salario = 40 * tarifa + horasExtras * tarifa * 1.5;
        } else {
            salario = horasTrabajadas * tarifa;
        }

        System.out.println("El salario del trabajador es: " + salario + " €");
    }
}

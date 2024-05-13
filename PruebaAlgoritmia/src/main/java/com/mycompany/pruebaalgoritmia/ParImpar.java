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
public class ParImpar {
    public static void main(String[] args) {
        Scanner LeerNumero = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        int numero = LeerNumero.nextInt();
        if (numero % 2 == 0) {
            for (int i = numero; i >= 0; i-=2) {
                System.out.println(i);
            }
        }else {
            for (int i = numero; i >=1 ; i-=2) {
                System.out.println(i);
            }
        }
    }
}

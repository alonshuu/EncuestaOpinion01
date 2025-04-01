package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }



    // aqui cree los primeros métodos, los métodos de creación de la matriz

    // primer metodo solo se encarga de crear la matriz

    public static char[][] crearMatriz(int N) {
        return new char[2][N];
    }

    // el segundo metodo, lo implemente pensando en que sea capaz de validar el N que se ingrese
    // para el tamaño de la matriz
    public static int obtenerNumeroValido(Scanner scanner) {
        int N;
        do {
            System.out.println("Ingrese la cantidad de encuestados: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: por favor, ingrese un numero valido:");
                scanner.next();
            }
            N = scanner.nextInt();
            if (N <= 0) {
                System.out.println("El número debe ser mayor que 0");
            }
        } while (N <= 0);

        return N;
        }
    



}
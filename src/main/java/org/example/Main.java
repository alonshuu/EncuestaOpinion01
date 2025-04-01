package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = obtenerNumeroValido(scan);
        char[][] matris = crearMatriz(M);
        llenarAprobaciones(matris, M);
        mostrarResultados(matris, M);


    }



    // aqui cree los primeros métodos, los métodos de creación de la matriz

    // primer metodo solo se encarga de crear la matriz

    public static char[][] crearMatriz(int N) {
        return new char[2][N/2];
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


    // metodo para llenar con aprobaciones
    public static void llenarAprobaciones(char[][] respuestas, int N) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-- LLENAR CON SI --");
        System.out.println("SELECCIONE EL GRUPO A EDITAR");
        System.out.println("1. HOMBRES");
        System.out.println("2. MUJERES");
        int opcion = scanner.nextInt();

        if (opcion != 1 && opcion != 2) {
            System.out.println("Opción inválida.");
            return;
        }

        int fila = (opcion == 1) ? 0 : 1;
        int espacios = N;

        System.out.println("Ingrese la cantidad de gente que aprueban la gestión");
        int cantidad = scanner.nextInt();
        int contador = 0;
        for(int j = 0; j < respuestas[fila].length; j++){
            respuestas[fila][j] = 's';
            contador++;
        }
    }
    public static void mostrarResultados(char[][] respuestas, int N){
        System.out.println(" --- RESULTADOS ENCUESTA ------");
        System.out.println("Hombres: ");
        int contador = 0;
        for (int i = 0; i < N/2 ; i++){
            if(respuestas[0][i] == 's'){
                contador++;
            }


        }
        System.out.println(contador);
    }


}
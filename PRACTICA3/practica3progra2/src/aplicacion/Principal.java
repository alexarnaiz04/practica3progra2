package aplicacion;

import java.util.Scanner;

import dominio.Mates;

/**
 * Clase principal que contiene el método main para calcular PI utilizando simulación por Montecarlo con expresiones lambda.
 */
public class Principal {
    /**
     * Método principal para iniciar el programa.
     * Solicita al usuario el número de dardos a lanzar y muestra el valor aproximado de PI.
     * @param args Argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introducir número de dardos: ");
        int numeroPasos = scanner.nextInt();

        Mates mates = new Mates();
        System.out.println("El número pi es " + mates.numeropi(numeroPasos));
        scanner.close();
    }
}



package aplicacion;

import java.util.Scanner;
import dominio.Mates;

/**
 * Clase principal que solicita al usuario el número de pasos y utiliza la clase Mates del dominio para estimar el valor de Pi
 * utilizando la simulación de Monte Carlo.
 */
public class Principal {
    /**
     * Método principal que solicita al usuario el número de pasos y utiliza la clase MonteCarlo para estimar Pi.
     * @param args Argumentos de la línea de comandos (no se usan)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir número de dardos: ");
        int numeroPasos = sc.nextInt();

        Mates monteCarlo = new Mates();
        System.out.println("El número Pi es: " + monteCarlo.estimarPi(numeroPasos));

        sc.close();
    }
}


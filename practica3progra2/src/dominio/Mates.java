package dominio;

import java.util.Random;

/**
 * Clase que implementa la simulación de Monte Carlo para estimar el valor de Pi.
 */
public class Mates {
    /**
     * Método que estima el valor de Pi utilizando la simulación de Monte Carlo.
     * @param pasos El número de pasos a simular.
     * @return La estimación del valor de Pi.
     */
    public double estimarPi(int pasos) {
        double areaCuadrado = 4.0;
        double aciertos = 0.0;
        Random numAleatorio = new Random();

        for (int i = 0; i < pasos; i++) {
            double x = numAleatorio.nextDouble();
            double y = numAleatorio.nextDouble();
            if ((x * x + y * y) <= 1) {
                aciertos++;
            }
        }

        return areaCuadrado * aciertos / pasos;
    }
}


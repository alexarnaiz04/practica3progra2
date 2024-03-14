package dominio;

import java.util.Random;
import java.util.function.LongFunction;

/**
 * Clase que contiene el método para calcular PI utilizando simulación por Montecarlo con expresiones lambda.
 */
public class Mates {
    /**
     * Método para calcular PI utilizando simulación por Montecarlo con expresiones lambda.
     * @param pasos Número de pasos o lanzamientos de dardos.
     * @return Valor aproximado de PI.
     */
    public double numeropi(int pasos) {
        /**
         * Función lambda que realiza la simulación por Montecarlo para calcular el valor aproximado de PI.
         * @param pasosLambda Número de pasos o lanzamientos de dardos.
         * @return Valor aproximado de PI.
         */
        LongFunction<Double> numeropiLambda = (long pasosLambda) -> {
            double aciertos = 0;
            double areaCuadrado = 4;
            Random random = new Random();
            for (long i = 1; i < pasosLambda; i++) {
                double x = random.nextDouble();
                double y = random.nextDouble();
                if ((x * x + y * y) <= 1) {
                    aciertos++;
                }
            }
            return areaCuadrado * aciertos / pasosLambda;
        };

        return numeropiLambda.apply(pasos);
    }
}


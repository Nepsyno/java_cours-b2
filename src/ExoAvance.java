/*     - Crée un tableau de nombres entiers.
       - Calcule la moyenne, la médiane et l'écart-type des valeurs du tableau.
       - Trier le tableau et trouver les valeurs min et max.
*/

import javax.swing.table.TableModel;
import java.util.Arrays;

public class ExoAvance {

    public static void main(String[] args) {

        int[] data = {0, 2, 5, 4, 5, 13, 7, 8, 77, 19, 10};

        double sum = 0;
        for (int value : data) {
            sum += value;
        }
        double mean = sum / data.length;
        System.out.println("Moyenne: " + mean);

        Arrays.sort(data);
        double median;
        if(data.length % 2 ==0) {
            median = (data[data.length / 2] + data[data.length / 2 - 1]) / 2.0;
        } else {
            median = data[data.length / 2];
        }
        System.out.println("Médiane: " + median);

        double variance = 0;
        for (int value : data) {
            variance += Math.pow(value - mean, 2);
        }
        double stdDev = Math.sqrt(variance / data.length);
        System.out.println("Ecart-type: " + stdDev);

        System.out.println("Min: " + data[0]);
        System.out.println("Max: " + data[data.length - 1]);

    }
}
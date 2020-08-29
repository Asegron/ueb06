/**
 * ArrayFunctions
 *
 * @author Kiran & Stelz
 * @version 1.0
 */
public class ArrayFunctions {
    /**
     * Konstanten
     */

    /**
     * Standardkonstruktor
     */
    public ArrayFunctions() {}

    /**
     * Diese Methode berechnet den quadratischen Mittelwert eines double-Arrays
     * 
     * @param doublearray
     * @return
     */
    public static double quadratischerMittelwert(double[] doublearray) {
        double qmw = 0;
        double aux = 0; //Summe der Quadrate der Werte

        for(int i = 0; i <= doublearray.length; i++) {
            aux = doublearray[i] * doublearray[i];
            qmw = qmw + aux;
        }

        return Math.sqrt((qmw / doublearray.length));
    
    }

    /**
     * Diese Methode gibt den Wert mit dem groessten Abstand zum quadratischen Mittelwert aus
     * 
     * @param doublearray
     * @return
     */
    public static double groessterAbstandQMW(double[] doublearray) {
        //randoms = [ 0 ] = Math.random();
        if((quadratischerMittelwert(doublearray) - doublearray[0]) > 
        doublearray[doublearray.length - 1] - quadratischerMittelwert(doublearray)) {
            return doublearray[0];

        } else {
            return doublearray[doublearray.length - 1];
        }
    }

    /**
     * Diese Methode sortiert int-Arrays aufsteigend.
     * 
     * @param array
     * @return aufsteigend sortiertes Array
     */
    public static int[] insertionSort(int[] sortieren) {
        int temp;
        for (int a = 1; a < sortieren.length; a++) {
            temp = sortieren[a];
            int i = a;
            while (i > 0 && sortieren[i - 1] > temp) {
                sortieren[i] = sortieren[i - 1];
                i--;
            }
            sortieren[i] = temp;
        }
        return sortieren;
    }
}
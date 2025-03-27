/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.pkg2_ordenamiento_busqueda;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author salon
 */
public class TP22_Ordenamiento_Busqueda {

    /**
     * @param JJOO
     * @param arregloPais
     * @param args the command line arguments
     * @return
     */
    public static Pais[] bubbleSort(Pais[] JJOO) {
        //tiempo inicial
        long tiempoInicial = System.nanoTime();

        int i, j;
        Pais temp;
        int tamaño = JJOO.length;
        boolean flag;

        //  for (i = (tamaño - 1); i >= 0; i--) { //DIJO PABLO POR QUE ORDENARLO COMO TAL (?
        for (i = 0; i < tamaño - 1; i++) {
            flag = false;

            //for (j = 0; j < i; j++) {
            for (j = 0; j < tamaño - 1 - i; j++) {
//                if (JJOO[j].compareTo(JJOO[j + 1]) < 0) {
                if (JJOO[j].compareTo(JJOO[j + 1]) > 0) {
                    temp = JJOO[j];
                    JJOO[j] = JJOO[j + 1];
                    JJOO[j + 1] = temp;
                    flag = true;

                }
            }
            if (!flag) {
                break;
            }
        }
        long tiempoFinal = System.nanoTime();
        long duration = tiempoFinal - tiempoInicial; // Tiempo en nanosegundos
        System.out.println("Tiempo de ejecución: " + duration + " ns");
        return JJOO;

        //tiemnpo final 
        //diferencia
    }

    
    
    //INSERTATION SORT
    public static Pais[] insertationSort(Pais[] JJOO) {
        long tiempoInicial = System.nanoTime();

        int n = JJOO.length;

        for (int i = 1; i < n; i++) {
            Pais key = JJOO[i]; // Elemento a insertar
            int j = i - 1;

            // Mover los elementos mayores que key hacia la derecha
            while (j >= 0 && JJOO[j].compareTo(JJOO[i]) > 0.) {
                JJOO[j + 1] = JJOO[j];
                j--;
            }

            // Insertar key en su posición correcta
            JJOO[j + 1] = key;

        }

        long tiempoFinal = System.nanoTime();
        long duration = tiempoFinal - tiempoInicial; // Tiempo en nanosegundos
        System.out.println("Tiempo de ejecución: " + duration + " ns");

        return JJOO;
    }

    public static void muestra(Pais[] JJOO) {
        for (Pais pais : JJOO) {

            System.out.println(pais.getNombre() + " " + pais.getRanking());

        }
    }


    public static void ordenarRanking(Pais[] JJOO) {
        int i = 1;
        for (Pais pais : JJOO) {

            pais.setRanking(i++);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Pais[] JJOO = new Pais[3];
        JJOO[0] = new Pais("Brasil", 2, 2, 2);
        JJOO[1] = new Pais("Argentina", 2, 2, 2);
        JJOO[2] = new Pais("Nicaragua", 2, 2, 2);

        muestra(JJOO);
        System.out.println("\n+++++++++\n");

       bubbleSort(JJOO);
    
        insertationSort(JJOO);

        ordenarRanking(JJOO);

        muestra(JJOO);
    }

}

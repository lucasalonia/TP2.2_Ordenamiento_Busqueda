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
   
    public static Pais[] bubbleSort(Pais[] JJOO){
       int i, j;
       Pais temp;
        int tamaño = JJOO.length;
        boolean flag;

        for (i = (tamaño - 1); i >= 0; i--) {

            flag = false;

            for (j = 0; j < i; j++) {

                if (JJOO[j].compareTo(JJOO[j + 1]) < 0) {

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
        return JJOO;
            
    }
    
    public static void muestra(Pais[] JJOO){
        for (Pais pais : JJOO) {
            
            System.out.println(pais.getNombre()+" "+pais.getRanking());
            
        }
    }
    
    public static void ordenarRanking(Pais[]JJOO){
        int i = 1;
        for (Pais pais : JJOO) {
            
            pais.setRanking(i++);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Pais[] JJOO = new Pais[3];
        JJOO[0] = new Pais("Brasil",2,1,1);
        JJOO[1] = new Pais("Argentina", 1,1,1);
        JJOO[2] = new Pais("Nicaragua", 1,1,1);
        
        
        muestra(JJOO);
        System.out.println("\n+++++++++\n");
        
        bubbleSort(JJOO);
        
        ordenarRanking(JJOO);
        
        muestra(JJOO);
    }
    
}

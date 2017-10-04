
package eva1_6_arreglos2;

import java.util.Scanner;
/*DESCLARAR UN ARREGLO Y LLENARLO DE ELEMENTOS PARA HACERLE
 UNA COPIA COMO EN LAS PRACTICAS ANTERIORES*/
/**
 *
 * @author 16550549
 */
public class EVA1_6_ARREGLOS2 {
    public static final int TAMA_ARRE = 5;
    public static void main(String[] args) {
        int aiEdad[];
        aiEdad = new int[TAMA_ARRE];
        Scanner sCaptu = new Scanner(System.in);
        for (int i = 0; i < aiEdad.length/*TAMAÑO ACTUAL DEL ARREGLO*/; i++) {
            System.out.println("Introduce tu edad: ");
            aiEdad[i] = sCaptu.nextInt();
        }
        //IMRPIMIR
        for (int x : aiEdad) {
            System.out.println("Edades: " + x);
        }
        //CREAR DUPLICADO
        int aiCopiaEdad[];
        //      aiCopiaEdad= aiEdad;   NO CREA UN DUPLICADO
        aiCopiaEdad = new int[TAMA_ARRE];
        for (int i = 0; i < TAMA_ARRE; i++) {
            aiCopiaEdad[i] = aiEdad[i];
        }
        for (int x : aiCopiaEdad) {
            System.out.println(" Copia Edad = " + x);
        }
        System.out.println(aiCopiaEdad);
        System.out.println(aiEdad);
    }

}

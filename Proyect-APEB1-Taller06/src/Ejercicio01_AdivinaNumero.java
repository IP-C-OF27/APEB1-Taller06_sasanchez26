import java.util.Scanner;
import java.util.Random;
/**
 * Ejercicio 01: Adivina un número: Dada la dinámica de juego computacional, 
 * programar una solución que genere un número entero aleatorio entre 1-N, y 
 * solicite al usuario lo adivine; dé pistas si es que el usuario falla, 
 * advirtiendo la cantidad de intentos restantes. Si es que no logra adivinar, 
 * muestre el mensaje "GAME OVER".
 * @author Santiago Sánchez
 * @version 1.0
 */
public class Ejercicio01_AdivinaNumero {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Random ale = new Random();
        int numAle = ale.nextInt(21);
        int numAdv = 0, intentos = 1;
        System.out.print("Pienso en Num (0-20), adivina: ");
        while(intentos <= 3)
        {
            numAdv = tcl.nextInt();
            if (numAdv == numAle)
            {
                System.out.println("BIEN, ADIVINASTE");
                break;
            }
            else
                if (numAle > numAdv)
                System.out.println("MAL, es mayor!!!!, te quedan " + (intentos) + " intentos");
                else
                    System.out.println("MAL, es menor, te quedan " + (3 - intentos) + " intentos");
            intentos++;
        }
        if (numAdv != numAle)
        System.out.println("GAME OVER");
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Pienso en Num (0-20), adivina: 10
MAL, es menor, te quedan 2 intentos
5
MAL, es menor, te quedan 1 intentos
2
BIEN, ADIVINASTE
BUILD SUCCESSFUL (total time: 17 seconds)
 */
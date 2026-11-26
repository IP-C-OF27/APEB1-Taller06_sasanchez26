import java.util.Scanner;
/**
 * Ejercicio 03: Serie numérica 2:Realizar un programa Java que permita presentar 
 * en pantalla la siguiente secuencia: 5/10  10/12  15/14  20/16  25/18  30/20
 * @author Santiago Sánchez
 * @version 1.0
 */
public class Ejercicio03_SerieNumerica2 
{
    public static void main(String[] args) 
    {
        Scanner tcl = new Scanner(System.in);
        int numerador = 5, denominador = 10;
        for (int contCiclo = 1; contCiclo <= 6; contCiclo++)
        {
            System.out.println(numerador + "/" + denominador);
            numerador += 5;
            denominador += 2;
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
5/10
10/12
15/14
20/16
25/18
30/20
BUILD SUCCESSFUL (total time: 0 seconds)
 */
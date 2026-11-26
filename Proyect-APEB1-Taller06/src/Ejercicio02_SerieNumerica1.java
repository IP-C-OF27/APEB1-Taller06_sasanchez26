import java.util.Scanner;
/**
 * Ejercicio 02: Serie numérica 1: Realizar un programa Java que permita 
 * presentar en pantalla la siguiente secuencia: 1/10 2/11 3/12 4/13 5/14 6/15
 * @author Santiago Sánchez
 * @version 1.0
 */
public class Ejercicio02_SerieNumerica1 
{
    public static void main(String[] args) 
    {
        Scanner tcl = new Scanner(System.in);
        int contCiclo = 1, numerador = 1, denominador = 10;
        do {
            System.out.println(numerador + "/" + denominador);
            contCiclo++;
            numerador++;
            denominador++;
        }while (contCiclo <= 6);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
1/10
2/11
3/12
4/13
5/14
6/15
BUILD SUCCESSFUL (total time: 0 seconds)
 */
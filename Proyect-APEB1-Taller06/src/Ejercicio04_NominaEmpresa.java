import java.util.Scanner;
/**
 * Ejercicio 04: Nómina empresa: Realizar un programa Java que permita pedir 
 * por teclado el nombre de 5 empleados. Por cada empleado se debe solicitar el 
 * nombre, numero de días trabajados y costo del día trabajo. Calcular el valor 
 * a cancelar por la empresa para cada empleado. Presentar un reporte como el 
 * siguiente:
NOMBRE      NUMERO DE DÍAS TRABAJADOS	COSTO DEL DÍA	CANTIDAD A CANCELAR
Nombre 1              10                  $2.5              $25
Nombre 2              11                  $2                $22
Nombre 3              9                   $3                $27
Nombre 4              5                   $4                $20
Nombre 5              12                  $2                $24
 * @author Santiago Sánchez
 * @version 1.0
 */
public class Ejercicio04_NominaEmpresa {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre, result;
        int dias;
        double costoDia, cantCancelar;
        for (int cont = 1; cont <= 5; cont++) {
            System.out.println("Empleado: " + cont);
            System.out.print("Nombre: ");
            nombre = tcl.nextLine();
            System.out.print("Nro de dias trabajados: ");
            dias = tcl.nextInt();
            System.out.print("Costo del dia: ");
            costoDia = tcl.nextDouble();
            cantCancelar = dias * costoDia;
            result = tcl.nextLine();
            result += "Empleado " + cont + dias + costoDia + cantCancelar;
        }
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 */
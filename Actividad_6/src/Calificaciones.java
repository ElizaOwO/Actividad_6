/*
Importar libreria de la clase
Scanner para leer la entrada de datos
 */
import java.util.Scanner;

//Clase Calificaciones
public class Calificaciones {

    //Declarar variables
    static int calificaciones []= new int[5];
    static float promedio=0;
    static String nombre;

    //Clase principal
    public static void main(String[] arg) {

        //Instancia de la clase Scanner
        Scanner sc= new Scanner (System.in);

        //Pedir nombre
        System.out.print("Ingresa tu nombre: ");
        nombre = sc.next();

        //Pedir calificaciones
        for (int i=0; i<5; i++){
            System.out.print("Ingresa tu calificación "+ (i+1) + " :");
            calificaciones[i] = sc.nextInt();
        }
        System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
        imprimir ();
    }

    private static float calcularpromedio (int calificaciones[]){
        for (int i=0; i<5; i++){
            promedio+=calificaciones[i];
        }
        return promedio/5;
    }

    private static char calificacionFinal (float promedio){
        char calificacionChar;

        calificacionChar=(0<promedio && promedio<=50)?'F':
              (50<promedio && promedio<61)?'E':
              (60<promedio && promedio<71)?'D':
              (70<promedio && promedio<81)?'C':
              (80<promedio && promedio<91)?'B':'A';

        return calificacionChar;
    }

    private static void imprimir (){
        System.out.println("\nNombre del estudiante: "+ nombre);
        for (int i=0; i<5; i++){
            System.out.println("Calificación "+ (i+1) + (" : ") + calificaciones[i]);
        }
        System.out.println("Promedio: "+ calcularpromedio (calificaciones));
        System.out.println("Calificación: "+ calificacionFinal(promedio));
    }
}

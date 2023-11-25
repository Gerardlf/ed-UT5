import java.util.Scanner;

public class UT5 {
    public static void main (String [] args) {
        int h, a, c, tp;

        Scanner leer = new Scanner(System.in);
        //preparo el escaner para leer desde el teclado

        System.out.println("Introduce el número de hormigas capturadas: ");

        //leo número de hormigas y lo múltiplico por su número de patas (6).
        h= leer.nextInt();
        h= h * 6;

        System.out.println("Introduce el número de arañas capturadas: ");

        //leo número de arañas y lo múltiplico por su número de patas (8).
        a= leer.nextInt();
        a= a * 8;

        System.out.println("Introduce el número de cochinillas capturadas: ");

        //leo número de cochinillas y lo múltiplico por su número de patas (14).
        c= leer.nextInt();
        c= c * 14;

        //sumo número total de patas capturadas durante la jornada.

        tp = h + a +c;
        System.out.println("El número total de patas es: "+tp);


    }
}
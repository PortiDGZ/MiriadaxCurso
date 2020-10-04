import java.util.Scanner;

public class Practica1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Introduce el primer integer: ");

        int primero = input.nextInt();

        System.out.println("Introduce el segundo integer: ");

        int segundo = input.nextInt();

        System.out.println("Introduce el float (coma flotante): ");

        float tercero = input.nextFloat();

        input.nextLine();

        System.out.print("Introduce el primer string: ");

        String cuarto = input.nextLine();

        System.out.print("Introduce el segundo string: ");

        String quinto = input.nextLine();

        System.out.println("Suma de los tres números: ");

        double suma = primero + segundo + tercero;

        System.out.println(suma);

        System.out.println("Comparación de los dos enteros: ");

        int mayor = Math.max(primero, segundo);

        System.out.println(mayor);

        System.out.println("Se visualiza el resultado de la división del float con el resto de la división de los dos enteros: ");

        double resto = primero % segundo;

        double division = tercero / resto;

        System.out.println("El resultado de la división es: " + division);

        String sexto = cuarto.concat(quinto);

        System.out.println(sexto);

        input.close();

    }

}
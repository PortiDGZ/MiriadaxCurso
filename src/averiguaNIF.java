import java.util.Scanner;

public class averiguaNIF {

    static final int division = 23;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };

        System.out.println("Introduce un número de NIF válido (sin letra): ");

        int NIF = Integer.parseInt(sc.nextLine());

        int letra = NIF % 23;

        String nifFinal = "" + NIF + letras[letra];

        System.out.println(nifFinal);

    }
}

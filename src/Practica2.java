public class Practica2 {

    public static void main(String[] args) {

        int contador = (int) (Math.random() * (19 - 1)) + 1;

        for (int i = 0; i < contador; i++) {

            int numrand = (int) (Math.random() * (65 - 18) + 18);

            System.out.println(numrand);

        }

    }
}

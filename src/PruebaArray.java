public class PruebaArray {

    public static void main(String[] args) {

        GeneraArray Array1 = new GeneraArray();

        GeneraArray Array2 = new GeneraArray();

        Array1.rellenar();


        for (int i = 0; i < Array1.ArrayInt.length; i++) {
            System.out.println(Array1.ArrayInt[i]);
        }


        Array2.rellenar(6);

        System.out.println(Array2);

        Array2.ordenar();

        for (int i = 0; i < Array2.ArrayInt.length; i++) {

            System.out.println(Array2.ArrayInt[i]);

        }



    }
}

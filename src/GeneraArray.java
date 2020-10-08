import java.util.Arrays;

public class GeneraArray {

     int[] ArrayInt = new int[6];

    public GeneraArray(){
        this.ArrayInt = ArrayInt;
    }

    public GeneraArray(int i){

        this.ArrayInt = ArrayInt;

    }

    public void rellenar(int i){

        Arrays.fill(ArrayInt, i);

    }

    public void rellenar(){

        int random = 0;

        for (int i = 0; i < ArrayInt.length; i++) {
            random = (int) (Math.random()*(49-1)+1);
            Arrays.fill(ArrayInt, random);
        }

    }

    public void ordenar(){

        Arrays.sort(ArrayInt);

    }

    public void visualizar(){


        for (int n: ArrayInt
             ) {

            System.out.println(ArrayInt[n]);

        }


    }


}

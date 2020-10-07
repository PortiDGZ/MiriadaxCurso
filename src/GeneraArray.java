import java.util.Random;
import java.util.Arrays;

public class GeneraArray {

     int[] ArrayInt = new int[6];

    Random generator = new Random();

    public GeneraArray(){
        this.ArrayInt = ArrayInt;
    }

    public GeneraArray(int i){

        this.ArrayInt = ArrayInt;

    }

    public void rellenar(int i){

        Arrays.fill(ArrayInt, i);

    };

    public void rellenar(){

        for (int n: ArrayInt
             ) {
            Arrays.fill(ArrayInt, generator.nextInt(49));
        }




    };

    public void ordenar(){

        Arrays.sort(ArrayInt);

    };

    public void visualizar(){


        for (int n: ArrayInt
             ) {

            System.out.println(ArrayInt[n]);

        }


    };



}

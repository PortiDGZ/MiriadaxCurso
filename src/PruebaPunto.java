import java.util.Random;

public class PruebaPunto {

    public static void main(String[] args) {

        //Creación de objetos de tipo Punto
        Punto primero = new Punto();

        Punto segundo = new Punto(2,5);

        Punto tercero = new Punto(segundo);

        //Utilización del método pintar() para mostrar los puntos

        primero.pintar();

        segundo.pintar();

        tercero.pintar();

        //Creación de un array tipo Punto con tamaño aleatorio no mayor a 20

        Random aleatorio = new Random();

        int limite = aleatorio.nextInt(20);

        Punto[] array = new Punto[limite];

        //Almacenamiento de puntos aleatorios entre 0 y 100

        Punto n = new Punto(1,1);

        for (int i = 0; i < array.length; i++){

            n.setPunto1(aleatorio.nextInt(100));
            n.setPunto2(aleatorio.nextInt(100));

            array[i] = n;

            n.pintar();

        }

    }

}

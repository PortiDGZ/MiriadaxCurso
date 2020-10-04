public class Punto {

    private int punto1;

    private int punto2;

    public Punto(){

        punto1 = 3;

        punto2 = 7;

    }

    public Punto(int num1, int num2){

        punto1 = num1;

        punto2 = num2;

    }

    public Punto(Punto objetoPunto){

        punto1 = objetoPunto.punto1;

        punto2 = objetoPunto.punto2;

    }

    void pintar(){

    System.out.println(punto1 + "," + punto2);

    };

    public int getPunto1() {
        return punto1;
    }

    public void setPunto1(int punto1) {
        this.punto1 = punto1;
    }

    public int getPunto2() {
        return punto2;
    }

    public void setPunto2(int punto2) {
        this.punto2 = punto2;
    }
}

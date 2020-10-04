public class test2 {

    public static void main(String[] args) {

        int i=0;

        while(i++<10){

            if (++i%3!=0) continue;

            System.out.print (" El numero es "+i);

        }

    }
}

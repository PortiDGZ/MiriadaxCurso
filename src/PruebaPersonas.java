public class PruebaPersonas {

    public static void main(String[] args) {

        Persona persona = new Persona();

        Persona persona1 = new Persona(persona);

        Persona persona2 = new Persona("Paula", (byte) 17, 'M',"49729993Z", false);

        Empleado empleado = new Empleado();

        Empleado empleado1 = new Empleado(empleado);

        Empleado empleado2 = new Empleado(empleado, "1", 1500);

        Empleado empleado3 = new Empleado(persona2, "2", 2000);


    }

}

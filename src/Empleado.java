public class Empleado extends Persona {

    private String idpersonal;
    private float sueldo;

    public Empleado(){

    }

    public Empleado(Empleado emp){


    }

    public Empleado(Persona persona, String idpersonal, float sueldo){

        super(persona);

        this.idpersonal = idpersonal;

        this.sueldo = sueldo;


    }


    public Empleado(String nombre, byte edad, char sexo, String dni, boolean bCasado, String idpersonal, float sueldo){

        super(nombre, edad, sexo, dni, bCasado);

        this.idpersonal = idpersonal;

        this.sueldo = sueldo;

    }

    public String getIdpersonal() {
        return idpersonal;
    }

    public void setIdpersonal(String idpersonal) {
        this.idpersonal = idpersonal;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "idpersonal='" + idpersonal + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }

    @Override
    void pintar() {
        ;
    }
}

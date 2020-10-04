import java.time.Period;
import java.util.Objects;

public class Persona {

    private String nombre;
    private byte edad;
    private char sexo;
    private String dni;
    private boolean bCasado;

    public Persona(){

        this.nombre = nombre;

        this.edad = edad;

        this.sexo = sexo;

        this.dni = dni;

        this.bCasado = bCasado;

    }

    public Persona(Persona persona){

        nombre = persona.nombre;

        edad = persona.edad;

        sexo = persona.sexo;

        dni = persona.dni;

        bCasado = persona.bCasado;

    }

    public Persona(String nombre, byte edad, char sexo, String dni, boolean bCasado){

        this.nombre = nombre;

        this.edad = edad;

        this.sexo = sexo;

        this.dni = dni;

        this.bCasado = bCasado;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public boolean isbCasado() {
        return bCasado;
    }

    public void setbCasado(boolean bCasado) {
        this.bCasado = bCasado;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Persona persona = (Persona) obj;
        return getEdad() == persona.getEdad() &&
                getSexo() == persona.getSexo() &&
                isbCasado() == persona.isbCasado() &&
                getNombre().equals(persona.getNombre()) &&
                getDni().equals(persona.getDni());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getEdad(), getSexo(), getDni(), isbCasado());
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", dni='" + dni + '\'' +
                ", bCasado=" + bCasado +
                '}';
    }

    void pintar(){

        toString();

    }
}

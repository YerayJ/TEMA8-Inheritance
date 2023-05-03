package ejercicios.interfaces.ejercicio1;

public class Socio implements Comparable {
    /**
     * Atributo que contiene el id del socio
     */
    private int id;
    /**
     * Atributo que contiene el nombre
     */
    private String nombre;
    /**
     * Atributo que contiene la edad
     */
    private int edad;

    /**
     * Constructor con parámetros
     *
     * @param id     Contiene el id
     * @param nombre Contiene el nombre
     * @param edad   Contiene la edad
     */
    public Socio(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        if (edad < 18) {
            edad = 18;
        }
        this.edad = edad;
    }

    /**
     * Método que imprime los atributos
     *
     * @return Devuelve los strings
     */
    @Override
    public String toString() {
        return "Socio " +
                "id: " + id +
                ", nombre: " + nombre + '\'' +
                ", edad: " + edad;
    }

    @Override
    public int compareTo(Object o) {
        // Crea un atributo auxiliar que contiene el resultado
        int res = 0;
        // Atributoq
        Socio socio = (Socio) o;


        return res;
    }
}

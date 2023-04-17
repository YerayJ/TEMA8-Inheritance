package ejercicios.ejercicio2;

/**
 * Clase Empleado
 */
public class Empleado {
    /**
     * Atributo que contiene el nombre
     */
    private String nombre = "";

    /**
     * Constructor por defecto
     */
    public Empleado() {
        // Constructor sin parámetros
    }

    /**
     * Constructor con parámetros
     *
     * @param nombre Contiene el nombre
     */
    public Empleado(String nombre) {
        this.nombre = nombre; // Asigna el nombre
    }

    /**
     * Getter
     * @return Devuelve el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter
     * @param nombre Contiene el nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre; // Asigna el nombre
    }

    /**
     * Método que convierte los atributos a una cadena
     * @return Devuelve una cadena
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre;
    }
}

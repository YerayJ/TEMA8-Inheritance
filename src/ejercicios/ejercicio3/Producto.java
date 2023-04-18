package ejercicios.ejercicio3;

/**
 * Clase Producto
 */
public class Producto {
    /**
     * Atributo que contiene el nombre
     */
    protected String nombre;
    /**
     * Atributo que contiene el precio
     */
    protected double precio;

    /**
     * Constructor con parámetros
     *
     * @param nombre Contiene el nombre
     * @param precio Contiene el precio
     */
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        if (precio < 0) { // Comprueba que el precio no es negativo
            precio = 0; // Se le asigna 0
        }
        this.precio = precio; // Asigna el precio al atributo precio
    }

    /**
     * Constructor por defecto
     */
    public Producto() {
        // Constructor por defecto
    }

    /**
     * Getter
     *
     * @return Devuelve el nombre
     */
    public String getNombre() {
        return nombre; // Devuelve el nombre
    }

    /**
     * Setter
     *
     * @param nombre Contiene el nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre; // Asigna el nombre
    }

    /**
     * Getter
     *
     * @return Devuelve el precio
     */
    public double getPrecio() {
        return precio; // Devuelve el precio
    }

    /**
     * Setter
     *
     * @param precio Contiene el precio
     */
    public void setPrecio(double precio) {
        this.precio = precio; // Asigna el precio
    }

    /**
     * Método para crear una cadena con los atributos
     *
     * @return Devuelve la cadena con los atributos
     */
    @Override
    public String toString() {
        return "Producto " +
                "nombre " + nombre +
                ", precio " + precio;
    }

    /**
     * Método para calcular el precio total de varios productos
     *
     * @param cant Contiene la cantidad de productos
     * @return Devuelve el precio total
     */
    public double calcular(int cant) {
        return precio * cant; // Multiplica el precio por la cantidad de productos
    }

}

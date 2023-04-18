package ejercicios.ejercicio3;

/**
 * Clase no perecedero
 */
public class NoPerecedero extends Producto {
    /**
     * Atributo con el tipo del producto
     */
    protected String tipo;

    /**
     * Getter
     *
     * @return Devuelve el tipo de producto
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Setter
     *
     * @param tipo Contiene el tipo de producto
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Constructor con todos los parámetros
     *
     * @param nombre Contiene el nombre del producto
     * @param precio Contiene el precio del producto
     * @param tipo   Contiene el tipo de producto
     */
    public NoPerecedero(String nombre, double precio, String tipo) {
        super(nombre, precio); // Llama a la clase padre para obtener los atributos
        this.tipo = tipo; // Asigna el valor a tipo
    }

    /**
     * Método para pasar los atributos a una cadena String
     *
     * @return Devuelve una cadena
     */
    @Override
    public String toString() {
        return "No perecedero " +
                "Tipo " + tipo + " " + super.toString();
    }

    /**
     * Método para calcular el precio total de varios productos
     *
     * @param cant Contiene la cantidad de productos
     * @return Devuelve el precio total
     */
    public double calcular(int cant) {
        return super.calcular(cant); // Multiplica el precio por la cantidad de productos
    }

}

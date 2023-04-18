package ejercicios.ejercicio3;

/**
 * Clase perecedera
 */
public class Perecedero extends Producto {
    /**
     * Atributo con los días restantes para que caduque el producto
     */
    protected int diasCaducidad;

    /**
     * Getter
     *
     * @return Devuelve los dias de caducidad
     */
    public int getDiasCaducidad() {
        return diasCaducidad;
    }

    /**
     * Setter
     *
     * @param diasCaducidad Contiene los días de caducidad
     */
    public void setDiasCaducidad(int diasCaducidad) {
        this.diasCaducidad = diasCaducidad;
    }

    /**
     * Constructor con todos los parámetros
     *
     * @param nombre        Contiene el nombre del producto
     * @param precio        Contiene el precio del producto
     * @param diasCaducidad Contiene la caducidad del producto
     */
    public Perecedero(String nombre, double precio, int diasCaducidad) {
        super(nombre, precio); // Llama a la clase padre para obtener los atributos
        if (diasCaducidad < 0) { // Comprueba que los días de caducidad no sean menos que 0
            diasCaducidad = 0;
        }
        this.diasCaducidad = diasCaducidad; // Asigna el valor a diasCaducidad
    }

    /**
     * Método para pasar los atributos a una cadena String
     *
     * @return Devuelve una cadena
     */
    @Override
    public String toString() {
        return "Perecedero " +
                "Días de caducidad " + diasCaducidad + " " + super.toString();
    }

    /**
     * Método para calcular el precio total de varios productos
     *
     * @param cant Contiene la cantidad de productos
     * @return Devuelve el precio total
     */
    public double calcular(int cant) {
        int devaluacion = 0; // Atributo para guardar la devaluación del producto
        // Comprueba cuántos días le quedan de caducidad y asigna un valor
        switch (diasCaducidad) {
            case 1 -> {
                devaluacion = 4;
            }
            case 2 -> {
                devaluacion = 3;
            }
            case 3 -> {
                devaluacion = 2;
            }
        }
        return super.calcular(cant) / devaluacion; // Divide el precio según su devaluación
    }

}

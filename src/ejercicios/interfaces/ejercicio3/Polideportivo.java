package ejercicios.interfaces.ejercicio3;

/**
 * Clase Polideportivo
 */
public class Polideportivo implements InstalacionDeportiva, Edificio {
    /**
     * Atributo que contiene la superficie
     */
    private double superficie;
    /**
     * Atributo que contiene el nombre
     */
    private String nombre;
    /**
     * Contiene el tipo de polideportivo
     */
    private int tipo;

    /**
     * Constructor con parámetros
     * @param superficie Contiene la superficie
     * @param nombre Contiene el nombre
     * @param tipo Contiene el tipo
     */
    public Polideportivo(double superficie, String nombre, int tipo) {
        if (superficie <= 0) {
            superficie = 2;
        }
        this.superficie = superficie;
        this.nombre = nombre;
        if (tipo <= 0) {
            tipo = 1;
        }
        this.tipo = tipo;
    }

    /**
     * Getter
     * @return Devuelve la superficie del edificio
     */
    @Override
    public double getSuperficieEdificio() {
        return superficie;
    }

    /**
     * Getter
     * @return Devuelve el tipo de instalación
     */
    @Override
    public int getInstalacionDeportiva() {
        return tipo;
    }

    /**
     * Método toString
     * @return Devuelve una cadena
     */
    @Override
    public String toString() {
        return "Polideportivo " +
                "superficie " + superficie +
                ", nombre " + nombre +
                ", tipo " + tipo;
    }
}

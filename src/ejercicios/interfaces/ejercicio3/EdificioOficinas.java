package ejercicios.interfaces.ejercicio3;

/**
 * Clase Edificio con oficinas
 */
public class EdificioOficinas implements Edificio {
    /**
     * Atributo que contiene la superficie
     */
    private double superficie;
    /**
     * Atributo que contiene el número de oficinas que hay
     */
    private int numeroOficinas;

    /**
     * Constructor por defecto
     * @param superficie Contiene la superficie del edificio
     * @param numeroOficinas Contiene el número de oficinas total
     */
    public EdificioOficinas(double superficie, int numeroOficinas) {
        if (superficie <= 0) {
            superficie = 2;
        }
        this.superficie = superficie;
        if (numeroOficinas <= 0) {
            numeroOficinas = 1;
        }
        this.numeroOficinas = numeroOficinas;
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
     * @return Devuelve el número de oficinas
     */
    public int getNumeroOficinas() {
        return numeroOficinas;
    }

    /**
     * Método To String
     * @return Devuelve una cadena
     */
    @Override
    public String toString() {
        return "Oficina " +
                "superficie " + superficie +
                ", numeroOficinas " + numeroOficinas;
    }
}

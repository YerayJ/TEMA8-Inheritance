package ejercicios.ejercicio5;

/**
 * Clase Polígono
 */
abstract public class Poligono {
    /**
     * Atributo que contiene los lados
     */
    protected int numeroLados;

    /**
     * Constructor con parámetros
     * @param numeroLados Contiene los lados
     */
    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    /**
     * Getter
     * @return Devuelve el número de lados
     */
    public int getNumeroLados() {
        return numeroLados;
    }

    /**
     * Método para convertir los atributos en cadena
     * @return Devuelve una cadena
     */
    public String toString() {
        return " Número de lados: " + numeroLados;
    }

    /**
     * Método abstracto que calcula el área
     * @return Devuelve el área total de un polígono
     */
    abstract double area();
}

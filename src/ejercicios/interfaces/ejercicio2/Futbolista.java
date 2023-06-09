package ejercicios.interfaces.ejercicio2;

/**
 * Clase Futbolista
 */
public class Futbolista implements Comparable<Futbolista> {
    /**
     * Contiene el número de la camiseta
     */
    private int numCamiseta;
    /**
     * Contiene el nombre del jugador
     */
    private String nombre;
    /**
     * Contiene la edad del jugador
     */
    private int edad;
    /**
     * Contiene la cantidad de goles del jugador
     */
    private int numeroGoles;

    /**
     * Constructor con parámetros
     *
     * @param numCamiseta Contiene el número de la camiseta
     * @param nombre      Contiene el nombre
     * @param edad        Contiene la edad
     * @param numeroGoles Contiene el número de goles
     */
    public Futbolista(int numCamiseta, String nombre, int edad, int numeroGoles) {
        if (numCamiseta <= 0 || numCamiseta > 99) {
            numCamiseta = 1;
        }
        this.numCamiseta = numCamiseta;
        this.nombre = nombre;
        if (edad < 15) {
            edad = 15;
        }
        this.edad = edad;
        if (numeroGoles < 0) {
            numeroGoles = 0;
        }
        this.numeroGoles = numeroGoles;
    }

    /**
     * Método toString
     *
     * @return Devuelve una cadena
     */
    @Override
    public String toString() {
        return "Futbolista " +
                "numCamiseta " + numCamiseta +
                ", nombre " + nombre + '\'' +
                ", edad " + edad +
                ", numeroGoles " + numeroGoles;
    }

    /**
     * Compara un futbolista por su número de camiseta o su nombre
     *
     * @param o Objeto pasado
     * @return Devuelve el estado
     */
    public boolean equals(Object o) {
        // Atributo booleano para comprobar el estado
        boolean estado = false;

        // Cast al objeto
        Futbolista f1 = (Futbolista) o;

        // Comparación de los números de camiseta
        if (this.numCamiseta == f1.numCamiseta && this.nombre.equals(f1.nombre)) {
            estado = true;
        }
        return estado;
    }

    public int compareTo(Futbolista f1) {
        // Variable que contiene el resultado
        int res;
        // Comprueba si es mayor
        if (this.numCamiseta > f1.numCamiseta) {
            res = 1;
        } // Comprueba si es menor
        else if (this.numCamiseta < f1.numCamiseta) {
            res = -1;
        } // Comprueba si el nombre es igual con el compareto de las Strings
        else {
            res = this.nombre.compareTo(f1.nombre);
        }
        return res;
    }

}

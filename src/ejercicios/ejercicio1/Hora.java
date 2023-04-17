package ejercicios.ejercicio1;

/**
 * Clase Hora
 */
public class Hora {
    /**
     * Atributo hora
     */
    private int hora;
    /**
     * Atributo minuto
     */
    private int minuto;

    /**
     * Constructor con parámetros
     *
     * @param hora   Contiene la hora
     * @param minuto Contiene los minutos
     */
    public Hora(int hora, int minuto) {
        if (hora > 23 || hora < 0) { // Comprueba si la hora está fuera del rango
            hora = 0; // Si es asi la hora se le da valor de 0
        } else if (minuto > 59 || minuto < 0) { // Comprueba si los minutos están fuera del rango
            minuto = 0; // Si es asi los minutos se le da valor de 0
        }
        // Se le asigna los valores una vez comprobado
        this.hora = hora;
        this.minuto = minuto;
    }

    /**
     * Método para incrementar en uno los minutos
     */
    public void inc() {
        this.minuto++; // Incrementa los minutos en uno
        if (this.minuto > 59) { // Comprueba si los minutos han pasado a una hora
            this.minuto = 0; // Se asigna 0 a los minutos
            this.hora++; // Se le suma uno a la hora
        }
    }

    /**
     * Setter
     * @param valor El valor a asignar
     * @return Devuelve el estado de la operación
     */
    boolean setMinutos(int valor) {
        boolean estado = false; // Atributo de tipo boolean
        if (valor >= 0 && valor < 60) { // Comprueba que los minutos sean correctos
            this.minuto = valor; // Asigna valor a minuto
        }
        return estado; // Devuelve el estado de la operación
    }

    /**
     * Setter
     * @param valor El valor a asignar
     * @return Devuelve el estado de la operación
     */
    boolean setHora(int valor) {
        boolean estado = false; // Atributo de tipo boolean
        if (valor >= 0 && valor < 24) { // Comprueba que la hora sea correcta
            this.minuto = valor; // Asigna valor a la hora
        }
        return estado; // Devuelve el estado de la operación
    }

    /**
     * Método para convertir en String
     * @return Devuelve una string
     */
    public String toString() {
        return (this.hora <= 9 ? "0" + this.hora : this.hora) + ":" + (this.hora <= 9 ? "0" + this.minuto : this.minuto);
    }
}

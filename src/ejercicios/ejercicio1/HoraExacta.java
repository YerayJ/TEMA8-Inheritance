package ejercicios.ejercicio1;

/**
 * Clase hora exacta
 */
public class HoraExacta extends Hora {
    /**
     * Atributo que contiene los segundos
     */
    private int segundo;

    /**
     * Constructor con parámetros
     *
     * @param hora    Contiene la hora
     * @param minuto  Contiene los minutos
     * @param segundo Contiene los segundos
     */
    public HoraExacta(int hora, int minuto, int segundo) {
        super(hora, minuto); // Llama al constructor de la clase padre
        if (segundo < 0 || segundo > 59) { // Comprueba que los segundos están correctos
            segundo = 0; // Asigna los segundos
        }
        this.segundo = segundo; // Se asignan los segundos
    }

    public boolean setSegundo(int valor) {
        boolean estado = false;
        if (segundo < 0 || segundo > 59) { // Comprueba que los segundos están correctos
            valor = 0; // Asigna los segundos
        }
        this.segundo = valor; // Se asignan los segundos
        return estado;
    }

    /**
     * Método que incrementa en uno los segundos
     */
    @Override
    public void inc() {
        this.segundo++; // Incrementa los segundos en uno
        if (segundo > 59) { // Si los segundos se sobrepasan
            this.segundo = 0;  // Le da valor 0 a segundos
            super.inc(); // Llama a la función incremento de la clase padre
        }
    }

    /**
     * Método que devuelve una String con todos los atributos
     * @return Devuelve una String
     */
    @Override
    public String toString() {
        return super.toString() + ":" + (this.segundo <= 9 ? "0" + this.segundo : this.segundo);
    }
}

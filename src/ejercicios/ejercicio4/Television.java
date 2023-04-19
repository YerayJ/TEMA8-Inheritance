package ejercicios.ejercicio4;

/**
 * Clase television hija de Electrodoméstico
 */
public class Television extends Electrodomestico {
    /**
     * Atributo que delimita las pulgadas
     */
    protected int resolucion = 20;
    /**
     * Atributo que contiene si tiene o no sintonizador
     */
    protected boolean sintonizadorTDT = false;

    /**
     * Constructor por defecto
     */
    public Television() {
    }

    /**
     * Constructor con parámetros
     *
     * @param precioBase Contiene el precio
     * @param peso       Contiene el peso
     */
    public Television(double precioBase, double peso) {
        super(precioBase, peso);
    }

    /**
     * Constructor con todos los parámetros
     *
     * @param precioBase        Contiene el precio base
     * @param peso              Contiene el peso
     * @param color             Contiene el color
     * @param consumoEnergetico Contiene el consumo energético
     * @param resolucion        Delimita las pulgadas
     */
    public Television(double precioBase, double peso, String color, String consumoEnergetico, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, peso, color, consumoEnergetico);
        if (resolucion < 20) { // Comprueba que la resolución no es errónea
            resolucion = 20; // Asigna el valor
        }
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    /**
     * Getter
     *
     * @return Devuelve la resolución
     */
    public int getResolucion() {
        return resolucion;
    }

    /**
     * Getter
     *
     * @return Devuelve si tiene sintonizador o no
     */
    public boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    /**
     * Método que calcula el precio final
     *
     * @return Devuelve el precio final
     */
    @Override
    public double precioFinal() {
        double incremento = super.precioFinal();
        if (resolucion > 40) { // Comprueba que la resolución es superior a 40
            incremento += incremento * 0.3; // Incrementa su valor en un 30 por ciento
        }
        if (sintonizadorTDT) { // Comprueba que tiene sintonizador
            incremento += 50; // Incrementa el valor en 50
        }
        return incremento; // Devuelve el incremento
    }
}

package ejercicios.ejercicio4;

/**
 * Clase lavadora hija de Electrodoméstico
 */
public class Lavadora extends Electrodomestico {
    /**
     * Atributo que delimita el peso de carga
     */
    protected int carga = 5;

    /**
     * Constructor por defecto
     */
    public Lavadora() {
    }

    /**
     * Constructor con parámetros
     *
     * @param precioBase Contiene el precio
     * @param peso       Contiene el peso
     */
    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
    }

    /**
     * Constructor con todos los parámetros
     *
     * @param precioBase        Contiene el precio base
     * @param peso              Contiene el peso
     * @param color             Contiene el color
     * @param consumoEnergetico Contiene el consumo energético
     * @param carga             Contiene la carga
     */
    public Lavadora(double precioBase, double peso, String color, String consumoEnergetico, int carga) {
        super(precioBase, peso, color, consumoEnergetico);
        this.carga = carga; // Asigna el valor
    }

    /**
     * Getter
     *
     * @return Devuelve el peso de la carga
     */
    public int getCarga() {
        return carga;
    }

    /**
     * Método que calcula el precio final
     *
     * @return Devuelve el precio final
     */
    @Override
    public double precioFinal() {
        // Comprueba que la carga es superior a 30
        return (carga > 30) ? super.precioFinal() + 50 : super.precioFinal();
    }
}

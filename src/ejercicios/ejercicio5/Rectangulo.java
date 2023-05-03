package ejercicios.ejercicio5;

public class Rectangulo extends Poligono {
    /**
     * Atributos que contienen los lados
     */
    private double lado1, lado2;

    /**
     * Constructor por defecto
     */
    public Rectangulo() {
        super(4);
    }

    /**
     * Constructor con parámetros
     *
     * @param lado1 Contiene el primer lado
     * @param lado2 Contiene el segundo lado
     */
    public Rectangulo(double lado1, double lado2) {
        // Le pasa por parámetros 4 lados
        super(4);
        // Comprueba que los lados no sean 0 o menos
        if (lado1 <= 0) {
            lado1 = 1;
        }
        this.lado1 = lado1;
        if (lado2 <= 0) {
            lado2 = 1;
        }
        this.lado2 = lado2;
    }

    /**
     * Getter
     *
     * @return Devuelve el lado 1
     */
    public double getLado1() {
        return lado1;
    }

    /**
     * Setter
     *
     * @param lado1 Contiene el lado 1
     */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    /**
     * Getter
     *
     * @return Devuelve el lado 2
     */
    public double getLado2() {
        return lado2;
    }

    /**
     * Setter
     *
     * @param lado2 Contiene el lado 2
     */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    /**
     * Método toString
     * @return Devuelve una string con todos los atributos
     */
    @Override
    public String toString() {
        return " Rectángulo" +
                " Lado1 " + lado1 + " centímetros" +
                " Lado2 " + lado2 + " centímetros" +
                " Área " + area() +
                super.toString();
    }

    /**
     * Calcula el área del rectángulo
     * @return Devuelve el área
     */
    @Override
    double area() {
        return lado1 * lado2; // Calcula el área multiplicando lado por lado
    }
}

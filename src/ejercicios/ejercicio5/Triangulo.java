package ejercicios.ejercicio5;

public class Triangulo extends Poligono {
    /**
     * Atributos que contienen los lados
     */
    private double lado1, lado2, lado3;

    /**
     * Constructor por defecto
     */
    public Triangulo() {
        super(3);
    }

    /**
     * Constructor con parámetros
     *
     * @param lado1 Contiene el primer lado
     * @param lado2 Contiene el segundo lado
     * @param lado3 Contiene el tercer lado
     */
    public Triangulo(double lado1, double lado2, double lado3) {
        // Le pasa por parámetros 4 lados
        super(3);
        // Comprueba que los lados no sean 0 o menos
        if (lado1 <= 0) {
            lado1 = 1;
        }
        this.lado1 = lado1;
        if (lado2 <= 0) {
            lado2 = 1;
        }
        this.lado2 = lado2;
        if (lado3 <= 0) {
            lado3 = 1;
        }
        this.lado3 = lado3;
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
     * Getter
     * @return Devuelve el lado 3
     */
    public double getLado3() {
        return lado3;
    }

    /**
     * Setter
     * @param lado3 Devuelve el lado 3
     */
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    /**
     * Método toString
     * @return Devuelve una string con todos los atributos
     */
    @Override
    public String toString() {
        return " Tríangulo" +
                " Lado1 " + lado1 + " centímetros" +
                " Lado2 " + lado2 + " centímetros" +
                " Lado3 " + lado3 + " centímetros" +
                " Área " + this.area() +
                super.toString();
    }

    /**
     * Calcula el área del rectángulo
     * @return Devuelve el área
     */
    public double area() {
        final double s = (this.lado1 + this.lado2 + this.lado3) / 2.0d;

        return Math.sqrt(s * (s - this.lado1) * (s - this.lado2) * (s - this.lado3));
    }
}

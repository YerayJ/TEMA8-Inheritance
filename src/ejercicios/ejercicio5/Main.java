package ejercicios.ejercicio5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creación de arrays de polígonos
        Poligono poligonos[] = new Poligono[0];
        // Atributo que guarda la opción
        int opc;
        // Escáner para leer datos
        Scanner key = new Scanner(System.in);
        // Creación de atributos para cada lado
        double lado1, lado2, lado3;
        do {
            menu(); // Ejecuta el método menú
            opc = key.nextInt();

            switch (opc) {
                case 1 -> {
                    // Introduce los datos
                    System.out.println("Introduzca el primer lado: ");
                    lado1 = key.nextDouble();
                    key.nextLine();
                    System.out.println("Introduzca el segundo lado: ");
                    lado2 = key.nextDouble();
                    key.nextLine();
                    System.out.println("Introduzca el tercer lado: ");
                    lado3 = key.nextDouble();
                    key.nextLine();
                    // Amplia el espacio del array
                    poligonos = Arrays.copyOf(poligonos, poligonos.length + 1);

                }

            }

        } while (opc != 4);
    }

    /**
     * Método que ejecuta el menú
     */
    static public void menu() {
        System.out.println("---------MENÚ---------\n"
                + "1. Introducir triángulo.\n"
                + "2. Introducir rectángulo.\n"
                + "3. Mostrar contenido del array.\n"
                + "4. Salir.\n"
        );
    }
}

package ejercicios.ejercicio4;

public class Main {
    public static void main(String[] args) {
        // Creación de array de 10 posiciones
        Electrodomestico electrodomesticos[] = {
                new Electrodomestico(),
                new Electrodomestico(50, 80),
                new Electrodomestico(80, 10, "Azul", "F"),
                new Lavadora(),
                new Lavadora(100, 40),
                new Lavadora(150, 10, "Blanco", "A", 15),
                new Television(),
                new Television(160, 200),
                new Television(300, 20, "Negro", "C", 50, false),
                new Television(90, 7, "Rojo", "D", 22, true)
        };

        // Creación de atributos para guardar el precio total
        double precioElectrodomestico = 0, precioLavadora = 0, precioTelevision = 0;

        // Recorre el array
        for (int i = 0; i < electrodomesticos.length; i++) {
            // Comprueba como parámetro de entrada que tipo de clase es
            switch (electrodomesticos[i].getClass().getSimpleName()) {
                case "Electrodomestico" -> {
                    System.out.println("--Electrodomestico--");
                    precioElectrodomestico += electrodomesticos[i].precioFinal();
                }
                case "Television" -> {
                    System.out.println("--Television--");
                    precioTelevision += electrodomesticos[i].precioFinal();
                }
                case "Lavadora" -> {
                    System.out.println("--Lavadora--");
                    precioLavadora += electrodomesticos[i].precioFinal();
                }
            }
            System.out.println("Precio base: " + electrodomesticos[i].precioBase + " €"
                    + " Precio final: " + electrodomesticos[i].precioFinal() + " €"
            );
        }

        // Imprime el total de todo
        System.out.println("\nTOTAL\n----------------------------------\nPrecio total de las lavadoras es: "
                + precioLavadora + " €");
        System.out.println("----------------------------------\nPrecio total de las televisiones es: "
                + precioTelevision + " €");
        System.out.println("----------------------------------\nPrecio total de los electrodomésticos es: "
                + precioElectrodomestico + " €");
        System.out.println("----------------------------------\nPrecio total de todos los electrodomésticos es: "
                + (precioElectrodomestico + precioTelevision + precioLavadora) + " €");

    }
}

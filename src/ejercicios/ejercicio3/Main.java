package ejercicios.ejercicio3;

public class Main {
    public static void main(String[] args) {
        // Creación de array con productos
        Producto productos[] = {new Producto("Balón", 20.99),
                new Perecedero("Leche", 4, 2),
                new Perecedero("Yogur", 1.25, 1),
                new NoPerecedero("Sopa", 2, "Líquido"),
                new NoPerecedero("Arroz", 1.5, "Cereal")};

        int cant = 5; // Cantidad de productos a comprar
        double precioTotal = 0;
        // Recorre el array
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i]);
            precioTotal += productos[i].calcular(cant);
        }
        System.out.printf("EL precio total es %.2f", precioTotal);
    }
}

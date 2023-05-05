package ejercicios.interfaces.ejercicio3;

public class Main {
    public static void main(String[] args) {
        // Creación de arrays
        Polideportivo polideportivos[] = {
                new Polideportivo(30, "Hytasa", 2),
                new Polideportivo(100, "UPO", 5)
        };

        EdificioOficinas edificioOficinas[] = {
                new EdificioOficinas(30, 10),
                new EdificioOficinas(150, 30)
        };

        for (Polideportivo polideportivo : polideportivos) {
            System.out.println(polideportivo);
        }
        System.out.println("\n");
        for (EdificioOficinas oficina: edificioOficinas) {
            System.out.println(oficina);
        }

    }
}

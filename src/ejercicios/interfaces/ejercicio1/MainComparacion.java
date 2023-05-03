package ejercicios.interfaces.ejercicio1;

public class MainComparacion {
    public static void main(String[] args) {
        // Creación de objetos
        Socio s1 = new Socio(0, "Yeray", 18);
        Socio s2 = new Socio(0, "Juan", 20);
        Socio s3 = new Socio(1, "Andrés", 40);
        Socio s4 = new Socio(2, "Pepe", 20);

        // Comparaciones del primero
        System.out.println("Se ha comparado a " + s1.nombre + " con " + s2.nombre +
                " y el resultado es: " + s1.compareTo(s2));
        System.out.println("Se ha comparado a " + s1.nombre + " con " + s3.nombre +
                " y el resultado es: " + s1.compareTo(s3));
        System.out.println("Se ha comparado a " + s1.nombre + " con " + s4.nombre +
                " y el resultado es: " + s1.compareTo(s4));

        // Comparaciones del segundo
        System.out.println("\nSe ha comparado a " + s2.nombre + " con " + s1.nombre +
                " y el resultado es: " + s2.compareTo(s1));
        System.out.println("Se ha comparado a " + s2.nombre + " con " + s3.nombre +
                " y el resultado es: " + s2.compareTo(s3));
        System.out.println("Se ha comparado a " + s2.nombre + " con " + s4.nombre +
                " y el resultado es: " + s2.compareTo(s4));

        // Comparaciones del tercero
        System.out.println("\nSe ha comparado a " + s3.nombre + " con " + s1.nombre +
                " y el resultado es: " + s3.compareTo(s1));
        System.out.println("Se ha comparado a " + s3.nombre + " con " + s2.nombre +
                " y el resultado es: " + s3.compareTo(s2));
        System.out.println("Se ha comparado a " + s3.nombre + " con " + s4.nombre +
                " y el resultado es: " + s3.compareTo(s4));

        // Comparaciones del cuarto
        System.out.println("\nSe ha comparado a " + s4.nombre + " con " + s1.nombre +
                " y el resultado es: " + s4.compareTo(s1));
        System.out.println("Se ha comparado a " + s4.nombre + " con " + s2.nombre +
                " y el resultado es: " + s4.compareTo(s2));
        System.out.println("Se ha comparado a " + s4.nombre + " con " + s3.nombre +
                " y el resultado es: " + s4.compareTo(s3));

    }
}

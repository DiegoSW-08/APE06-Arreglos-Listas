import java.util.ArrayList;
import java.util.Scanner;

// Clase para agrupar los datos de cada estudiante
class Estudiante {
    private String nombre;
    private double nota;

    // Constructor
    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    // Métodos para obtener los datos (Getters)
    public String getNombre() { return nombre; }
    public double getNota() { return nota; }
}

public class RegistroNotasEstudiantes {
    public static void main(String[] args) {
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Registro de Estudiantes y Notas (Java) ---");
        System.out.print("¿Cuántos estudiantes desea registrar?: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        // Bucle para capturar los datos
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("\nIngrese el nombre del estudiante " + i + ": ");
            String nombre = scanner.nextLine();
            
            System.out.print("Ingrese la nota de " + nombre + ": ");
            double nota = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer después de leer un número
            
            // Creamos el objeto estudiante y lo agregamos al ArrayList
            listaEstudiantes.add(new Estudiante(nombre, nota));
        }

        // Mostrar los datos registrados
        System.out.println("\n--- LISTA DE ESTUDIANTES Y NOTAS ---");
        for (Estudiante est : listaEstudiantes) {
            System.out.println("Estudiante: " + est.getNombre() + " | Nota: " + est.getNota());
        }

        scanner.close();
    }
}
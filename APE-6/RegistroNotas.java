import java.util.ArrayList;
import java.util.Scanner;

public class RegistroNotas {
    public static void main(String[] args) {
        // Creación del ArrayList para almacenar números decimales (notas)
        ArrayList<Double> notas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Registro de 6 Notas de Estudiantes (Java) ---");
        
        // Bucle para leer las 6 notas
        for (int i = 1; i <= 6; i++) {
            System.out.print("Ingrese la nota del estudiante " + i + ": ");
            double nota = scanner.nextDouble();
            notas.add(nota); // Agrega la nota al ArrayList
        }
        
        // Mostrar las notas guardadas
        System.out.println("\nNotas registradas:");
        for (double nota : notas) {
            System.out.println("- " + nota);
        }
        
        scanner.close();
    }
}
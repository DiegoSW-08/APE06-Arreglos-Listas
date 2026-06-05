import java.util.ArrayList;
import java.util.Scanner;

public class RegistroEstudiantes {
    public static void main(String[] args) {
        // Creación del ArrayList para almacenar cadenas de texto (nombres)
        ArrayList<String> listaEstudiantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Registro de 5 Estudiantes (Java) ---");
        
        // Bucle para leer los 5 nombres
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese el nombre del estudiante " + i + ": ");
            String nombre = scanner.nextLine();
            listaEstudiantes.add(nombre); // Agrega el elemento al ArrayList
        }
        
        // Mostrar los nombres guardados
        System.out.println("\nLista de estudiantes registrados:");
        for (String estudiante : listaEstudiantes) {
            System.out.println("- " + estudiante);
        }
        
        scanner.close();
    }
}
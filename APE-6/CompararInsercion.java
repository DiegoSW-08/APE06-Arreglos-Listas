import java.util.ArrayList;
import java.util.Scanner;

public class CompararInsercion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- INSERCIÓN DE DATOS EN JAVA ---");
        
        // 1. Inserción en Arreglo Fijo
        // Tenemos que definir el tamaño exacto desde el principio.
        int[] arregloFijo = new int[3]; 
        System.out.println("\n-> Insertando en Arreglo Estático (Capacidad: 3)");
        for (int i = 0; i < arregloFijo.length; i++) {
            System.out.print("Ingrese número para la posición [" + i + "]: ");
            arregloFijo[i] = scanner.nextInt(); // Inserción por índice directo
        }

        // 2. Inserción en ArrayList
        // No definimos tamaño, la lista se adapta dinámicamente.
        ArrayList<Integer> listaDinamica = new ArrayList<>();
        System.out.println("\n-> Insertando en ArrayList Dinámico (Escribe 3 números)");
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese número: ");
            int numero = scanner.nextInt();
            listaDinamica.add(numero); // Inserción dinámica al final de la lista
        }

        // --- Mostrar resultados de la inserción ---
        System.out.print("\nResultado Arreglo: ");
        for (int n : arregloFijo) System.out.print("[" + n + "] ");
        
        System.out.print("\nResultado ArrayList: ");
        for (int n : listaDinamica) System.out.print("[" + n + "] ");
        System.out.println();
        
        scanner.close();
    }
}
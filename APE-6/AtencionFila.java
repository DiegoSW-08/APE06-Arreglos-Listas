import java.util.ArrayList;
import java.util.Scanner;

public class AtencionFila {
    public static void main(String[] args) {
        // Usamos ArrayList para gestionar la fila de turnos dinámicamente
        ArrayList<String> filaTurnos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- SISTEMA DE TURNOS (JAVA) ---");
            System.out.println("1. Generar nuevo turno (Registrar cliente)");
            System.out.println("2. Atender siguiente turno");
            System.out.println("3. Ver turnos en espera");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del cliente para el turno: ");
                    String cliente = scanner.nextLine();
                    filaTurnos.add(cliente); // Añade al final de la fila
                    System.out.println("¡Turno generado con éxito para " + cliente + "!");
                    break;

                case 2:
                    if (filaTurnos.isEmpty()) {
                        System.out.println("No hay clientes en espera actualmente.");
                    } else {
                        // El siguiente a atender siempre es el primero de la lista (índice 0)
                        String atendido = filaTurnos.remove(0); 
                        System.out.println("Atendiendo a: " + atendido);
                    }
                    break;

                case 3:
                    if (filaTurnos.isEmpty()) {
                        System.out.println("La fila está vacía.");
                    } else {
                        System.out.println("\n--- CLIENTES EN ESPERA ---");
                        for (int i = 0; i < filaTurnos.size(); i++) {
                            System.out.println("Turno #" + (i + 1) + ": " + filaTurnos.get(i));
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del sistema de turnos...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
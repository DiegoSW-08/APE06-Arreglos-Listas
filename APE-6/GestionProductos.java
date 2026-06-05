import java.util.ArrayList;
import java.util.Scanner;

public class GestionProductos {
    public static void main(String[] args) {
        ArrayList<String> productos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar menú interactivo
            System.out.println("\n--- MENÚ DE GESTIÓN DE PRODUCTOS ---");
            System.out.println("1. Registrar productos");
            System.out.println("2. Buscar producto");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántos productos desea registrar?: ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    
                    for (int i = 1; i <= cantidad; i++) {
                        System.out.print("Ingrese el nombre del producto " + i + ": ");
                        String nuevoProducto = scanner.nextLine();
                        productos.add(nuevoProducto);
                    }
                    System.out.println("¡Productos registrados con éxito!");
                    break;

                case 2:
                    if (productos.isEmpty()) {
                        System.out.println("La lista está vacía. Registre productos primero.");
                    } else {
                        System.out.print("Ingrese el nombre del producto a buscar: ");
                        String buscar = scanner.nextLine();
                        
                        // Utiliza .contains() para buscar en el ArrayList (ignora mayúsculas/minúsculas opcionalmente)
                        boolean encontrado = false;
                        for (String prod : productos) {
                            if (prod.equalsIgnoreCase(buscar)) {
                                encontrado = true;
                                break;
                            }
                        }
                        
                        if (encontrado) {
                            System.out.println("El producto '" + buscar + "' SÍ se encuentra en la lista.");
                        } else {
                            System.out.println("El producto '" + buscar + "' NO fue encontrado.");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del programa... ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}
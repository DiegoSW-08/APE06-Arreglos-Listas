import java.util.ArrayList;
import java.util.Scanner;

// Clase para representar el Objeto Útil Escolar
class UtilEscolar {
    private String nombre;
    private int cantidad;

    public UtilEscolar(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Cantidad: " + cantidad;
    }
}

public class CrudUtiles {
    public static void main(String[] args) {
        ArrayList<UtilEscolar> inventario = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- CRUD ÚTILES ESCOLARES (JAVA) ---");
            System.out.println("1. Registrar Útil (Create)");
            System.out.println("2. Ver Inventario (Read)");
            System.out.println("3. Modificar Útil (Update)");
            System.out.println("4. Eliminar Útil (Delete)");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1: // CREATE
                    System.out.print("Ingrese el nombre del útil: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la cantidad: ");
                    int cantidad = scanner.nextInt();
                    
                    inventario.add(new UtilEscolar(nombre, cantidad));
                    System.out.println("¡Útil registrado correctamente!");
                    break;

                case 2: // READ
                    if (inventario.isEmpty()) {
                        System.out.println("El inventario está vacío.");
                    } else {
                        System.out.println("\n--- INVENTARIO ACTUAL ---");
                        for (int i = 0; i < inventario.size(); i++) {
                            System.out.println((i + 1) + ". " + inventario.get(i));
                        }
                    }
                    break;

                case 3: // UPDATE
                    if (inventario.isEmpty()) {
                        System.out.println("No hay útiles para modificar.");
                    } else {
                        System.out.print("Ingrese el número del útil a modificar: ");
                        int indiceMod = scanner.nextInt() - 1;
                        scanner.nextLine(); // Limpiar buffer

                        if (indiceMod >= 0 && indiceMod < inventario.size()) {
                            System.out.print("Nuevo nombre (actual: " + inventario.get(indiceMod).getNombre() + "): ");
                            String nuevoNombre = scanner.nextLine();
                            System.out.print("Nueva cantidad (actual: " + inventario.get(indiceMod).getCantidad() + "): ");
                            int nuevaCantidad = scanner.nextInt();

                            UtilEscolar util = inventario.get(indiceMod);
                            util.setNombre(nuevoNombre);
                            util.setCantidad(nuevaCantidad);
                            System.out.println("¡Útil modificado con éxito!");
                        } else {
                            System.out.println("Número de posición inválido.");
                        }
                    }
                    break;

                case 4: // DELETE
                    if (inventario.isEmpty()) {
                        System.out.println("No hay útiles para eliminar.");
                    } else {
                        System.out.print("Ingrese el número del útil a eliminar: ");
                        int indiceDel = scanner.nextInt() - 1;

                        if (indiceDel >= 0 && indiceDel < inventario.size()) {
                            inventario.remove(indiceDel);
                            System.out.println("¡Útil eliminado del inventario!");
                        } else {
                            System.out.println("Número de posición inválido.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
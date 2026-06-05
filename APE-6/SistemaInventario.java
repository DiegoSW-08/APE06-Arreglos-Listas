import java.util.ArrayList;
import java.util.Scanner;

class Producto {
    private int id;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public double calcularValorTotal() {
        return this.precio * this.stock;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Producto: %-15s | Precio: $%6.2f | Stock: %d", 
                id, nombre, precio, stock);
    }
}

public class SistemaInventario {
    public static void main(String[] args) {
        ArrayList<Producto> inventario = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion, contadorId = 1;

        do {
            System.out.println("\n--- SISTEMA DE INVENTARIO (JAVA) ---");
            System.out.println("1. Agregar Producto al Inventario");
            System.out.println("2. Mostrar Inventario Completo");
            System.out.println("3. Calcular Valor Total del Inventario");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Precio del producto: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Cantidad en stock: ");
                    int stock = scanner.nextInt();

                    inventario.add(new Producto(contadorId++, nombre, precio, stock));
                    System.out.println("¡Producto agregado con éxito!");
                    break;

                case 2:
                    if (inventario.isEmpty()) {
                        System.out.println("El inventario está completamente vacío.");
                    } else {
                        System.out.println("\n--- INVENTARIO ACTUAL ---");
                        for (Producto p : inventario) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 3:
                    double valorTotal = 0;
                    for (Producto p : inventario) {
                        valorTotal += p.calcularValorTotal();
                    }
                    System.out.printf("El valor total de los productos en almacén es: $%.2f\n", valorTotal);
                    break;

                case 4:
                    System.out.println("Saliendo del sistema de inventario...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
#include <iostream>
#include <vector>
#include <string>
#include <iomanip> // Para dar formato a los precios/decimales

struct Producto {
    int id;
    std::string nombre;
    double precio;
    int stock;

    double calcularValorTotal() const {
        return precio * stock;
    }
};

int main() {
    std::vector<Producto> inventario;
    int opcion;
    int contadorId = 1;

    do {
        std::cout << "\n--- SISTEMA DE INVENTARIO (C++) ---\n";
        std::cout << "1. Agregar Producto al Inventario\n";
        std::cout << "2. Mostrar Inventario Completo\n";
        std::cout << "3. Calcular Valor Total del Inventario\n";
        std::cout << "4. Salir\n";
        std::cout << "Seleccione una opción: ";
        std::cin >> opcion;
        std::cin.ignore(); // Limpiar el buffer de entrada

        switch (opcion) {
            case 1: {
                Producto nuevoProducto;
                nuevoProducto.id = contadorId++;
                
                std::cout << "Nombre del producto: ";
                std::getline(std::cin, nuevoProducto.nombre);
                std::cout << "Precio del producto: ";
                std::cin >> nuevoProducto.precio;
                std::cout << "Cantidad en stock: ";
                std::cin >> nuevoProducto.stock;

                inventario.push_back(nuevoProducto);
                std::cout << "¡Producto agregado con éxito!\n";
                break;
            }
            case 2:
                if (inventario.empty()) {
                    std::cout << "El inventario está completamente vacío.\n";
                } else {
                    std::cout << "\n--- INVENTARIO ACTUAL ---\n";
                    // Configurar formato decimal fijo a 2 dígitos para el dinero
                    std::cout << std::fixed << std::setprecision(2);
                    for (const auto& p : inventario) {
                        std::cout << "ID: " << p.id 
                                  << " | Producto: " << p.nombre 
                                  << " | Precio: $" << p.precio 
                                  << " | Stock: " << p.stock << "\n";
                    }
                }
                break;

            case 3: {
                double valorTotal = 0;
                for (const auto& p : inventario) {
                    valorTotal += p.calcularValorTotal();
                }
                std::cout << std::fixed << std::setprecision(2);
                std::cout << "El valor total de los productos en almacén es: $" << valorTotal << "\n";
                break;
            }
            case 4:
                std::cout << "Saliendo del sistema de inventario...\n";
                break;

            default:
                std::cout << "Opción no válida.\n";
        }
    } while (opcion != 4);

    return 0;
}
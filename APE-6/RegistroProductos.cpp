#include <iostream>
#include <vector>
#include <string>
#include <algorithm> // Necesario si quisiéramos usar métodos de búsqueda avanzados

int main() {
    std::vector<std::string> productos;
    int opcion;

    do {
        // Mostrar menú interactivo
        std::cout << "\n--- MENÚ DE GESTIÓN DE PRODUCTOS ---\n";
        std::cout << "1. Registrar productos\n";
        std::cout << "2. Buscar producto\n";
        std::cout << "3. Salir\n";
        std::cout << "Seleccione una opción: ";
        std::cout << "Seleccione una opción: ";
        std::cin >> opcion;
        std::cin.ignore(); // Limpiar el buffer para evitar problemas con getline

        switch (opcion) {
            case 1: {
                int cantidad;
                std::cout << "¿Cuántos productos desea registrar?: ";
                std::cin >> cantidad;
                std::cin.ignore(); // Limpiar el buffer

                for (int i = 1; i <= cantidad; ++i) {
                    std::string nuevoProducto;
                    std::cout << "Ingrese el nombre del producto " << i << ": ";
                    std::getline(std::cin, nuevoProducto);
                    productos.push_back(nuevoProducto);
                }
                std::cout << "¡Productos registrados con éxito!\n";
                break;
            }
            case 2: {
                if (productos.empty()) {
                    std::cout << "La lista está vacía. Registre productos primero.\n";
                } else {
                    std::string buscar;
                    std::cout << "Ingrese el nombre del producto a buscar: ";
                    std::getline(std::cin, buscar);

                    bool encontrado = false;
                    // Búsqueda secuencial en el vector
                    for (const std::string& prod : productos) {
                        if (prod == buscar) { // Comparación exacta
                            encontrado = true;
                            break;
                        }
                    }

                    if (encontrado) {
                        std::cout << "El producto '" << buscar << "' SÍ se encuentra en la lista.\n";
                    } else {
                        std::cout << "El producto '" << buscar << "' NO fue encontrado.\n";
                    }
                }
                break;
            }
            case 3:
                std::cout << "Saliendo del programa... ¡Hasta luego!\n";
                break;
            default:
                std::cout << "Opción no válida. Intente de nuevo.\n";
        }
    } while (opcion != 3);

    return 0;
}
#include <iostream>
#include <vector>
#include <string>

// Estructura para representar el Útil Escolar
struct UtilEscolar {
    std::string nombre;
    int cantidad;
};

int main() {
    std::vector<UtilEscolar> inventario;
    int opcion;

    do {
        std::cout << "\n--- CRUD ÚTILES ESCOLARES (C++) ---\n";
        std::cout << "1. Registrar Útil (Create)\n";
        std::cout << "2. Ver Inventario (Read)\n";
        std::cout << "3. Modificar Útil (Update)\n";
        std::cout << "4. Eliminar Útil (Delete)\n";
        std::cout << "5. Salir\n";
        std::cout << "Seleccione una opción: ";
        std::cin >> opcion;
        std::cin.ignore(); // Limpiar el buffer de entrada

        switch (opcion) {
            case 1: { // CREATE
                UtilEscolar nuevoUtil;
                std::cout << "Ingrese el nombre del útil: ";
                std::getline(std::cin, nuevoUtil.nombre);
                std::cout << "Ingrese la cantidad: ";
                std::cin >> nuevoUtil.cantidad;
                
                inventario.push_back(nuevoUtil);
                std::cout << "¡Útil registrado correctamente!\n";
                break;
            }
            case 2: { // READ
                if (inventario.empty()) {
                    std::cout << "El inventario está vacío.\n";
                } else {
                    std::cout << "\n--- INVENTARIO ACTUAL ---\n";
                    for (size_t i = 0; i < inventario.size(); ++i) {
                        std::cout << (i + 1) << ". Nombre: " << inventario[i].nombre 
                                  << " | Cantidad: " << inventario[i].cantidad << "\n";
                    }
                }
                break;
            }
            case 3: { // UPDATE
                if (inventario.empty()) {
                    std::cout << "No hay útiles para modificar.\n";
                } else {
                    int indiceMod;
                    std::cout << "Ingrese el número del útil a modificar: ";
                    std::cin >> indiceMod;
                    --indiceMod; // Ajustar a índice de vector (empieza en 0)
                    std::cin.ignore(); // Limpiar buffer

                    if (indiceMod >= 0 && indiceMod < static_cast<int>(inventario.size())) {
                        std::cout << "Nuevo nombre (actual: " << inventario[indiceMod].nombre << "): ";
                        std::getline(std::cin, inventario[indiceMod].nombre);
                        std::cout << "Nueva cantidad (actual: " << inventario[indiceMod].cantidad << "): ";
                        std::cin >> inventario[indiceMod].cantidad;

                        std::cout << "¡Útil modificado con éxito!\n";
                    } else {
                        std::cout << "Número de posición inválido.\n";
                    }
                }
                break;
            }
            case 4: { // DELETE
                if (inventario.empty()) {
                    std::cout << "No hay útiles para eliminar.\n";
                } else {
                    int indiceDel;
                    std::cout << "Ingrese el número del útil a eliminar: ";
                    std::cin >> indiceDel;
                    --indiceDel; // Ajustar a índice de vector

                    if (indiceDel >= 0 && indiceDel < static_cast<int>(inventario.size())) {
                        // .erase() elimina un elemento usando un iterador apuntando a la posición
                        inventario.erase(inventario.begin() + indiceDel);
                        std::cout << "¡Útil eliminado del inventario!\n";
                    } else {
                        std::cout << "Número de posición inválido.\n";
                    }
                }
                break;
            }
            case 5:
                std::cout << "Saliendo del programa...\n";
                break;
            default:
                std::cout << "Opción inválida.\n";
        }
    } while (opcion != 5);

    return 0;
}
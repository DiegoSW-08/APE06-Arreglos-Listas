#include <iostream>
#include <vector>
#include <string>

int main() {
    // Usamos std::vector para gestionar la fila de turnos dinámicamente
    std::vector<std::string> filaTurnos;
    int opcion;

    do {
        std::cout << "\n--- SISTEMA DE TURNOS (C++) ---\n";
        std::cout << "1. Generar nuevo turno (Registrar cliente)\n";
        std::cout << "2. Atender siguiente turno\n";
        std::cout << "3. Ver turnos en espera\n";
        std::cout << "4. Salir\n";
        std::cout << "Seleccione una opción: ";
        std::cin >> opcion;
        std::cin.ignore(); // Limpiar el buffer

        switch (opcion) {
            case 1: {
                std::string cliente;
                std::cout << "Ingrese el nombre del cliente para el turno: ";
                std::getline(std::cin, cliente);
                filaTurnos.push_back(cliente); // Añade al final de la fila
                std::cout << "¡Turno generado con éxito para " << cliente << "!\n";
                break;
            }
            case 2:
                if (filaTurnos.empty()) {
                    std::cout << "No hay clientes en espera actualmente.\n";
                } else {
                    // El siguiente a atender es el primero de la fila (índice 0)
                    std::cout << "Atendiendo a: " << filaTurnos[0] << "\n";
                    // Eliminamos el primer elemento. .erase requiere un iterador (.begin())
                    filaTurnos.erase(filaTurnos.begin()); 
                }
                break;

            case 3:
                if (filaTurnos.empty()) {
                    std::cout << "La fila está vacía.\n";
                } else {
                    std::cout << "\n--- CLIENTES EN ESPERA ---\n";
                    for (size_t i = 0; i < filaTurnos.size(); ++i) {
                        std::cout << "Turno #" << (i + 1) << ": " << filaTurnos[i] << "\n";
                    }
                }
                break;

            case 4:
                std::cout << "Saliendo del sistema de turnos...\n";
                break;

            default:
                std::cout << "Opción no válida.\n";
        }
    } while (opcion != 4);

    return 0;
}
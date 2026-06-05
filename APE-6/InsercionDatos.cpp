#include <iostream>
#include <vector>

int main() {
    std::cout << "--- INSERCIÓN DE DATOS EN C++ ---\n";

    // 1. Inserción en Arreglo Fijo
    int arregloFijo[3];
    std::cout << "\n-> Insertando en Arreglo Estático (Capacidad: 3)\n";
    for (int i = 0; i < 3; i++) {
        std::cout << "Ingrese número para la posición [" << i << "]: ";
        std::cin >> arregloFijo[i]; // Inserción asignando directamente a la celda de memoria
    }

    // 2. Inserción en Vector
    std::vector<int> vectorDinamico;
    std::cout << "\n-> Insertando en Vector Dinámico (Escribe 3 números)\n";
    for (int i = 0; i < 3; i++) {
        int numero;
        std::cout << "Ingrese número: ";
        std::cin >> numero;
        vectorDinamico.push_back(numero); // Inserción que empuja el dato y expande el vector
    }

    // --- Mostrar resultados de la inserción ---
    std::cout << "\nResultado Arreglo: ";
    for (int i = 0; i < 3; i++) {
        std::cout << "[" << arregloFijo[i] << "] ";
    }

    std::cout << "\nResultado Vector: ";
    for (int n : vectorDinamico) {
        std::cout << "[" << n << "] ";
    }
    std::cout << "\n";

    return 0;
}
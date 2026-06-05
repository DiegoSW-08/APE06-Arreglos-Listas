#include <iostream>
#include <vector>

int main() {
    std::cout << "--- COMPARACIÓN EN C++ ---\n";

    // 1. ARREGLO TRADICIONAL (Estático)
    // Su tamaño se define en tiempo de compilación y es inmutable.
    int arregloEstatico[3];
    arregloEstatico[0] = 10;
    arregloEstatico[1] = 20;
    arregloEstatico[2] = 30;
    // arregloEstatico[3] = 40; // ¡Error crítico! Invade memoria no asignada (Undefined Behavior).

    // 2. VECTOR (Dinámico)
    // Crece de forma dinámica conforme se añaden elementos.
    std::vector<int> vectorDinamico;
    vectorDinamico.push_back(10);
    vectorDinamico.push_back(20);
    vectorDinamico.push_back(30);
    vectorDinamico.push_back(40); // El vector se expande automáticamente
    vectorDinamico.push_back(50);

    // --- MOSTRAR RESULTADOS ---
    // El tamaño de un arreglo estático en C++ se calcula dividiendo su peso total entre el tipo de dato
    int tamanoArreglo = sizeof(arregloEstatico) / sizeof(arregloEstatico[0]);
    
    std::cout << "Contenido del Arreglo Fijo (Tamaño: " << tamanoArreglo << "):\n";
    for (int i = 0; i < tamanoArreglo; ++i) {
        std::cout << "[" << arregloEstatico[i] << "] ";
    }

    std::cout << "\n\nContenido del Vector Dinámico (Tamaño actual: " << vectorDinamico.size() << "):\n";
    for (int num : vectorDinamico) {
        std::cout << "[" << num << "] ";
    }
    std::cout << "\n";

    return 0;
}
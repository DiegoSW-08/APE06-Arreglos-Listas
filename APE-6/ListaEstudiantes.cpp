#include <iostream>
#include <vector>
#include <string>

int main() {
    // Creación del vector para almacenar strings
    std::vector<std::string> listaEstudiantes;
    std::string nombre;

    std::cout << "--- Registro de 5 Estudiantes (C++) ---\n";

    // Bucle para leer los 5 nombres
    for (int i = 1; i <= 5; ++i) {
        std::cout << "Ingrese el nombre del estudiante " << i << ": ";
        // std::getline permite leer nombres con espacios intermedios
        std::getline(std::cin, nombre); 
        listaEstudiantes.push_back(nombre); // Agrega el elemento al final del vector
    }

    // Mostrar los nombres guardados utilizando un bucle for basado en rango (C++11 en adelante)
    std::cout << "\nLista de estudiantes registrados:\n";
    for (const auto& estudiante : listaEstudiantes) {
        std::cout << "- " << estudiante << "\n";
    }

    return 0;
}
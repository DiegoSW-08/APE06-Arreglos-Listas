#include <iostream>
#include <vector>

int main() {
    // Creación del vector para almacenar notas decimales
    std::vector<double> notas;
    double nota;

    std::cout << "--- Registro de 6 Notas de Estudiantes (C++) ---\n";

    // Bucle para leer las 6 notas
    for (int i = 1; i <= 6; ++i) {
        std::cout << "Ingrese la nota del estudiante " << i << ": ";
        std::cin >> nota;
        notas.push_back(nota); // Agrega la nota al final del vector
    }

    // Mostrar las notas guardadas
    std::cout << "\nNotas registradas:\n";
    for (double nota : notas) {
        std::cout << "- " << nota << "\n";
    }

    return 0;
}
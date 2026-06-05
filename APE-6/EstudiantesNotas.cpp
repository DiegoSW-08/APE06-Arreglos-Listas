#include <iostream>
#include <vector>
#include <string>

// Estructura para agrupar los datos de cada estudiante
struct Estudiante {
    std::string nombre;
    double nota;
};

int main() {
    std::vector<Estudiante> listaEstudiantes;
    int cantidad;

    std::cout << "--- Registro de Estudiantes y Notas (C++) ---\n";
    std::cout << "¿Cuántos estudiantes desea registrar?: ";
    std::cin >> cantidad;
    std::cin.ignore(); // Limpiar el buffer para permitir el uso de getline después

    // Bucle para capturar los datos
    for (int i = 1; i <= cantidad; ++i) {
        Estudiante nuevoEstudiante;
        
        std::cout << "\nIngrese el nombre del estudiante " << i << ": ";
        std::getline(std::cin, nuevoEstudiante.nombre); // Lee el nombre completo
        
        std::cout << "Ingrese la nota de " << nuevoEstudiante.nombre << ": ";
        std::cin >> nuevoEstudiante.nota;
        std::cin.ignore(); // Limpiar el buffer después de leer la nota numérica

        // Agregamos la estructura completa al final del vector
        listaEstudiantes.push_back(nuevoEstudiante);
    }

    // Mostrar los datos registrados
    std::cout << "\n--- LISTA DE ESTUDIANTES Y NOTAS ---\n";
    for (const auto& est : listaEstudiantes) {
        std::cout << "Estudiante: " << est.nombre << " | Nota: " << est.nota << "\n";
    }

    return 0;
}
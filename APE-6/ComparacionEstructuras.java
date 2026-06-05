import java.util.ArrayList;

public class ComparacionEstructuras {
    public static void main(String[] args) {
        System.out.println("--- COMPARACIÓN EN JAVA ---");

        // 1. ARREGLO TRADICIONAL (Estático)
        // Se debe definir el tamaño al inicio y no se puede cambiar.
        int[] arregloEstatico = new int[3];
        arregloEstatico[0] = 10;
        arregloEstatico[1] = 20;
        arregloEstatico[2] = 30;
        // arregloEstatico[3] = 40; // ¡Esto causaría un error (ArrayIndexOutOfBoundsException)!

        // 2. ARRAYLIST (Dinámico)
        // No necesita un tamaño inicial fijo y crece a demanda.
        ArrayList<Integer> listaDinamica = new ArrayList<>();
        listaDinamica.add(10);
        listaDinamica.add(20);
        listaDinamica.add(30);
        listaDinamica.add(40); // Se puede seguir agregando sin problemas
        listaDinamica.add(50);

        // --- MOSTRAR RESULTADOS ---
        System.out.println("Contenido del Arreglo Fijo (Tamaño: " + arregloEstatico.length + "):");
        for (int num : arregloEstatico) {
            System.out.print("[" + num + "] ");
        }
        
        System.out.println("\n\nContenido del ArrayList (Tamaño actual: " + listaDinamica.size() + "):");
        for (int num : listaDinamica) {
            System.out.print("[" + num + "] ");
        }
        System.out.println();
    }
}
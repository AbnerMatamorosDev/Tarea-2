package proyectorecursos;

import java.util.ArrayList;
import java.util.List;

public class Recursos {
    // Primer método: Retornar un mensaje
    public String mensajePOO() {
        return "Programación Orientada a Objetos";
    }

    // Segundo método: Verificar edad
    public String verificarEdad(int edad) {
        if (edad >= 21) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }

    // Tercer método: Multiplicación
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Cuarto método: Lista de números del 1 al X
    public List<Integer> listaNumeros(int x) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= x; i++) {
            numeros.add(i);
        }
        return numeros;
    }
}

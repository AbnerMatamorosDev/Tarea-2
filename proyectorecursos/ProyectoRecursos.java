package proyectorecursos;

import java.util.List;

public class ProyectoRecursos {
    public static void main(String[] args) {
        Recursos recursos = new Recursos();

        // Primer método
        System.out.println(recursos.mensajePOO());

        // Segundo método
        int edad = 20; // Puedes cambiar este valor para probar
        System.out.println("Edad: " + edad + " - " + recursos.verificarEdad(edad));

        // Tercer método
        int a = 5;
        int b = 3;
        System.out.println("Multiplicación de " + a + " y " + b + ": " + recursos.multiplicar(a, b));

        // Cuarto método
        int x = 10; // Puedes cambiar este valor para probar
        List<Integer> lista = recursos.listaNumeros(x);
        System.out.println("Lista de números del 1 al " + x + ": " + lista);
    }
}

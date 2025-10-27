/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package norecursividad;

/**
 *
 * @author Equipo Hollow
 */
public class NoRecursividad {
    public static long fibonacci(int n) {
        if (n <= 1) return n;

        long a = 0;
        long b = 1;
        long c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static int mcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int count(Object datos[], int n, Object o) {
        int contador = 0;
        for (int i = 0; i < n; i++) {
            if (datos[i].equals(o)) {
                contador++;
            }
        }
        return contador;
    }

    public static void reverse(Object datos[], int inicio, int fin) {
        while (inicio < fin) {
            Object temp = datos[inicio];
            datos[inicio] = datos[fin];
            datos[fin] = temp;

            inicio++;
            fin--;
        }
    }
  
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package norecursividad;

/**
 *
 * @author Equipo Hollow
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Fibonacci de 5: " + NoRecursividad.fibonacci(5));
        System.out.println("Fibonacci de 40: " + NoRecursividad.fibonacci(40));
        System.out.println("");

        System.out.println("MCD de 45 y 75: " + NoRecursividad.mcd(45, 75));
        System.out.println("MCD de 47 y 91: " + NoRecursividad.mcd(47, 91));
        System.out.println("");

        Integer arr1[] = {1, 2, 3, 3, 2, 3, 1};
        System.out.println("ocurrencias de 3: " + NoRecursividad.count(arr1, arr1.length, 3));
        System.out.println("ocurrencias de 1: " + NoRecursividad.count(arr1, arr1.length, 1));
        System.out.println("");

        Character arr2[] = {'A', 'B', 'C', 'B', 'A', 'B', 'D'};
        System.out.println("Ocurrencias de C: " + NoRecursividad.count(arr2, arr2.length, 'C'));
        System.out.println("Ocurrencias de E: " + NoRecursividad.count(arr2, arr2.length, 'E'));
        System.out.println("");

        Integer arr3[] = {1, 2, 3, 4, 5};
        NoRecursividad.reverse(arr3, 0, arr3.length - 1);
        System.out.print("arreglo invertido (numeros): ");
        for (Object x : arr3) System.out.print(x + " ");
        System.out.println();

        Character arr4[] = {'A', 'B', 'C', 'D'};
        NoRecursividad.reverse(arr4, 0, arr4.length - 1);
        System.out.print("Arreglo invertido (letras): ");
        for (Object x : arr4) System.out.print(x + " ");
        System.out.println();

    }
}

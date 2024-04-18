/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author James Honeyman
 */
import java.util.Scanner;
public class Funciones {
    // Ejercicio 1: Convertir medida de centímetros a kilómetros, metros y centímetros
    public static void convertirMedida(int medida) {
        if (medida >= 100000) {
            int kilometros = medida / 100000;
            int metros = (medida % 100000) / 100;
            int centimetros = medida % 100;
            System.out.println(medida + " centimetros son " + kilometros + " kilometros, " + metros + " metros y " + centimetros + " centimetros.");
        } else {
            System.out.println("La medida debe ser mayor o igual a 100000 centimetros.");
        }
    }
    // Ejercicio 2: Imprimir números del 1 al 10
    public static void imprimirNumeros() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
    // Ejercicio 3: Sumar números del 1 al 10
    public static int sumarNumeros() {
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma += i;
        }
        return suma;
    }
    // Ejercicio 4: Verificar si un número es par o impar
    public static String verificarParImpar(int numero) {
        return numero % 2 == 0 ? "par" : "impar";
    }
    // Ejercicio 5: Calcular promedio de 30 números ingresados por el usuario
    public static double calcularPromedio() {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        for (int i = 1; i <= 30; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            int num = scanner.nextInt();
            total += num;
        }
        return (double) total / 30;
    }
    // Ejercicio 6: Imprimir números pares del 1 al 20
    public static void imprimirNumerosPares() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
    // Ejercicio 7: Suma de los números impares del 1 al 400
    public static int sumaImpares(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num % 2 != 0 ? num + sumaImpares(num - 1) : sumaImpares(num - 1);
        }
    }
    // Ejercicio 8: Calcular área de un círculo
    public static double calcularAreaCirculo(double radio) {
        if (radio > 0) {
            return Math.PI * radio * radio;
        } else {
            System.out.println("El radio ingresado no es valido. Debe ser positivo.");
            return 0;
        }
    }
    // Ejercicio 9: Calcular perímetro de un círculo
    public static double calcularPerimetroCirculo(double radio) {
        if (radio > 0) {
            return 2 * Math.PI * radio;
        } else {
            System.out.println("El radio ingresado no es valido. Debe ser positivo.");
            return 0;
        }
    }
     // Ejercicio 10: Calcular área de un rectángulo
    public static double calcularAreaRectangulo(double lado1, double lado2) {
        if (lado1 > 0 && lado2 > 0) {
            return lado1 * lado2;
        } else {
            System.out.println("Las medidas ingresadas no son validas. Deben ser positivas.");
            return 0;
        }
    }
    // Ejercicio 11: Calcular volumen de una esfera
    public static double calcularVolumenEsfera(double radio) {
        if (radio > 0) {
            return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
        } else {
            System.out.println("El radio ingresado no es valido. Debe ser positivo.");
            return 0;
        }
    }
    // Ejercicio 12: Calcular área y perímetro de un cubo
    public static void calcularAreaPerimetroCubo(double lado) {
        if (lado > 0) {
            double areaCubo = 6 * lado * lado;
            double perimetroCubo = 12 * lado;
            System.out.println("El area del cubo es: " + areaCubo);
            System.out.println("El perimetro del cubo es: " + perimetroCubo);
        } else {
            System.out.println("La longitud ingresada no es valida. Debe ser positiva.");
        }
    }
    // Ejercicio 13: Imprimir números del 1 al 100, saltando los múltiplos de 3
    public static void imprimirNumerosSaltandoMultiplos3() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0) {
                System.out.println(i);
            }
        }
    }
    // Ejercicio 14: Imprimir números del 1 al 100, saltando los múltiplos de 5
    public static void imprimirNumerosSaltandoMultiplos5() {
        int i = 1;
        while (i <= 100) {
            if (i % 5 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
    // Ejercicio 15: Imprimir números del 1 al 100, saltando los múltiplos de 3 y 5
    public static void imprimirNumerosSaltandoMultiplos3y5() {
        int i = 1;
        while (i <= 100) {
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
    // Ejercicio 16: Imprimir números del 1 al 100, reemplazando múltiplos de 3 por "Cuek"
    public static void imprimirConReemplazoMultiplos3() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Cuek");
            } else {
                System.out.println(i);
            }
        }
    }
    // Ejercicio 17: Calcular factorial de un número
    public static int calcularFactorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * calcularFactorial(num - 1);
        }
    }
    // Ejercicio 18: Contar la cantidad de dígitos de un número
    public static int contarDigitos(int num) {
        if (num < 10) {
            return 1;
        } else {
            return 1 + contarDigitos(num / 10);
        }
    }
    // Ejercicio 19: Calcular área y perímetro de un cuadrado
    public static void calcularAreaPerimetroCuadrado(double lado) {
        if (lado > 0) {
            double areaCuadrado = lado * lado;
            double perimetroCuadrado = 4 * lado;
            System.out.println("El area del cuadrado es: " + areaCuadrado);
            System.out.println("El perimetro del cuadrado es: " + perimetroCuadrado);
        } else {
            System.out.println("La longitud ingresada no es valida. Debe ser positiva.");
        }
    }
    // Ejercicio 20: Calcular potencia de un número
    public static double calcularPotencia(double base, int x) {
        if (x == 0) {
            return 1;
        } else if (x > 0) {
            return base * calcularPotencia(base, x - 1);
        } else {
            System.out.println("El exponente debe ser positivo.");
            return 0;
        }
    }
}  
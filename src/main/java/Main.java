/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author james Honeyman
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char respuesta;
        
        do {
            System.out.println("=================              BIENVENIDO             =================");
            System.out.println();
            System.out.println("1. Convertir medida de centimetros a kilometros, metros y centimetros.");
            System.out.println("2. Suma de los numeros impares del 1 al 400.");
            System.out.println("3. Calcular perimetro de un circulo.");
            System.out.println("4. Calcular volumen de una esfera.");
            System.out.println("5. Calcular factorial de un numero.");
            System.out.println("6. Contar la cantidad de digitos de un numero.");
            System.out.println("7. Calcular potencia de un numero.");
            System.out.println("8. Imprimir numeros del 1 al 10.");
            System.out.println("9. Sumar numeros del 1 al 10.");
            System.out.println("10. Verificar si un numero es par o impar.");
            System.out.println("11. Calcular promedio de 30 numeros ingresados por el usuario.");
            System.out.println("12. Imprimir numeros pares del 1 al 20.");
            System.out.println("13. Calcular area de un circulo.");
            System.out.println("14. Calcular area de un rectangulo.");
            System.out.println("15. Calcular area y perimetro de un cubo.");
            System.out.println("16. Imprimir numeros del 1 al 100, saltando los multiplos de 3.");
            System.out.println("17. Imprimir numeros del 1 al 100, saltando los multiplos de 5.");
            System.out.println("18. Imprimir numeros del 1 al 100, saltando los multiplos de 3 y 5.");
            System.out.println("19. Imprimir numeros del 1 al 100, reemplazando los multiplos de 3.");
            System.out.println("20. Calcular area y perimetro de un cuadrado.");
            System.out.println("21. Salir.");

            int op = scanner.nextInt();
            
            switch (op) {
           
            case 1:
            // Ejercicio 1
            System.out.print("Ingrese una medida en centimetros: ");
            int medida = scanner.nextInt();
            Funciones.convertirMedida(medida);
            break;
            
            case 2:
            // Ejercicio 2
            System.out.println("La suma de los numeros impares del 1 al 400 es: " + Funciones.sumaImpares(400));
            break;
            
            case 3:
            // Ejercicio 3
            System.out.print("Ingrese el radio del circulo: ");
            double radioCirculo = scanner.nextDouble();
            System.out.println("El perimetro del circulo es: " + Funciones.calcularPerimetroCirculo(radioCirculo));
            break;
            
            case 4:
            // Ejercicio 4
            System.out.print("Ingrese el radio de la esfera: ");
            double radioEsfera = scanner.nextDouble();
            System.out.println("El volumen de la esfera es: " + Funciones.calcularVolumenEsfera(radioEsfera));
            break;
            
            case 5:
            // Ejercicio 5
            System.out.print("Ingrese un numero para calcular su factorial: ");
            int numFactorial = scanner.nextInt();
            System.out.println("El factorial de " + numFactorial + " es: " + Funciones.calcularFactorial(numFactorial));
            break;
            
            case 6:
            // Ejercicio 6
            System.out.print("Ingrese un numero para contar sus digitos: ");
            int numDigitos = scanner.nextInt();
            System.out.println("La cantidad de digitos de " + numDigitos + " es: " + Funciones.contarDigitos(numDigitos));
            break;
            
            case 7:
            // Ejercicio 7
            Funciones.imprimirNumeros();
            break;
            
            case 8:
            // Ejercicio 8
            System.out.println("La suma de los numeros del 1 al 10 es: " + Funciones.sumarNumeros());
            break;
            
            case 9:
            // Ejercicio 9
            System.out.print("Ingrese un numero para verificar si es par o impar: ");
            int numParImpar = scanner.nextInt();
            System.out.println("El numero ingresado es " + Funciones.verificarParImpar(numParImpar));
            break;
            
            case 10: 
            // Ejercicio 10
            System.out.println("El promedio de los 30 numeros ingresados es: " + Funciones.calcularPromedio());
            break;
            
            case 11:
            // Ejercicio 11
            Funciones.imprimirNumerosPares();
            break;
            
            case 12:
            // Ejercicio 12
            System.out.print("Ingrese el radio del circulo: ");
            double radio = scanner.nextDouble();
            System.out.println("El area del circulo es: " + Funciones.calcularAreaCirculo(radio));
            break;
            
            case 13:
            // Ejercicio 13
            System.out.print("Ingrese la longitud del lado del rectangulo: ");
            double lado1 = scanner.nextDouble();
            System.out.print("Ingrese la longitud del otro lado del rectangulo: ");
            double lado2 = scanner.nextDouble();
            System.out.println("El area del rectangulo es: " + Funciones.calcularAreaRectangulo(lado1, lado2));
            break;
            
            case 14:
            // Ejercicio 14
            System.out.print("Ingrese la longitud del lado del cubo: ");
            double ladoCubo = scanner.nextDouble();
            Funciones.calcularAreaPerimetroCubo(ladoCubo);
            break;
            
            case 15:
            // Ejercicio 15
            Funciones.imprimirNumerosSaltandoMultiplos3();
            break;
            
            case 16:
            // Ejercicio 16
            Funciones.imprimirNumerosSaltandoMultiplos5();
            break;
            
            case 17:
            // Ejercicio 17
            Funciones.imprimirNumerosSaltandoMultiplos3y5();
            break;
            
            case 18:
            // Ejercicio 18
            Funciones.imprimirConReemplazoMultiplos3();
            break;
            
            case 19:
            // Ejercicio 19
            System.out.print("Ingrese la longitud del lado del cuadrado: ");
            double ladoCuadrado = scanner.nextDouble();
            Funciones.calcularAreaPerimetroCuadrado(ladoCuadrado);
            break;
            
            case 20:
            // Ejercicio 20
            System.out.print("Ingrese la base de la potencia: ");
            double basePotencia = scanner.nextDouble();
            System.out.print("Ingrese el exponente de la potencia: ");
            int exponentePotencia = scanner.nextInt();
            System.out.println("El resultado de la potencia es: " + Funciones.calcularPotencia(basePotencia, exponentePotencia));
            break;
            
            case 21:
                    System.out.println("¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción valida.");
            }
            // Consultar al usuario si quiere calcular nuevamente
            System.out.print("¿Quiere calcular nuevamente para otras medidas? (S/N): ");
            respuesta = scanner.next().charAt(0);
        } while (respuesta == 'S' || respuesta == 's');
    }

}

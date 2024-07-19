package com.mycompany.calculadorapromedio;


 //@author kennycaballero
 
import java.util.Scanner;

public class CalculadoraPromedio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre = "";
        String apellidos = "";
        String curso = "";
        double nota1 = 0.0;
        double nota2 = 0.0;
        double nota3 = 0.0;
        double nota4 = 0.0;

        while (true) {
            System.out.println("---------MENU----------");
            System.out.println("1. Ingrese su nombre");
            System.out.println("2. Ingrese sus apellidos");
            System.out.println("3. Ingrese el nombre del curso a evaluar");
            System.out.println("4. Ingrese las notas");
            System.out.println("5. Mostrar promedio y datos personales");
            System.out.println("6. Reiniciar");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese su nombre: ");
                    nombre = scanner.nextLine();
                    break;
                case 2:
                    System.out.print("Ingrese sus apellidos: ");
                    apellidos = scanner.nextLine();
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del curso a evaluar: ");
                    curso = scanner.nextLine();
                    break;
                case 4:
                    System.out.println("Ingrese las notas:");
                    System.out.print("Nota 1 (4%): ");
                    nota1 = scanner.nextDouble();
                    System.out.print("Nota 2 (12%): ");
                    nota2 = scanner.nextDouble();
                    System.out.print("Nota 3 (24%): ");
                    nota3 = scanner.nextDouble();
                    System.out.print("Nota 4 (60%): ");
                    nota4 = scanner.nextDouble();
                    break;
                case 5:
                    double promedio = calcularPromedio(nota1, nota2, nota3, nota4);
                    System.out.println("---------RESULTADO----------");
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Apellidos: " + apellidos);
                    System.out.println("Curso: " + curso);
                    System.out.println("Promedio: " + promedio);
                    break;
                case 6:
                    nombre = "";
                    apellidos = "";
                    curso = "";
                    nota1 = 0.0;
                    nota2 = 0.0;
                    nota3 = 0.0;
                    nota4 = 0.0;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    public static double calcularPromedio(double nota1, double nota2, double nota3, double nota4) {
        double promedio = (nota1 * 0.04) + (nota2 * 0.12) + (nota3 * 0.24) + (nota4 * 0.60);
        return promedio;
    }
}



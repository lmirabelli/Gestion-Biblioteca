/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bibliotecasimparcial;

/**
 *
 * @author chuch
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú Biblioteca ---");
            System.out.println("1. Agregar Libro");
            System.out.println("2. Agregar Revista");
            System.out.println("3. Agregar Ilustración");
            System.out.println("4. Mostrar Publicaciones");
            System.out.println("5. Leer Publicaciones");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (opcion) {
                    case 1:
                        System.out.print("Título: ");
                        String tituloL = scanner.nextLine();
                        System.out.print("Año: ");
                        int anioL = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Autor: ");
                        String autor = scanner.nextLine();
                        System.out.print("Género (Ficción, No Ficción, Ciencia, Historia): ");
                        String genero = scanner.nextLine();
                        biblioteca.agregarPublicacion(new Libro(tituloL, anioL, autor, genero));
                        break;

                    case 2:
                        System.out.print("Título: ");
                        String tituloR = scanner.nextLine();
                        System.out.print("Año: ");
                        int anioR = scanner.nextInt();
                        System.out.print("Número de edición: ");
                        int edicion = scanner.nextInt();
                        biblioteca.agregarPublicacion(new Revista(tituloR, anioR, edicion));
                        break;

                    case 3:
                        System.out.print("Título: ");
                        String tituloI = scanner.nextLine();
                        System.out.print("Año: ");
                        int anioI = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Ilustrador: ");
                        String ilustrador = scanner.nextLine();
                        System.out.print("Ancho: ");
                        double ancho = scanner.nextDouble();
                        System.out.print("Alto: ");
                        double alto = scanner.nextDouble();
                        biblioteca.agregarPublicacion(new Ilustracion(tituloI, anioI, ilustrador, ancho, alto));
                        break;

                    case 4:
                        biblioteca.mostrarPublicaciones();
                        break;

                    case 5:
                        biblioteca.leerPublicaciones();
                        break;

                    case 0:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opción inválida.");
                }
            } catch (PublicacionExistenteException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error inesperado. Intente nuevamente.");
                scanner.nextLine(); // limpiar buffer en caso de error
            }

        } while (opcion != 0);
    }
}


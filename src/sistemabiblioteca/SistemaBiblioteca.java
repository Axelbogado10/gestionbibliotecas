/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabiblioteca;

import java.util.Scanner;



/**
 *
 * @author Tobias
 */
public class SistemaBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
         // Agregando libros de ejemplo
        Libro libro1 = new Libro("Cervantes", "FICCION", "DonQuijote", 1605);
        Libro libro2 = new Libro("Saint-Exupery", "FICCION", "ElPrincipito", 1943);
        Libro libro3 = new Libro("Hawking", "CIENCIA", "BreveHistoriaDelTiempo", 1988);

        // Agregando revistas de ejemplo
        Revista revista1 = new Revista( "NationalGeographic", 2023, 1);
        Revista revista2 = new Revista( "ScientificAmerican", 2022, 2);
        Revista revista3 = new Revista( "TimeMagazine", 2024, 3);

        // Agregando ilustraciones de ejemplo
        Ilustracion ilustracion1 = new Ilustracion("VanGogh",  "LaNocheEstrellada",920, 720, 1889);
        Ilustracion ilustracion2 = new Ilustracion("DaVinci", "MonaLisa", 1503, 770, 530);
        Ilustracion ilustracion3 = new Ilustracion("Munch", "ElGrito", 1893, 910, 740);

        // Agregando todas las publicaciones a la biblioteca
        biblioteca.agregarPublicacion(libro1);
        biblioteca.agregarPublicacion(libro2);
        biblioteca.agregarPublicacion(libro3);
        biblioteca.agregarPublicacion(revista1);
        biblioteca.agregarPublicacion(revista2);
        biblioteca.agregarPublicacion(revista3);                  
        biblioteca.agregarPublicacion(ilustracion1);
        biblioteca.agregarPublicacion(ilustracion2);
        biblioteca.agregarPublicacion(ilustracion3);
        do{
            System.out.println("\n===== Menú Biblioteca =====");
            System.out.println("1. Agregar Libro");
            System.out.println("2. Agregar Revista");
            System.out.println("3. Agregar Ilustración");
            System.out.println("4. Mostrar Publicaciones");
            System.out.println("5. Leer Publicaciones");
            System.out.println("6. ordenar por año");
            System.out.println("7. ordenar por Titulo");
            System.out.println("8. ordenar por autor de libro");
            System.out.println("9. Ordenar por area");
            System.out.println("10.ordenar por tipo");
            System.out.println("11.Ordenar libro por año");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

switch (opcion) {
case 1:
            System.out.print("Título: ");
            String tituloLibro = scanner.nextLine();
            System.out.print("Año: ");
            int anioLibro = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Autor: ");
            String autorLibro = scanner.nextLine();
            System.out.println("Genero: ");
            String generoStrLibro = scanner.nextLine();
                if (!generoStrLibro.equals("FICCION") &&
                !generoStrLibro.equals("NO_FICCION") &&
                !generoStrLibro.equals("CIENCIA") &&
                !generoStrLibro.equals("HISTORIA")) {
    
                    System.out.println(" Género inválido.");
                    break;
                }else{
                    biblioteca.agregarPublicacion(new Libro(autorLibro, generoStrLibro, tituloLibro, anioLibro));
                    break;
                }
case 2:
                    System.out.print("Título: ");
                    String tituloRevista = scanner.nextLine();
                    System.out.print("Año: ");
                    int anioRevista = scanner.nextInt();
                    System.out.print("Número de edición: ");
                    int edicion = scanner.nextInt();
                    scanner.nextLine();
                    biblioteca.agregarPublicacion(new Revista(tituloRevista, anioRevista, edicion));
                    break;
case 3:
                    System.out.print("Título: ");
                    String tituloIlustracion = scanner.nextLine();
                    System.out.print("Año: ");
                    int anioIlustracion = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ilustrador: ");
                    String ilustrador = scanner.nextLine();
                    System.out.print("Ancho (cm): ");
                    int ancho = scanner.nextInt();
                    System.out.print("Alto (cm): ");
                    int alto = scanner.nextInt();
                    scanner.nextLine();
                    biblioteca.agregarPublicacion(new Ilustracion( ilustrador, tituloIlustracion, anioIlustracion, ancho, alto));
                    break;
case 4:
                    biblioteca.mostrarPublicaciones();
                    break;
case 5:
                    System.out.println("Select libro pa leer: ");
                    tituloLibro = scanner.nextLine();
                    biblioteca.leerPublicacion(tituloLibro);
                    break;
case 6:
                   biblioteca.OrdenarPoraAño();
                   break;
case 7:      
                   biblioteca.OrdenarPorTitulo();
                   break;
case 8:
                   biblioteca.OrdenarAutoLibro();
                   break;
case 9:
                   biblioteca.OrdenarPorArea();
                   break;
case 10:
                   biblioteca.OrdenarPorTipo();
                   break;
case 11:
                   biblioteca.OrdenarPorAñoLibro();
                   break;
                   //dsdddss
case 0:
System.out.println("Saliendo del sistema...");
                    break;
default:
System.out.println("Opción inválida.");
            }
    }while (opcion != 0);

    scanner.close();
    }
}
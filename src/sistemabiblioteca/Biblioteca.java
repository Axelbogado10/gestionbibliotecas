/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabiblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Tobias
 */
public class Biblioteca {
    private List<Publicacion> publicaciones;
    private List<Libro> ListaLibro;
    private List<Ilustracion> Ilustraciones;
    private List<Revista> Revistas;

    public Biblioteca() {
        publicaciones = new ArrayList<>();
        ListaLibro = new ArrayList<>();
        Ilustraciones = new ArrayList<>();
        Revistas = new ArrayList<>();
    }
    
   public void agregarPublicacion(Publicacion pub) {
        if (publicaciones.contains(pub)) {
            System.out.println("Ya está esa publicación.");
        } else {
            publicaciones.add(pub);
            if (pub instanceof Libro) {
                ListaLibro.add((Libro) pub);
            }else if (pub instanceof Ilustracion) {
                Ilustraciones.add((Ilustracion) pub);
           } else if(pub instanceof Revista){
               Revistas.add((Revista)pub);
           }   
                
            
            System.out.println("Publicación: " + pub.getTitulo() + " agregado con éxito");
        }
    }

    
    public void mostrarPublicaciones() {
        System.out.println("\n Publicaciones en la Biblioteca:");
        if (publicaciones.isEmpty()) {
            System.out.println("No hay publicaciones registradas.");
        } else {
            publicaciones.forEach(System.out::println);
            }
        }        
    
    
    public void leerPublicacion(String o) {
        for (Publicacion p: publicaciones){
            if (p instanceof Leible && p.titulo.equals(o)){
                ((Leible) p).leer();
            }else{
                System.out.println("Eso es una ilustracion, no se puede leer.");
            }
        }
    }

    public void OrdenarPoraAño () {
        Collections.sort(publicaciones);
        for(Publicacion  p : publicaciones){
        System.out.println(p );
    }

    }
    
    public void OrdenarPorTitulo(){
        Collections.sort(publicaciones, new ComparadorPorNombre());
        System.out.println("/nOrdenados por titulo");
        publicaciones.forEach(System.out::println);
    }
    
    public void OrdenarAutoLibro(){
        Collections.sort(ListaLibro, new CompararNombreAutorLibro());
        System.out.println("/n Ordenado por Autor");
        ListaLibro.forEach(System.out::println);
    }
        
     public void OrdenarPorArea(){
        Collections.sort(Ilustraciones, new CompararArea());
        System.out.println("/n ordenado por area");
        Ilustraciones.forEach(System.out::println);
     }
     
     public void OrdenarPorTipo(){
           System.out.println("\n Publicaciones en la Biblioteca:");
        if (publicaciones.isEmpty()) {
            System.out.println("No hay publicaciones registradas.");
        } else {
            ListaLibro.forEach(System.out::println);
            Revistas.forEach(System.out::println);
            Ilustraciones.forEach(System.out::println);
            }
        }        
     
     public void OrdenarPorAñoLibro(){
         if (ListaLibro.isEmpty()){
             System.out.println("no hay libros registrados");
            } else {
                     Libro libroviejo= Collections.min(ListaLibro);
                     Libro libronuevo = Collections.max(ListaLibro);
                     
         System.out.println("libro mas viejo es" + libroviejo);
         System.out.println("libro mas nuevo es" + libronuevo);
         }
     }
}
    
      


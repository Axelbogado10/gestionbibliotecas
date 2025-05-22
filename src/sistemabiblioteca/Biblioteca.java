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
    private List<Libro> listaLibro;
    private List<Ilustracion> ilustraciones;
    private List<Revista> revistas;

    public Biblioteca() {
        publicaciones = new ArrayList<>();
        listaLibro = new ArrayList<>();
        ilustraciones = new ArrayList<>();
        revistas = new ArrayList<>();
    }
    
   public void agregarPublicacion(Publicacion pub) {
        if (publicaciones.contains(pub)) {
            System.out.println("Ya está esa publicación.");
        } else {
            publicaciones.add(pub);
            if (pub instanceof Libro) {
                listaLibro.add((Libro) pub);
            }else if (pub instanceof Ilustracion) {
                ilustraciones.add((Ilustracion) pub);
           } else if(pub instanceof Revista){
               revistas.add((Revista)pub);
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
    
    public void ordenarPorTitulo(){
        Collections.sort(publicaciones, new ComparadorPorNombre());
        System.out.println("/nOrdenados por titulo");
        publicaciones.forEach(System.out::println);
    }
    
    public void ordenarAutoLibro(){
        Collections.sort(listaLibro, new CompararNombreAutorLibro());
        System.out.println("/n Ordenado por Autor");
        listaLibro.forEach(System.out::println);
    }
        
     public void ordenarPorArea(){
        Collections.sort(ilustraciones, new CompararArea());
        System.out.println("/n ordenado por area");
        ilustraciones.forEach(System.out::println);
     }
     
     public void ordenarPorTipo(){
           System.out.println("\n Publicaciones en la Biblioteca:");
        if (publicaciones.isEmpty()) {
            System.out.println("No hay publicaciones registradas.");
        } else {
            listaLibro.forEach(System.out::println);
            revistas.forEach(System.out::println);
            ilustraciones.forEach(System.out::println);
            }
        }        
     
     public void ordenarPorAñoLibro(){
         if (listaLibro.isEmpty()){
             System.out.println("no hay libros registrados");
            } else {
                     Libro libroviejo= Collections.min(listaLibro);
                     Libro libronuevo = Collections.max(listaLibro);
                     
         System.out.println("libro mas viejo es" + libroviejo);
         System.out.println("libro mas nuevo es" + libronuevo);
         }
     }
}
    
      


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabiblioteca;

/**
 *
 * @author Tobias
 */
public class Libro extends Publicacion implements Leible {
    private String autor;
    private String genero;

    public Libro(String autor, String genero, String titulo, int año) {
        super(titulo, año);
        this.autor = autor;
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }
    
    
    
@Override
    public void leer() {
        System.out.println("Leyendo el libro: " + getTitulo());
    }

@Override
    public String toString() {
        return super.toString() + ", Autor: " + autor + ", Género: " + genero + "----LIBRO----";
    }    
}
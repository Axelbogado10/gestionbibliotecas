/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabiblioteca;

/**
 *
 * @author Tobias
 */
public class Ilustracion extends Publicacion {
    private String autor;
    private int ancho;
    private int alto;

    public Ilustracion(String autor, String titulo, int año, int ancho, int alto) {
        super(titulo, año);
        this.autor = autor;
        this.ancho = ancho;
        this.alto = alto;
    }
    
     public int calcularArea(){
        int area = ancho * alto;
        return area;
     }
     
@Override
    public String toString() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", dimensiones en cm: " + ancho + " x " + alto + "----ILUSTRACION----";
    }    
}
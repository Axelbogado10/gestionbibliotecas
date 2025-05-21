/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemabiblioteca;

import java.util.Objects;

/**
 *
 * @author Tobias
 */
public abstract class Publicacion implements Comparable<Publicacion>{
    protected String titulo;
    private int año;

    public Publicacion(String titulo, int año) {
        this.titulo = titulo;
        this.año = año;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAño() {
        return año;
    }
    
@Override
    public boolean equals(Object o) {
        if (this == o) return true;  // si es el mismo objeto
        if (!(o instanceof Publicacion)) return false;  // si no es del mismo tipo
        Publicacion p = (Publicacion) o;
        return this.año == p.año && this.titulo.equalsIgnoreCase(p.titulo);
}

    
@Override
public int hashCode() {
    return Objects.hash(titulo.toLowerCase(), año);
}

@Override
    public String toString() {
        return "Titulo: " + titulo + ", Año: " + año;
    }
    
    
@Override
    public int compareTo(Publicacion o) {
       return Double.compare(this.año, o.año);
    }

}

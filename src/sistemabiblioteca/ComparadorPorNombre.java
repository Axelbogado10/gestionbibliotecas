/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabiblioteca;

import java.util.Comparator;

/**
 *
 * @author bogad
 */
public class ComparadorPorNombre implements Comparator<Publicacion> {

    @Override
    public int compare(Publicacion o1, Publicacion o2) {
        return o1.getTitulo().toLowerCase().compareTo(o2.getTitulo().toLowerCase());
        
    }
    
}

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
public class CompararNombreAutorLibro implements Comparator<Libro>{

    @Override
    public int compare(Libro o1, Libro o2) {
            return o1.getAutor().compareToIgnoreCase(o2.getAutor());
    }
    
    
}

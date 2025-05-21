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
public class CompararArea implements Comparator<Ilustracion> {

    @Override
    public int compare(Ilustracion o1, Ilustracion o2) {
            return Integer.compare(o2.calcularArea(), o1.calcularArea());
    }
    
}

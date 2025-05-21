/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabiblioteca;

/**
 *
 * @author Tobias
 */
public class Revista extends Publicacion implements Leible {
    private int edicion;


    public Revista(String titulo, int año, int edicion) {
        super(titulo, año);
        this.edicion = edicion;
        

    }
    
    
@Override
    public void leer() {
        System.out.println("Leyendo el libro: " + getTitulo());
    }

@Override
    public String toString() {
        return super.toString() + ", Numero de edicion: " + edicion + "----REVISTA----";
    }    


}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecasimparcial;

/**
 *
 * @author chuch
 */
public class Revista extends Publicacion implements Leible {
    private int numeroEdicion;

    public Revista(String titulo, int anio, int numeroEdicion) {
        super(titulo, anio);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public void leer() {
        System.out.println("Leyendo revista: " + getTitulo() + " Edición Nº" + numeroEdicion);
    }

    @Override
    public String toString() {
        return super.toString() + " - Revista, Edición: " + numeroEdicion;
    }
}


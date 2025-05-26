/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecasimparcial;

/**
 *
 * @author chuch
 */
public class Libro extends Publicacion implements Leible {
    private String autor;
    private String genero;

    public Libro(String titulo, int anio, String autor, String genero) {
        super(titulo, anio);
        this.autor = autor;
        this.genero = genero;
    }

    @Override
    public void leer() {
        System.out.println("Leyendo libro: " + getTitulo() + " de " + autor);
    }

    @Override
    public String toString() {
        return super.toString() + " - Libro, Autor: " + autor + ", Género: " + genero;
    }
}


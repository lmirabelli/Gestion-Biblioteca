/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecasimparcial;

/**
 *
 * @author chuch
 */
public abstract class Publicacion {
    private String titulo;
    private int anio;

    public Publicacion(String titulo, int anio) {
        this.titulo = titulo;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Publicacion other) {
            return this.titulo.equalsIgnoreCase(other.titulo) && this.anio == other.anio;
        }
        return false;
    }

    @Override
    public String toString() {
        return titulo + " (" + anio + ")";
    }
}


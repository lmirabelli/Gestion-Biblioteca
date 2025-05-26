/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecasimparcial;

/**
 *
 * @author chuch
 */
public class Ilustracion extends Publicacion {
    private String ilustrador;
    private double ancho;
    private double alto;

    public Ilustracion(String titulo, int anio, String ilustrador, double ancho, double alto) {
        super(titulo, anio);
        this.ilustrador = ilustrador;
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public String toString() {
        return super.toString() + " - Ilustración, Ilustrador: " + ilustrador + ", Dimensiones: " + ancho + "x" + alto;
    }
}


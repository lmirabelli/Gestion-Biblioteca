/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecasimparcial;

/**
 *
 * @author chuch
 */
import java.util.*;

public class Biblioteca {
    private List<Publicacion> publicaciones;

    public Biblioteca() {
        publicaciones = new ArrayList<>();
    }

    public void agregarPublicacion(Publicacion pub) throws PublicacionExistenteException {
        if (publicaciones.contains(pub)) {
            throw new PublicacionExistenteException("La publicación ya existe: " + pub.getTitulo() + " (" + pub.getAnio() + ")");
        }
        publicaciones.add(pub);
    }

    public void mostrarPublicaciones() {
        System.out.println("Publicaciones en la biblioteca:");
        for (Publicacion pub : publicaciones) {
            System.out.println(pub);
        }
    }

    public void leerPublicaciones() {
        for (Publicacion pub : publicaciones) {
            if (pub instanceof Leible leible) {
                leible.leer();
            } else {
                System.out.println("No se puede leer: " + pub.getTitulo());
            }
        }
    }
}


package org.fabianrc.app.jardin;

import org.fabianrc.app.hogar.Persona;

public class Perro {

    protected String nombre;
    protected String raza;

    String jugar(Persona persona) {
        return persona.lanzarPelota();
    }
}

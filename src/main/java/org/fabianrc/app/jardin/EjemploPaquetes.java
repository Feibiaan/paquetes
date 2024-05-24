package org.fabianrc.app.jardin;

import org.fabianrc.app.hogar.*;
import static org.fabianrc.app.hogar.Persona.*;
import static org.fabianrc.app.hogar.ColorPelo.*;

public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona p = new Persona();
        p.setNombre("Fabian");
        p.setColorPelo(NEGRO);
        System.out.println(p.getNombre());
        System.out.println("color del pelo: " + p.getColorPelo());

        Perro perro = new Perro();
        perro.nombre = "Tobby";
        perro.raza = "Bulldog";
        String jugando = perro.jugar(p);
        System.out.println("jugando = " + jugando);
        String saludo = saludar();
        System.out.println("saludo = " + saludo);
        String generoHombre = GENERO_MASCULINO;
        System.out.println("generoHombre = " + generoHombre);

    }
}

package org.fabianrc.app.hogar;

public class Persona {
    private String nombre;
    private String apellido;

    private ColorPelo colorPelo;

    public static final String GENERO_MASCULINO = "Masculino";
    public static final String GENERO_FEMENINO = "Femenino";

    public java.lang.String getNombre() {
        return nombre;
    }

    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }

    public java.lang.String getApellido() {
        return apellido;
    }

    public void setApellido(java.lang.String apellido) {
        this.apellido = apellido;
    }

    public String lanzarPelota() {
        return "lanza la pelota al perro";
    }

    public static String saludar() {
        return "hola que tal!";
    }

    public ColorPelo getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(ColorPelo colorPelo) {
        this.colorPelo = colorPelo;
    }
}

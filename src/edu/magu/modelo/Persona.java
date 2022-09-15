package edu.magu.modelo;

public abstract class Persona {
    private int edad;
    private String nombre;

    public Persona() {
        this.edad = 10;
    }

    public Persona(String nombre) {
        this();
        this.nombre = nombre;
    }

    public Persona(String nombre, int edad) {
        this(nombre);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad > 0){
            this.edad = edad;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("nombre='" + nombre)
                .append("\nedad=" + edad);
        return sb.toString();
    }
}

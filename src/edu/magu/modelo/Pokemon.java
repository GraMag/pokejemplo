package edu.magu.modelo;

public class Pokemon {

    private int id;
    private int nivel;
    private String nombre;
    private int saludActual;
    private int saludMaxima;
    private Tipo tipo;

    public Pokemon() {
        this.nivel = 1;
        this.saludMaxima = 10;
        this.saludActual = saludMaxima;
    }

    public Pokemon(int id, String nombre, Tipo tipo) {
        this();
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Pokemon(int id, String nombre, Tipo tipo, int nivel) {
        this(id, nombre, tipo);
        this.nivel = nivel;
        for (int i = 2; i < nivel; i++) {
            calcularSaludMaxima();
        }
        this.saludActual = saludMaxima;
    }

    public Pokemon(int id, String nombre, Tipo tipo, int nivel, int saludActual) {
        this(id, nombre, tipo, nivel);
        this.saludActual = saludActual;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSaludActual() {
        return saludActual;
    }

    public void setSaludActual(int saludActual) {
        this.saludActual = saludActual;
    }

    public int getSaludMaxima() {
        return saludMaxima;
    }

    public void setSaludMaxima(int saludMaxima) {
        this.saludMaxima = saludMaxima;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    private void calcularSaludMaxima(){
        if(nivel < 10 ){
            saludMaxima += ((int) saludMaxima * 0.1);
        } else if (nivel < 35) {
            saludMaxima += ((int) saludMaxima * 0.15);
        } else if (nivel < 50) {
            saludMaxima += ((int) saludMaxima * 0.20);
        } else {
            saludMaxima += ((int) saludMaxima * 0.25);
        }
    }

    public String atacar(int ataque){
        String ataqueSeleccionado;
        switch (ataque){
            case 1:
                ataqueSeleccionado = "Ataque 1";
                break;
            case 2:
                ataqueSeleccionado = "Ataque 2";
                break;
            case 3:
                ataqueSeleccionado = "Ataque 3";
                break;
            default:
                return "Ataque 4";
        }
        return ataqueSeleccionado;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nId: " + id);
        sb.append("\nNombre: " + nombre);
        sb.append("\nNivel: " + nivel);
        sb.append("\nTipo: " + tipo);
        sb.append("\nSalud: " + saludActual + "/" + saludMaxima);
        sb.append("\n----------------");
        return sb.toString();
    }
}

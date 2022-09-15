package edu.magu.modelo;

import java.util.Stack;

public class Inventario {
    private Stack<Pokebola> inventario;


    public Inventario() {
        this.inventario = new Stack<Pokebola>();
    }

    public Stack<Pokebola> getInventario() {
        return inventario;
    }

    public void setInventario(Stack<Pokebola> inventario) {
        this.inventario = inventario;
    }

    public void agregarItem(){
        inventario.push(new Pokebola());
    }
}

package edu.magu.modelo;

import java.util.ArrayList;
import java.util.List;

public class Entrenador extends Persona implements Atrapable {

    private final int MAX_POKEMON = 6;
    private Pokemon[] pokemonActivos;
    private Inventario inventario;
    private List<Pokemon> pokemonAtrapados;

    public Entrenador() {
    }

    public Entrenador(String nombre) {
        super(nombre);
        pokemonActivos = new Pokemon[MAX_POKEMON];
        inventario = new Inventario();
        pokemonAtrapados = new ArrayList<Pokemon>();

    }

    public Entrenador(String nombre, int edad) {
        super(nombre, edad);
        pokemonActivos = new Pokemon[MAX_POKEMON];
        inventario = new Inventario();
        pokemonAtrapados = new ArrayList<Pokemon>();
    }

    public Pokemon[] getPokemonActivos() {
        return pokemonActivos;
    }

    public void setPokemonActivos(Pokemon[] pokemonActivos) {
        this.pokemonActivos = pokemonActivos;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public List<Pokemon> getPokemonAtrapados() {
        return pokemonAtrapados;
    }

    public void setPokemonAtrapados(List<Pokemon> pokemonAtrapados) {
        this.pokemonAtrapados = pokemonAtrapados;
    }

    @Override
    public boolean atrapar(Pokemon pokemon) {
        Pokebola pokebola = new Pokebola();
        if(!inventario.getInventario().empty()){
            inventario.getInventario().pop();
            if(pokebola.atrapar(pokemon)){
                if(this.pokemonActivos[5] == null){
                    for (int i = 0; i < this.pokemonActivos.length; i++) {
                        if(this.pokemonActivos[i] == null){
                            this.pokemonActivos[i] = pokemon;
                            break;
                        }
                    }
                } else {
                    pokemonAtrapados.add(pokemon);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        if(pokemonActivos[0] != null) {
            for (int i = 0; i < this.pokemonActivos.length-1; i++) {
                if(this.pokemonActivos[i] == null){
                    break;
                }
                sb.append(this.pokemonActivos[i].toString());

            }
        }
        if(pokemonAtrapados.size() > 0){
            for (Pokemon poke : pokemonAtrapados) {
                sb.append("\n" + poke.toString());
            }
        }
        if(!inventario.getInventario().empty()){
            sb.append("\nItems: " + inventario.getInventario().size());
        }
        return sb.toString();
    }
}

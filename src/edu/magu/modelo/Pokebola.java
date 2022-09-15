package edu.magu.modelo;

public class Pokebola implements Atrapable{
    @Override
    public boolean atrapar(Pokemon pokemon) {
        int max = 100;
        int min = 1;
        int rango = max - min + 1;
        int random = (int)(Math.random() * rango) + min;

        return (pokemon.getNivel() <= 5
            || (pokemon.getNivel() <= 15 && random > 25)
            || (pokemon.getNivel() <= 30 && random > 50)
            || (pokemon.getNivel() <= 50 && random > 75)
            || (pokemon.getNivel() > 50 && random > 90));
    }
}

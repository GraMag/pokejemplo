package edu.magu.vista;

import edu.magu.modelo.Entrenador;
import edu.magu.modelo.Pokebola;
import edu.magu.modelo.Pokemon;
import edu.magu.modelo.Tipo;

public class Main {
    public static void main(String[] args) {
        Entrenador persona = new Entrenador("Ash");
        Pokemon pokemon = new Pokemon(25, "Pikachu", Tipo.ELECTRICO);
        Pokemon pokemon1 = new Pokemon(1,"Bulbasaur", Tipo.TIERRA, 15);
        persona.getInventario().agregarItem();
        persona.getInventario().agregarItem();

        persona.atrapar(pokemon);
        persona.atrapar(pokemon1);


        System.out.println(persona.toString());

    }
}

package com.inatel.pedro.Treinador;

import com.inatel.pedro.Pokemon.Pokemon;

public class Treinador {
    private final String nome;
    private final Pokemon[] pokemons;

    public Treinador(String nome) {
        this.nome = nome;
        this.pokemons = new Pokemon[10];
    }

    public Pokemon[] getPokemons() {
        return pokemons;
    }

    public void addPokemon(Pokemon p) {
        for (int i = 0; i < pokemons.length; i++) {
            if (pokemons[i] != null) continue;

            pokemons[i] = p;
            break;
        }
    }

    public void mostraInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Pokemons: ");
        for (Pokemon p :
                pokemons) {
            p.mostraInfo("\t - ");
        }
    }
}

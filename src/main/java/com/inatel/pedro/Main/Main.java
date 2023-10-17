package com.inatel.pedro.Main;

import com.inatel.pedro.Interfaces.AtaqueEspecial;
import com.inatel.pedro.Interfaces.FazerBarulho;

import com.inatel.pedro.Pokemon.Bulbassaur;
import com.inatel.pedro.Pokemon.Pikachu;
import com.inatel.pedro.Pokemon.Pokemon;
import com.inatel.pedro.Pokemon.Squirtle;

import com.inatel.pedro.Treinador.Treinador;

public class Main {
    public static void main(String[] args) {
        Treinador treinador = new Treinador("Ash Ketchup");

        Pokemon squirtle = new Squirtle(1);
        Pokemon bulbassaur = new Bulbassaur(23.3f);
        Pokemon pikachu = new Pikachu(12, 4);

        treinador.addPokemon(squirtle);
        treinador.addPokemon(bulbassaur);
        treinador.addPokemon(pikachu);

        for (Pokemon p :
                treinador.getPokemons()) {
            System.out.println("-".repeat(30));
            if (p == null) break;
            p.mostraInfo();
            p.atacar();
            if (p instanceof FazerBarulho) ((FazerBarulho) p).fazerBarulho();
            if (p instanceof AtaqueEspecial) ((AtaqueEspecial) p).ataqueEspecial();
            System.out.println("-".repeat(30));
        }

        System.out.println("Num de pokemons: " + Pokemon.qtdPokemon);

    }
}
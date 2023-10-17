package com.inatel.pedro.Pokemon;

import com.inatel.pedro.HeldItem.HeldItem;

public abstract class Pokemon {
    public static int qtdPokemon = 0;
    private final String nome;
    private final String tipo;
    public HeldItem heldItem;

    public Pokemon(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        qtdPokemon++;
    }

    public String getNome() {
        return nome;
    }

    public void setHeldItem(HeldItem heldItem) {
        this.heldItem = heldItem;
    }

    public void mostraInfo() {
        mostraInfo("");
    }

    public void mostraInfo(String indent) {
        System.out.println(indent + "Nome: " + nome);
        System.out.println(indent + "Tipo: " + tipo);

        if (heldItem != null) System.out.println("Item: " + heldItem.tipo);
    }

    public abstract void atacar();
}

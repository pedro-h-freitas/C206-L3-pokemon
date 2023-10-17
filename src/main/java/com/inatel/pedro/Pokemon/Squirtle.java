package com.inatel.pedro.Pokemon;

import com.inatel.pedro.Interfaces.FazerBarulho;

public class Squirtle extends Pokemon implements FazerBarulho {
    private final float multiplicadorAgua;

    public Squirtle(float multiplicadorAgua) {
        super("Squirtle", "água");
        this.multiplicadorAgua = multiplicadorAgua;
    }

    @Override
    public void mostraInfo() {
        mostraInfo("");
    }

    @Override
    public void mostraInfo(String indent) {
        super.mostraInfo(indent);
        System.out.println(indent + "Multiplicador Agua: " + multiplicadorAgua);
    }

    @Override
    public void atacar() {
        System.out.println(this.getNome() + " esta atacando!");
    }

    @Override
    public void fazerBarulho() {
        System.out.println(this.getNome() + " esta fazendo barulho!");
    }
}

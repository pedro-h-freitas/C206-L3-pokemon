package com.inatel.pedro.Pokemon;

import com.inatel.pedro.HeldItem.HeldItem;
import com.inatel.pedro.Interfaces.AtaqueEspecial;
import com.inatel.pedro.Interfaces.FazerBarulho;

public class Bulbassaur extends Pokemon implements FazerBarulho, AtaqueEspecial {
    private float luminosidadeAmbiente;

    public Bulbassaur(float luminosidadeAmbiente) {
        super("Bulbassaur", "grama");
        this.luminosidadeAmbiente = luminosidadeAmbiente;
    }

    @Override
    public void setHeldItem(HeldItem heldItem) {
        super.setHeldItem(heldItem);
        luminosidadeAmbiente += 300;
    }

    @Override
    public void mostraInfo() {
        mostraInfo("");
    }

    @Override
    public void mostraInfo(String indent) {
        super.mostraInfo(indent);
        System.out.println(indent + "Luminosidade Ambiente: " + luminosidadeAmbiente);
    }

    @Override
    public void atacar() {
        System.out.println(this.getNome() + " esta atacando!");
    }

    @Override
    public void fazerBarulho() {
        System.out.println(this.getNome() + " esta fazendo barulho!");
    }

    @Override
    public void ataqueEspecial() {
        if (luminosidadeAmbiente > 650) System.out.println(this.getNome() + " conseguiu ganhar de seu oponente!");
        System.out.println(this.getNome() + " perdeu a batalha");
    }

}

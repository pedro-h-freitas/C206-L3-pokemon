package com.inatel.pedro.Pokemon;

import com.inatel.pedro.HeldItem.HeldItem;
import com.inatel.pedro.Interfaces.AtaqueEspecial;
import com.inatel.pedro.Interfaces.FazerBarulho;

public class Pikachu extends Pokemon implements FazerBarulho, AtaqueEspecial {
    private float soltarRaios;
    private final float paralisiaEletrica;

    public Pikachu(float soltarRaios, float paralisiaEletrica) {
        super("Pikachu", "elétrico");
        this.soltarRaios = soltarRaios;
        this.paralisiaEletrica = paralisiaEletrica;
    }

    @Override
    public void setHeldItem(HeldItem heldItem) {
        super.setHeldItem(heldItem);
        soltarRaios += 200;
    }

    @Override
    public void mostraInfo() {
        mostraInfo("");
    }

    @Override
    public void mostraInfo(String indent) {
        super.mostraInfo(indent);
        System.out.println(indent + "Soltar Raios: " + soltarRaios);
        System.out.println(indent + "Paralisia Eletrica: " + paralisiaEletrica);
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
        if (soltarRaios > 750) System.out.println(this.getNome() + " conseguiu ganhar de seu oponente!");
        System.out.println(this.getNome() + " perdeu a batalha");
    }
}

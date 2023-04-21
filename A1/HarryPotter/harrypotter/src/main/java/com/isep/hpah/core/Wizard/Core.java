package com.isep.hpah.core.Wizard;

import java.util.Random;

public enum Core {
    PHOENIX_FEATHER, //Plume de phoenix
    UNICORN_HAIR, //Cheveux de licorne
    BASILISK_HORN, //Corne de basilic
    DRAGON_SCALE, //Ecaille de dragon
    VEELA_HAIR, //Cheveux de Vélane
    MERMAID_SCALE, //Ecaille de sirène
    CENTAUR_TAILE, //Queue de centaure
    WEREWOLF_FUR, //Fourrure de loup-garou
    FAIRY_WING, //Aile de fée
    KELPIE_MANE, //Crinière de kelpie
    HIPPOGRIFF_FEATHER; //Plume d'hippogriffe

    public static Core generateRandomCore() {
        Core[] values = Core.values();
        int length = values.length;
        int randIndex = new Random().nextInt(length);
        return values[randIndex];
    }    
}

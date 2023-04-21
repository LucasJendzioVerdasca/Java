package com.isep.hpah.core;

import com.isep.hpah.core.controller.GameLogic;


public class Main {
    public void main(String[] args) {
        // Démarrage du jeu
        GameLogic game = new GameLogic();
        game.startGame();
    }
}
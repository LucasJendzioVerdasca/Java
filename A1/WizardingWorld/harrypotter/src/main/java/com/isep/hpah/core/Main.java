package com.isep.hpah.core;

import com.isep.hpah.core.controller.GameLogic;

public class Main {
    public static void main(String[] args) {
        // Démarrage du jeu
        var game = new GameLogic();
        game.startGame();
    }
}
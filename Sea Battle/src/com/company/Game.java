package com.company;

import java.io.IOException;

public class Game {
    Player playerOne;
    RandomIntelligence playerTwo;

    public Game(Player playerOne, RandomIntelligence playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void startGame() throws IOException, InterruptedException {
        Displayer displayer = new Displayer();
        while (true) {
            displayer.clearScreen();
            displayer.displayMap(playerOne.getMap());
            displayer.displayRadar(playerOne.getRadar());
            if (playerOne.shoot()) {
                System.out.println("Класний постріл, продовжуйте!");
                continue;
            }

            while (true) {
                if (playerTwo.shoot()) {
                    System.out.println("Наш корабель попав під обстріл!");
                } else {
                    break;
                }
            }
        }
    }
}

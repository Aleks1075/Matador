package com.company;

import java.util.ArrayList;

public class Game {
    ArrayList<Player> players = new ArrayList<>();
    FileIO fileIO = new FileIO();

    public Game(){

        /*Player p1 = new Player("Tobias", 30000);
        Player p2 = new Player("Jesper", 30000);
        Player p3 = new Player("Tess", 30000);

        players.add(p1);
        players.add(p2);
        players.add(p3);*/

        ArrayList<String> data = new ArrayList<>();
        data = fileIO.readGameData();
        for(String s: data) {
            System.out.println(s);
            String[] values = s.split(": ");

            int balance = Integer.parseInt(values[1]);

            Player p1 = new Player(values [0], balance);

            players.add(p1);

        }

    }

    boolean hasGameData()
    {
        return false;

    }
    void runLoop()
    {


    }
    void takeTurn()
    {


    }
    void printAccounts()
    {


    }
    void saveGameData()
    {


    }

}

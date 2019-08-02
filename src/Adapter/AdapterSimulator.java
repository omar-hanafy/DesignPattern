package Adapter;

import java.util.ArrayList;

public class AdapterSimulator {
    public static void main(String[] args) {
        ArrayList<IEnemy> enemies = new ArrayList<>();

        enemies.add(new Tank());
        enemies.add(new Canon());
        enemies.add(new GaintAdapter(new Gaint()));

        for (IEnemy enemy : enemies) {
            enemy.fire();
            enemy.tankReload();
        }
    }
}
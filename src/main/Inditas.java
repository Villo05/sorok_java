
package main;

import main.Sor.Tipusok;

public class Inditas {
    public static void main(String[] args) {
      Asztal asztal = new Asztal();
      
      Sor[] alapSorok = new Sor[4];
        alapSorok[0] = new Sor(5.0, 500, Tipusok.VILAGOS);
        alapSorok[1] = new Sor(6.5, 400, Tipusok.BARNA);
        alapSorok[2] = new Sor(4.8, 330, Tipusok.VILAGOS);
        alapSorok[3] = new Sor(7.2, 200, Tipusok.BARNA);

        int db = (int)(Math.random() * 5);

        for (int i = 0; i < db; i++) {
            int index = (int)(Math.random() * 4);
            asztal.hozzaad(alapSorok[index]);
        }
      
      asztal.kiir();
      asztal.rajzol();

    }
}

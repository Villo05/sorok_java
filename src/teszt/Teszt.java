
package teszt;

import main.Asztal;
import main.Sor;
import main.Sor.Tipusok;

public class Teszt {
    public static void main(String[] args) {
        uresAsztal();
        egySorMegjelenites();
        haromSorRendezes();
    }
    
    //1
    public static void uresAsztal(){
        System.out.println("---Üres asztal:---");
        Asztal a = new Asztal();
        a.kiir();
        a.rajzol();
    }
    
    // 2
    public static void egySorMegjelenites() {
        System.out.println("\n=== 1 sör teszt ===");
        Asztal a = new Asztal();
        a.hozzaad(new Sor(5.0, 500, Tipusok.BARNA));
        a.kiir();
        a.rajzol();
    }

    // 3
    public static void haromSorRendezes() {
        System.out.println("\n=== 3 sör elrendezés teszt ===");
        Asztal a = new Asztal();
        a.hozzaad(new Sor(5.0, 500, Tipusok.VILAGOS));
        a.hozzaad(new Sor(6.5, 400, Tipusok.BARNA));
        a.hozzaad(new Sor(4.8, 330, Tipusok.VILAGOS));
        a.kiir();
        a.rajzol();
    }
}

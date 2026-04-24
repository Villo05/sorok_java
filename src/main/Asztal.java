
package main;


public class Asztal {
    private Sor[] sorok = new Sor[4];
    private int db = 0;
    
    public void hozzaad(Sor sor){
        if (db < 4){
            sorok[db] = sor;
            db++;
        }else{
            System.out.println("tele van az asztal");
        }
    }
    
    public void kiir(){
        System.out.println("\nSörök: ");
        for (int i = 0; i < db; i++){
            System.out.println(sorok[i]);
        }
    }
    
    public void rajzol(){
        System.out.println("\nAsztal: ");
        
        System.out.print("|");
        for (int i = 0; i < 2; i++){
            if (i < db) {
                System.out.print("o ");
            }else {
                System.out.print("  ");
            }
        }
        System.out.println("|");
        
        System.out.print("|");
        for (int i = 2; i < 4; i++){
            if (i < db){
                System.out.print("o ");
            }else {
                System.out.print("  ");
            }
        }
        System.out.println("|");
    }

}

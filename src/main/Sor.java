
package main;

import java.util.Objects;


public class Sor {
    
    public  enum Tipusok{VILAGOS, BARNA};
    private double fok;
    private double mennyiseg;
    private Tipusok tipus;

    public Sor() {
        this(3.2, 500, Tipusok.BARNA);
    }
    
    public Sor(double fok, double mennyiseg, Tipusok tipus) {
        this.fok = fok;
        this.mennyiseg = mennyiseg;
        this.tipus = tipus;
    }
    

    public double getAlkoholFok() {
        return fok;
    }

    public void setAlkoholFok(double fok) {
        this.fok = fok;
    }

    public double getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    public Tipusok getTipus() {
        return tipus;
    }

    public void kiiras(){
        System.out.println("alkohol: " + fok + 
                "%, mennyiség: " + mennyiseg +
                "ml típus: " + tipus);
    }
    
    public void ivas(){
        if (mennyiseg > 250){
            mennyiseg -= 250;
        }
    }

    @Override
    public String toString() {
        return "Sor{" + "fok=" + fok + ", mennyiseg=" + mennyiseg + ", tipus=" + tipus + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.fok) ^ (Double.doubleToLongBits(this.fok) >>> 32));
        hash = 17 * hash + Objects.hashCode(this.tipus);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sor other = (Sor) obj;
        if (Double.doubleToLongBits(this.fok) != Double.doubleToLongBits(other.fok)) {
            return false;
        }
        return this.tipus == other.tipus;
    }
}

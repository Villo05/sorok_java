
package main;

import java.util.Objects;


public class Sor {
    private double fok;
    private int mennyiseg;
    private String tipus;

    public Sor(double alkoholFok, int mennyiseg, String tipus) {
        this.fok = alkoholFok;
        this.mennyiseg = mennyiseg;
        this.tipus = tipus;
    }

    public double getAlkoholFok() {
        return fok;
    }

    public void setAlkoholFok(double alkoholFok) {
        this.fok = alkoholFok;
    }

    public int getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public void kiiras(){
        System.out.println("alkohol: " + fok + 
                "%, mennyiség: " + mennyiseg +
                "ml típus: " + tipus);
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.fok) ^ (Double.doubleToLongBits(this.fok) >>> 32));
        hash = 67 * hash + this.mennyiseg;
        hash = 67 * hash + Objects.hashCode(this.tipus);
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
        if (this.mennyiseg != other.mennyiseg) {
            return false;
        }
        return Objects.equals(this.tipus, other.tipus);
    }

    @Override
    public String toString() {
        return "Sor{" + "alkoholFok=" + fok + ", mennyiseg=" + mennyiseg + ", tipus=" + tipus + '}';
    }
    
    
    
    
   
    
    
}

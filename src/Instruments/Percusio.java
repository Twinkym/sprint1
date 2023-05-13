package Instruments;

public class Percusio extends Instrument{
    public Percusio(String nom, int preu) {
        super(nom, preu);
    }

    public String Tocar(){
        return "Està sonant un instrument de Percusio" + getNom() + getPreu();
    }
}

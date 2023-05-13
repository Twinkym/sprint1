package Instruments;

public class Vent extends Instrument{
    public Vent(String nom, int preu) {
        super(nom, preu);
    }

    public String Tocar(){
        return "Està sonant un instrument de Vent" + getNom() + getPreu();
    }
}

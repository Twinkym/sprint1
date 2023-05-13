package Instruments;

public class Corda extends Instrument{
    public Corda(String nom, int preu) {
        super(nom, preu);
    }

    public String Tocar(){
        return "Està sonant un instrument de Corda" + getNom() + getPreu();
    }
}

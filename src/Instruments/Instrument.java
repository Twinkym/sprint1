package Instruments;

public abstract class Instrument {

   private String nom;
   private int preu;

   public Instrument(String nom, int preu) {
      this.nom = nom;
      this.preu = preu;
   }

   public String getNom() {
      return nom;
   }

   public void setNom(String nom) {
      this.nom = nom;
   }

   public int getPreu() {
      return preu;
   }

   public void setPreu(int preu) {
      this.preu = preu;
   }
}

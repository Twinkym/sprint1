package Instruments;

public class Main {
    public static void main(String[] args) {

        Corda corda = new Corda(" Guitarra ", 15);
        Vent vent = new Vent(" Trompeta ", 30);
        Percusio percusio = new Percusio(" Timbal ", 40);

        System.out.println(corda.Tocar());
        System.out.println(percusio.Tocar());
        System.out.println(vent.Tocar());
    }
}
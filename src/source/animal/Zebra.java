package src.source.animal;

import static java.lang.System.out;

public class Zebra extends Animal{
    public Zebra(String nume) {
        super(nume);
    }
    @Override
    public void mananca(String mancare) {
        out.println("Zebra " + getNume()+ " " + mancare );
    }
}

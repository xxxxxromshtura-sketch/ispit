import com.sun.java.accessibility.util.EventID;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Automobil automobil = new Automobil(5, "Kia Rio", 2013, "RI 8212");
        Motor motor = new Motor("Suzuki", "RI 1232", "RXS 50", 2020);
        EvindencijaVozila evindencijaVozila = new EvindencijaVozila();

        evindencijaVozila.dodajVozilo(automobil);
        evindencijaVozila.dodajVozilo(motor);

        evindencijaVozila.spremiPodatkeUDatoteku("C:/Users/Sandro/Desktop/Vozila.txt");

    }
}

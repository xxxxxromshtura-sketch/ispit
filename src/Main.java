import com.sun.java.accessibility.util.EventID;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        EvindencijaVozila evindencijaVozila = new EvindencijaVozila();

        try {
            Automobil automobil = new Automobil(5, "Kia Rio", 2013, "RI 8212");
            Motor motor = new Motor("Suzuki", "RI 1232", "RXS 50", 2020);

            evindencijaVozila.dodajVozilo(automobil);
            evindencijaVozila.dodajVozilo(motor);

            Automobil test = new Automobil(5, "Bmw", 1500, "RI-2012");

        } catch (NeispravniPodaciException e) {
            System.out.println("GRESKA U PODACIMA: " + e.getMessage());
        }

        evindencijaVozila.spremiPodatkeUDatoteku("C:/Users/Sandro/Desktop/Vozila.txt");
    }
}


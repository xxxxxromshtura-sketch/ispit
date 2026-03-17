import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class EvindencijaVozila {

    ArrayList<Vozila> v = new ArrayList<>();

    public void dodajVozilo(Vozila vozila){
        v.add(vozila);
    }

    public void spremiPodatkeUDatoteku(String datoteka){
        for(Vozila vozila : v){
            try {
                FileOutputStream vozilo = new FileOutputStream(datoteka);
                vozilo.write(datoteka.getBytes());
                vozilo.close();
            }
            catch(Exception e){
                System.out.println("I/O greška: " + e.getMessage());
            }
        }
    }

    public void ucitajPodatkeIzDatoteke(String datoteka){
        for(Vozila vozila : v){
        try {
            FileInputStream vozilo = new FileInputStream(datoteka);
            vozilo.read(datoteka.getBytes());
            vozilo.close();
        }
        catch(Exception e){
            System.out.println("I/O greška: " + e.getMessage());
        }
    }
    }

}




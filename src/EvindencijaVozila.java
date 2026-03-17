import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileNotFoundException;
public class EvindencijaVozila {

    ArrayList<Vozila> v = new ArrayList<>();

    public void dodajVozilo(Vozila vozila){
        v.add(vozila);
    }

    public void spremiPodatkeUDatoteku(String datoteka){
        for(Vozila vozila : v){
            try {
                FileOutputStream vozilo = new FileOutputStream(datoteka);
                String temp = vozila.toString() + "\n";
                vozilo.write(temp.getBytes());
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




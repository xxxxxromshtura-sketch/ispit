import java.util.ArrayList;

public abstract class Vozila {

    private String marka;
    private String registracija;
    int godinaProizvodnje;

    public Vozila(String marka, String registracija, int godinaProizvodnje) {
        this.marka = marka;
        this.registracija = registracija;
        this.godinaProizvodnje = godinaProizvodnje;
    }
    public String getMarka() {
        return marka;
    }
    public void setMarka(String marka) {
        this.marka = marka;
    }
    public String getRegistracija() {
        return registracija;
    }
    public void setRegistracija(String registracija) {
        this.registracija = registracija;
    }
    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }
    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

public void ucitajPodatke(String unos) {
        String[] listaVozila = unos.split("|");
        this.marka = listaVozila[0];
        this.registracija = listaVozila[1];
        this.godinaProizvodnje = Integer.parseInt(listaVozila[2]);
}

public void prikaziPodatke() {
        System.out.println(" Marka automobila: " + marka + " Registracija: " + registracija + " Godina Proizvodnje: " + godinaProizvodnje);
}

public String toString() {
String novo = "";
novo += marka + "|";
novo += registracija + "|";
novo += godinaProizvodnje + "|";
return novo;
    }

}

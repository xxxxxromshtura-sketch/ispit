public class Automobil extends Vozila {

    int brojVrata;

    public Automobil(int brojVrata, String marka, int godinaProizvodnje, String registracija) {
        super (marka,registracija,godinaProizvodnje);
        this.brojVrata = brojVrata;
    }
    public int getBrojVrata() {
        return brojVrata;
    }
    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }

    @Override
    public void prikaziPodatke() {
        System.out.println("Marka automobila: " + getMarka() + " Registracija: " + getRegistracija() + " Godina Proizvodnje: " + getGodinaProizvodnje() + " Broj vrata: " + getBrojVrata());
    }

    @Override
    public String toString() {
        String novo = super.toString();
        novo += getBrojVrata() + "|";
        novo += getMarka() + "|";
        novo += getRegistracija() + "|";
        novo += getGodinaProizvodnje() + "|";
        return novo;
    }

    public void ucitajPodatke(String unos) {
        String[] listaVozila = unos.split("|");
       super.ucitajPodatke(unos);
       this.brojVrata = Integer.parseInt(listaVozila[3]);
    }
}

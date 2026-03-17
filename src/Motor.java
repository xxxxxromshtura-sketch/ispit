public class Motor extends Vozila{

    private String tip;

    public Motor(String marka, String registracija, String tip, int godinaProizovdnje) {
        super(marka, registracija, godinaProizovdnje);
        this.tip = tip;
    }
    public String getTip() {
        return tip;
    }
    public void setTip(String tip) {
        this.tip = tip;
    }

    @Override
    public void prikaziPodatke() {
        System.out.println("Marka automobila: " + getMarka() + " Registracija: " + getRegistracija() + " Godina Proizvodnje: " + getGodinaProizvodnje() + " Tip: " + getTip());
    }

    @Override
    public String toString() {
        String novo = super.toString();
        novo += getTip() + "|";
        novo += getMarka() + "|";
        novo += getRegistracija() + "|";
        novo += getGodinaProizvodnje() + "|";
        return novo;
    }

    public void ucitajPodatke(String unos) {
        String[] listaVozila = unos.split("|");
        super.ucitajPodatke(unos);
        this.tip = listaVozila[3];
    }

}

public class Client {
    private String nume;
    private String adresa;
    private ContBancar[] conturi;

    public Client(String nume, String adresa, ContBancar[] conturi) {
        this.nume = nume;
        this.adresa = adresa;
        this.conturi = conturi;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public ContBancar[] getConturi() {
        return conturi;
    }

    public void setConturi(ContBancar[] conturi) {
        this.conturi = conturi;
    }
}

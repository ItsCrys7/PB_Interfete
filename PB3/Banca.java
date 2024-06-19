public class Banca {
    private Client[] clienti;
    private String codBanca;

    public Banca(Client[] clienti, String codBanca) {
        this.clienti = clienti;
        this.codBanca = codBanca;
    }

    public Client[] getClienti() {
        return clienti;
    }

    public void setClienti(Client[] clienti) {
        this.clienti = clienti;
    }

    public String getCodBanca() {
        return codBanca;
    }

    public void setCodBanca(String codBanca) {
        this.codBanca = codBanca;
    }
}

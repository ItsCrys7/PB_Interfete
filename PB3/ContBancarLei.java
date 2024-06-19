public class ContBancarLei extends ContBancar {

    public ContBancarLei(String numarCont, float suma) {
        super(numarCont, suma);
    }

    @Override
    public float getSumaTotala() {
        return suma;
    }

    public void transfer(ContBancarLei contDestinatie, float suma) {
        if(this.suma >= suma) {
            this.suma -= suma;
            contDestinatie.setSuma(contDestinatie.getSuma() + suma);
        } else {
            System.out.println("Fonduri insuficiente pentru transfer.");
        }
    }
}


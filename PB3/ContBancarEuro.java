public class ContBancarEuro extends ContBancar {
    private static final float RATA_CONVERSIE = 36000;
    private static final float DOBANDA_FIXA = 0.3f;

    public ContBancarEuro(String numarCont, float suma) {
        super(numarCont, suma);
    }

    @Override
    public float getSumaTotala() {
        return suma * RATA_CONVERSIE;
    }

    public float getDobanda() {
        return (suma > 500) ? DOBANDA_FIXA : 0;
    }
}

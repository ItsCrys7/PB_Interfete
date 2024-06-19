public abstract class ContBancar {
    protected String numarCont;
    protected float suma;

    public ContBancar(String numarCont, float suma) {
        this.numarCont = numarCont;
        this.suma = suma;
    }

    public String getNumarCont() {
        return numarCont;
    }

    public void setNumarCont(String numarCont) {
        this.numarCont = numarCont;
    }

    public float getSuma() {
        return suma;
    }

    public void setSuma(float suma) {
        this.suma = suma;
    }

    public abstract float getSumaTotala();
}

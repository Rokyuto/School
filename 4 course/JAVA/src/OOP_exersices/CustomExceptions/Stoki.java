package OOP_exersices.CustomExceptions;

public abstract class Stoki {
    private float cena;
    private int nomerNaArtikul;

    Stoki(float cena, int nomerNaArtikul) {
        this.cena = cena;
        this.nomerNaArtikul = nomerNaArtikul;
    }

    public float getCena() {
        return cena;
    }
    public void setCena(float cena) {
        this.cena = cena;
    }
    public int getNomerNaArtikul() {
        return nomerNaArtikul;
    }
    public void setNomerNaArtikul(int nomerNaArtikul){
        this.nomerNaArtikul = nomerNaArtikul;
    }

    public abstract double checkPromo();
}

package OOP_exersices.CustomExceptions;

public class Kniga extends Stoki{

    private String avtor, zaglavie;
    private double promo;

    Kniga(float cena, int nomerNaArtikul, String avtor, String zaglavie,double promo) {
        super(cena, nomerNaArtikul);
        this.avtor = avtor;
        this.zaglavie = zaglavie;
        this.promo = promo;
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    public String getZaglavie() {
        return zaglavie;
    }

    public void setZaglavie(String zaglavie) {
        this.zaglavie = zaglavie;
    }

    public double getPromo() {
        return promo;
    }

    public void setPromo(float promo) {
        this.promo = promo;
    }

    @Override
    public double checkPromo() {
        return getCena() - (getCena() * getPromo());
    }

}

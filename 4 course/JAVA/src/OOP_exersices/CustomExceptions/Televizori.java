package OOP_exersices.CustomExceptions;

public class Televizori extends Stoki implements ElectricalAppliance{
    private String proizvoditel, model;
    private int power;
    private double promo;

    Televizori(float cena, int nomerNaArtikul, String proizvoditel, String model, int power,double promo) {
        super(cena, nomerNaArtikul);
        this.proizvoditel = proizvoditel;
        this.model = model;
        this.power = power;
        this.promo = promo;
    }

    public String getProizvoditel() {
        return proizvoditel;
    }

    public void setProizvoditel(String proizvoditel) {
        this.proizvoditel = proizvoditel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
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

    @Override
    public int calcElectricityCost() {
        return getPower();
    }


}

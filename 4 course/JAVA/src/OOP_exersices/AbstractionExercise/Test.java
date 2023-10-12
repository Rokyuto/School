package OOP_exersices.src.AbstractionExercise;

abstract class Stoki {
    private double price;
    private int articulNumber;

    public Stoki(double price, int articulNumber) {
        this.price = price;
        this.articulNumber = articulNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getArticulNumber() {
        return articulNumber;
    }

    public void setArticulNumber(int articulNumber) {
        this.articulNumber = articulNumber;
    }

    public abstract double checkPromo();
}

class Book extends Stoki {
    String author, title;

    public Book(double price, int articulNumber,String author,String title) {
        super(price, articulNumber);
        this.author = author;
        this.title = title;
    }

    @Override
    public double checkPromo() {
        double promoPercent = 0.15;
        return this.getPrice() - (this.getPrice() * promoPercent);
    }
}

class TV extends Stoki {
    private String proizvoidtel, model;
    private int power;

    public TV(double price, int articulNumber,String proizvoidtel,String model,int power) {
        super(price, articulNumber);
        this.proizvoidtel = proizvoidtel;
        this.model = model;
        this.power = power;
    }

    @Override
    public double checkPromo() {
        double promoPercent = 0.09;
        return this.getPrice() - (this.getPrice() * promoPercent);
    }

    public String getProizvoidtel() {
        return proizvoidtel;
    }

    public void setProizvoidtel(String proizvoidtel) {
        this.proizvoidtel = proizvoidtel;
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
}

public class Test {
    public static void main(String[] args) {
        Book book1 = new Book(50.0,2512,"Ivan","How to");
        TV tv1 = new TV(250.0,21564,"LG","LXS",250);

        System.out.println(book1.getPrice());
        System.out.println(tv1.getPrice());

        book1.setPrice(book1.checkPromo());
        tv1.setPrice(tv1.checkPromo());

        System.out.println(book1.getPrice());
        System.out.println(tv1.getPrice());
    }
}



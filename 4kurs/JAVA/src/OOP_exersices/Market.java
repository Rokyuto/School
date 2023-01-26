package OOP_exersices.src;

import java.util.ArrayList;

class Person{
	
}

class Otdel{
    Person manager;
    ArrayList<Person> rabotnici;

    Otdel(int workersCount){
        this.manager = new Person();
        for(int i = 0; i< workersCount; i++){
            this.rabotnici.add(dobavqneNaRabotnik());
        }
    }

    public Person dobavqneNaRabotnik(){
        Person worker = new Person();
        return worker;
    }
}

class Proizvoditel {
    private String name, country;

    Proizvoditel(String name, String country){
        this.name = name;
        this.country = country;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public String getCountry(){
        return this.country;
    }
}

class Product{
    private String name;
    ArrayList<Proizvoditel> productProizvoditeli;
    private double prize;
    private int garancia,count, minProductCount;

    Product(String name, Proizvoditel proizvoditel, double prize, int garancia, int productCount,int minProductCount){
        this.name = name;
        this.garancia = garancia;
        this.productProizvoditeli.add(proizvoditel);
        this.prize = prize;
        this.count = productCount;
        this.minProductCount = minProductCount;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setProductProizvoditel(Proizvoditel proizvoditel){
        this.productProizvoditeli.add(proizvoditel);
    }

    public ArrayList<Proizvoditel> getProductProizvoditel(){
        return this.productProizvoditeli;
    }

    public void setGarancia(int garancia){
        this.garancia = garancia;
    }

    public int getGarancia(){
        return this.garancia;
    }

    public void setPrize(double prize){
        this.prize = prize;
    }

    public double getPrize(){
        return this.prize;
    }

    public void setCount(int count){
        this.count = count;
    }

    public int getCount(){
        return this.count;
    }

    public void setMinProductCount(int count){
        this.minProductCount = count;
    }

    public int getMinProductCount(){
        return this.minProductCount;
    }

    public int buyProduct(int buyQuantity){
        if (checkProductQuantity()){
            return this.count - buyQuantity;
        }
        else
        {
            System.out.println("Nqma dostatuchno kolichestvo ot tozi product");
        }
        return 0;
    }

    public boolean checkProductQuantity(){
        return getCount() > minProductCount;
    }

    public void zarejdaneNaStoka(int quantity){
        setCount(getCount() + quantity);
    }

}

public class Market {

    ArrayList<Product> products;
    ArrayList<Otdel> otdeli;
    Otdel otdel1 = new Otdel(10);

    public ArrayList<Product> spravkaNaNalichniProducti(){
        ArrayList<Product> nalichniProducti = new ArrayList<>();
        for(Product currentProduct : products){
            if(currentProduct.getCount() > currentProduct.getMinProductCount()){
                nalichniProducti.add(currentProduct);
            }
        }
        return nalichniProducti;
    }

    public ArrayList<Product> spravkaGarancia(int minGarancia){
        ArrayList<Product> ProductiVGarancia = new ArrayList<>();
        for(Product currentProduct : products){
            if(currentProduct.getGarancia() > minGarancia){
                ProductiVGarancia.add(currentProduct);
            }
        }
        return ProductiVGarancia;
    }

    public ArrayList<String> spravkaProizvoditeli(ArrayList<Product> products){
        ArrayList<String> proizvoditeli = new ArrayList<>();
        for(Product currentProduct : products){
            for(Proizvoditel currentProizvoditel : currentProduct.getProductProizvoditel()){
                proizvoditeli.add(currentProizvoditel.getName());
            }
        }
        return proizvoditeli;
    }

}
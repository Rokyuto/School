package Building;

public class Test {

    House h1 = new House(250,500,"baavbip",3,"gbnwp");
    House h2 = new House(500,1000,"tyopmu",6,".ui;.u");
    House h3 = new House(300,600,"agfvsbh",2,"mntfmc");

    House[] houses = {h1,h2,h3};

    House.findLargestHouse(houses);
}

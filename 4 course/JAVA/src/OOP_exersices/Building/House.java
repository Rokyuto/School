package Building;

import java.util.Scanner;

public class House extends Building{

    private int numOfFloors;
    private String owner;

    public House(int height, double area, String address, int numOfFloors, String owner) {
        super(height, area, address);
        this.numOfFloors = numOfFloors;
        this.owner = owner;
    }

    public House() {
        super();
    }

    public int getNumOfFloors() {
        return numOfFloors;
    }

    public void setNumOfFloors(int numOfFloors) {
        try{
            if (numOfFloors <= 0 ){
                throw new InvalidInputException();
            }
            else{
                this.numOfFloors = numOfFloors;
            }
        }
        catch(InvalidInputException e){
            System.out.println(e.getMessage());
        }
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public House input(){
        Scanner myScanner = new Scanner(System.in);
        return new House(myScanner.nextInt(), myScanner.nextDouble(), myScanner.next(), myScanner.nextInt(), myScanner.next());
    }

    public void printHouse(){
        System.out.println("House Height: " + this.getHeight() + " " + "House Area: " + this.getArea() + " " + "House Address: " + this.getAddress() + " " + "House Number of floors: " + this.getNumOfFloors() + " " + "House Owner: " + this.getOwner());
    }

    public static House findLargestHouse(House[] houses){
        House largestHouse = new House();
        int space = 0;
        for (House currentHouse : houses) {
            if((currentHouse.getHeight() / currentHouse.getNumOfFloors()) > space){
                space = currentHouse.getHeight() / currentHouse.getNumOfFloors();
                largestHouse = currentHouse;
            }
        }
        return largestHouse;
    }
}

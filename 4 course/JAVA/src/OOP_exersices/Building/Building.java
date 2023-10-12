package Building;

import java.util.Scanner;

public class Building {
    private int height;
    private double area;
    private String address;


    public Building(int height, double area, String address) {
        this.height = height;
        this.area = area;
        this.address = address;
    }

    public Building(){}

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        try{
            if (height <= 0 ){
                throw new InvalidInputException();
            }
            else{
                this.height = height;
            }
        }
        catch(InvalidInputException e){
            System.out.println(e.getMessage());
        }
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        try{
            if (area <= 0 ){
                throw new InvalidInputException();
            }
            else{
                this.area = area;
            }
        }
        catch(InvalidInputException e){
            System.out.println(e.getMessage());
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Building input(){
        Scanner myScanner = new Scanner(System.in);
        return new Building(myScanner.nextInt(), myScanner.nextDouble(), myScanner.next());
    }

    public void printBuilding(){
        System.out.println("Building Height: " + this.getHeight() + " " + "Building Area: " + this.getArea() + " " + "Building Address: " + this.getAddress());
    }

}

package TravelCompany;

public class Main {
    public static void main(String[] args) {
        Break br = new Break("Berlin",3,100,"Eleon");
        Tour tour = new Tour("Barcelona",2,50,2);

        br.fixPrice(br.getPrice());
        System.out.println(br.getPrice());

        tour.fixPrice(tour.getPrice());
        System.out.println(tour.getPrice());
        System.out.println(tour.setNightsCount(tour.getDays()));
    }

}
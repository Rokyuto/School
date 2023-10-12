package TravelCompany;

public class Break extends Trip{
    private String hotelName;

    public Break(String destination, int days, double price, String hotelName) {
        super(destination, days, price);
        this.hotelName = hotelName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    @Override
    void fixPrice(double price) {
        setPrice(price + price * 0.4);
    }

}

package TravelCompany;

public class Tour extends Trip implements NightsCount{

    private int hotelsCount;

    public Tour(String destination, int days, double price, int hotelsCount) {
        super(destination, days, price);
        this.hotelsCount = hotelsCount;
    }

    public int getHotelsCount() {
        return hotelsCount;
    }

    public void setHotelsCount(int hotelsCount) {
        this.hotelsCount = hotelsCount;
    }

    @Override
    void fixPrice(double price) {
        setPrice(price + price * 0.1);
    }

    @Override
    public int setNightsCount(int tourDays) {
        return tourDays - 1;
    }
}

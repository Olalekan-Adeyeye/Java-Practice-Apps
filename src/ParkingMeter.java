public class ParkingMeter {
//    To know the number of minutes of parking time that has been purchased.

    private int parkingMinutesPurchased;

    public ParkingMeter(int parkingMinutesPurchased) {
        this.parkingMinutesPurchased = parkingMinutesPurchased;
    }

    public ParkingMeter(ParkingMeter meter) {
        this.parkingMinutesPurchased = meter.parkingMinutesPurchased;
    }

    public int getParkingMinutesPurchased() {
        return parkingMinutesPurchased;
    }

    public void setParkingMinutesPurchased(int parkingMinutesPurchased) {
        this.parkingMinutesPurchased = parkingMinutesPurchased;
    }
}

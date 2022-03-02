public class PoliceOfficer {
//    To know the police officer’s name and badge number.

//    To examine a ParkedCar object and a ParkingMeter object, and determine whether the car’s time has expired.

//    To issue a parking ticket (generate a ParkingTicket object) if the car’s time has expired.

    private String name;
    private String badgeNumber;
    private boolean carTimeExpired;

    public PoliceOfficer(String name, String badgeNumber) {
        this.name = name;
        this.badgeNumber = badgeNumber;
    }

    public PoliceOfficer(PoliceOfficer officer) {
        this.name = officer.name;
        this.badgeNumber = officer.badgeNumber;
        this.carTimeExpired = officer.carTimeExpired;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    public void hasCarTimeExpired(ParkedCar car, ParkingMeter meter){
        if (car.getNumberOfMinutesParked() > meter.getParkingMinutesPurchased())
            carTimeExpired = true;
    }

    public void issueParkingTicket(ParkingTicket ticket){
        if (carTimeExpired){
            ticket.reportIllegalParkedCar();
            ticket.reportFine();
            ticket.reportTicketIssuer();
        }
        else System.out.println("No illegal parking found.");
    }
}

public class ParkingTicket {

//  To report the name and badge number of the police officer issuing the ticket.

//  To report the amount of the fine, which is $25 for the first hour or part of an hour that the car is illegally parked, plus $10 for every additional hour or part of an hour that the car is illegally parked.

//  To report the name and badge number of the police officer issuing the ticket.
    private ParkedCar car;
    private ParkingMeter meter;
    private PoliceOfficer officer;

    public ParkingTicket(ParkedCar car, ParkingMeter meter, PoliceOfficer officer) {
        this.car = new ParkedCar(car);
        this.meter = new ParkingMeter(meter);
        this.officer = new PoliceOfficer(officer);
    }

    public void reportIllegalParkedCar(){
        System.out.printf("__Car info__%nMake: %s%nModel: %s%nColor: %s%nLicense Number: %s%n", car.getMake(), car.getModel(), car.getColor(), car.getLicenseNumber());
    }

    public void reportFine(){
        int fine = 25;
        if (car.getNumberOfMinutesParked() > meter.getParkingMinutesPurchased()){
            int calculateFine = ((car.getNumberOfMinutesParked() - meter.getParkingMinutesPurchased() - 1) * 10);
            fine += calculateFine;
        }
        System.out.println("Fine: $" + fine);
    }

    public void reportTicketIssuer(){
        System.out.println("Ticket issuer: Officer " + officer.getName() + ", Badge Number: " + officer.getBadgeNumber());
    }
}

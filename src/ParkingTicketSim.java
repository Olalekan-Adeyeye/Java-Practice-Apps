public class ParkingTicketSim {
    public static void main(String[] args) {
        ParkedCar car = new ParkedCar("Camry", "2021 Edition", "23-KJA-49", "Red", 6);
        ParkingMeter meter = new ParkingMeter(5);
        PoliceOfficer officer = new PoliceOfficer("Ellen Hansen", "256353");
        ParkingTicket ticket = new ParkingTicket(car, meter, officer);
        officer.hasCarTimeExpired(car, meter);
        officer.issueParkingTicket(ticket);
    }

}

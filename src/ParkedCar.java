public class ParkedCar {
//    To know the car’s make, model, color, license number, and the number of minutes that the car has been parked.

    private String make, model, licenseNumber, color;
    private int numberOfMinutesParked;

    public ParkedCar(String make, String model, String licenseNumber, String color, int numberOfMinutesParked) {
        this.make = make;
        this.model = model;
        this.licenseNumber = licenseNumber;
        this.color = color;
        this.numberOfMinutesParked = numberOfMinutesParked;
    }

    public ParkedCar(ParkedCar car) {
        this.make = car.make;
        this.model = car.model;
        this.licenseNumber = car.licenseNumber;
        this.color = car.color;
        this.numberOfMinutesParked = car.numberOfMinutesParked;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfMinutesParked() {
        return numberOfMinutesParked;
    }

    public void setNumberOfMinutesParked(int numberOfMinutesParked) {
        this.numberOfMinutesParked = numberOfMinutesParked;
    }
}


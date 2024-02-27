package asac;

public class CarImpl implements Car {
    private final String carName;
    private final String carManufacturingCompany;
    private final int carReleaseYear;
    private final int price;

    public CarImpl(String carName, String carManufacturingCompany, int carReleaseYear, int price) {
        this.carName = carName;
        this.carManufacturingCompany = carManufacturingCompany;
        this.carReleaseYear = carReleaseYear;
        this.price = price;
    }

    @Override
    public String carList() {
        return this.carName + ", " + this.carManufacturingCompany + ", " + this.carReleaseYear + ", " + this.price;
    }

}

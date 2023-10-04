package trustycars;

public class Suzuki750 extends Bike {
    public Suzuki750(int theYear, int thePrice) {
        year = theYear;
        price = thePrice;

        // fixed values for this particular class
        make = "Suzuki";
        model = "750";
        engineSize = 750;
        fuelCapacity = 20;
        milesPerLitre = 16;
    }
}

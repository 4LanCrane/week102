package trustycars;



public class TriumphTiger800 extends Bike
{
    public TriumphTiger800(int theYear, int thePrice)
    {
        year = theYear;
        price = thePrice;
        
        // fixed values for this particular class
        make = "Triumph";
        model = "Tiger 800";
        engineSize = 800;
        fuelCapacity = 19;
        milesPerLitre = 10;       
    }    
}

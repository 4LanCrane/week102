package trustycars;



public class Yamaha500 extends Bike
{
    public Yamaha500(int theYear, int thePrice)
    {
        year = theYear;
        price = thePrice;
        
        // fixed values for this particular class
        make = "Yamaha";
        model = "500";
        engineSize = 500;
        fuelCapacity = 19;
        milesPerLitre = 20;       
    }    
}

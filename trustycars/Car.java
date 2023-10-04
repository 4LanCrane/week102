package trustycars;


// The initial Car class
public class Car
{
    // Properties of a particular kind of car
    public String make = "Kia";
    public String model = "Picanto";      
    public int engineSize = 998;
    public int loadCapacity = 255;
    public int fuelCapacity = 35;
    public int milesPerLitre = 15;
    public int numberOfDoors = 5;
    public int numberOfSeats = 5;
    
    // Properties that vary for each individual car
    public int year = 2018;
    public int price = 10000;
    
    // Constructor
    public Car()
    {
        // nothing to do here - just use the built-in values
    }
    
    // Method to compute the range - how far the car can go on a full tank
    public int range() 
    {
        int theRange = fuelCapacity*milesPerLitre;
        return theRange;
    }   
    
    // Method to create a short string that describes the car
    public String shortDescription()
    {
        String theDescription =
            make + " " + model + " (" + year + ") £" + price ;
        
        return theDescription;
    }
}

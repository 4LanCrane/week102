package trustycars;


// The initial Bike class
public class Bike

{   
    // Properties of a particular kind of bike
    public String make = "Triumph";
    public String model = "Tiger 800";   
    public int engineSize = 800;
    public int fuelCapacity = 19;
    public int milesPerLitre = 10;
    
    // Properties that vary for each individual car
    public int year = 2014;
    public int price = 7000;
    
    // Constructor
    public Bike()
    {
        // nothing to do here - just use the built-in values
    }
    
    // Constructor to make particular bikes
    public Bike(String theMake, String theModel, int theYear, int thePrice)
    {
        make = theMake;
        model = theModel;
        year = theYear;
        price = thePrice;
    }       
    
    // Method to compute the range - how far the car can go on a full tank
    public int range() 
    {
        int theRange = fuelCapacity*milesPerLitre;
        return theRange;
    }   
    
    // Method to create a short string that describes the bike
    public String shortDescription()
    {
        String theDescription =
            make + " " + model + " (" + year + ") £" + price ;
        
        return theDescription;
    }
    
    // Method to create a longer string that describes the bike
    public String longDescription()
    {
        String theDescription =
            shortDescription() + "\n"             // "\n" marks the end of a line
            + "engine: " + engineSize + " cc \n"  // we are making one big string here
            + "tank:   " + fuelCapacity + " litres \n" 
            + "range:  " + range() + " miles \n"; // notice use of range method 
        
        return theDescription;
    }
}

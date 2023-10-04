package trustycars;

import java.util.ArrayList;

// A class for a TrustyCars garage
public class TrustyCars
{
    // The garage uses an ArrayList to hold all its stock of cars
    public ArrayList<Car> stockList = new ArrayList<Car>();
    
    // Method to make a list of all the stock using the shortDescription 
    // of each car
    public String shortListing()
    {   
        String theListing = "";         // Start off with an empty string
        
        for (Car c: stockList)
        {
            // for each car, get its short description,add it to the string
            // and end the line
            theListing = theListing + c.shortDescription() + "\n";
        }
        
        // Now we have a big string with all the cars described
        return theListing;
    }
}

package trustycars;


// class to provide information about our car garage
public class TrustyCarsApp
{
    // the usual 'main' method so we can run this as a program
    public static void main(String[] args)
    {
        // make an instance of the app, and then call its run method
        TrustyCarsApp app = new TrustyCarsApp();
        app.run();
    }
    
    
    public void run()
    {
        TrustyCars garage = new TrustyCars();           // Make a 'garage' object
        garage.stockList.add( new Car() );              // add cars to its stockList
        garage.stockList.add( new Car() );
        garage.stockList.add( new Car() );
        
        System.out.println( garage.shortListing() );    // print a list of the cars
    }      
}

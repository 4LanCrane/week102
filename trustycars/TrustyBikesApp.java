package trustycars;

// class to provide information about our bike garage
public class TrustyBikesApp {
    // the usual 'main' method so we can run this as a program
    public static void main(String[] args) {
        // make an instance of the app, and then call its run method
        TrustyBikesApp app = new TrustyBikesApp();
        app.run();
    }

    public void run() {
        TrustyBikes garage = new TrustyBikes(); // Make a 'garage' object
        // add bikes to its stockList
        garage.addBike(new Yamaha500(2017, 5000), new Suzuki750(2018, 6500), new TriumphTiger800(2020, 10000));
        garage.addBike(new Suzuki750(2018, 6500));

        System.out.println(garage.shortDescription()); // print a list of the bikes
        System.out.println(garage.longDescription()); // print a list of the bikes
    }
}

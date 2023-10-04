package trustycars;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;;

// A class for a TrustyBikes garage
public class TrustyBikes {
    // The garage uses an ArrayList to hold all its stock of bikes
    private HashMap<Integer, Bike> stockList = new HashMap<>();
    Integer amount = 1;

    public void addBike(Bike... bike) {
        for (Bike b : bike) {

            stockList.put(amount, b);
            amount++;
        }
    }

    public HashMap<Integer, Bike> getStock() {
        return stockList;
    }

    // Method to make a list of all the stock using the shortDescription
    // of each bike
    public String shortDescription() {
        StringBuilder description = new StringBuilder();
        for (HashMap.Entry<Integer, Bike> b : stockList.entrySet()) {

            description.append("stock number =  " + b.getKey() + b.getValue().shortDescription() + "\n");
        }

        return description.toString();
    }

    // Method to print long (muti-line) list of all the bikes
    // Just like shortListing, but using longDescription
    public String longDescription() {
        StringBuilder description = new StringBuilder();

        for (HashMap.Entry<Integer, Bike> b : stockList.entrySet()) {
            description.append("stock number =  " + b.getKey() + "\n" + b.getValue().longDescription() + "\n");
        }

        return description.toString();
    }
}

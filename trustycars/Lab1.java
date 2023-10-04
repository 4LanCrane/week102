package trustycars;

/**
 * Remember our old friend TrustyBikes from last year?
 * Here is the code from 2019-CI401-Week2.02-lab (you may have a version with
 * last year's lab exercises implemented - you can use that version for
 * this lab if you wish)
 * 
 * The TrustyBikes class uses an ArrayList to keep the stock. Modify this class
 * to use a HashMap, mapping from stock number to Bike, instead of an ArrayList.
 * 
 * Here are the steps:
 * 1. In the TrustyBikes class, stocklist is public, and it is accessed
 * directly in TrustyBikesApp to add bikes to the stock. Encapsulate
 * stocklist, by making it private, and providing an add method to
 * TrustyBikes that TrustyBikesApp can use. DONE
 * 
 * 
 * 
 * 
 * 
 * 2. Now that stocklist is encapsulated, we can change its implementation
 * without affecting anything outside the TrusyBikes class. First, change
 * stocklist's type from ArrayList to a HashMap mapping from Integer to
 * Bike. (Don't forget to import HashMap.)
 * 
 * 
 * 
 * 
 * 3. Now change the add method you created in step (1) to use the HashMap
 * put method instead of the ArrayList add method. It will need an extra
 * integer argument (for the stock number) - add an instance variable to
 * the TrustyBikes class for the next stock number, and add one to it
 * each time you call add (so Bikes get different stock numbers)
 * 4. Change the shortListing and longListing methods to loop over a
 * HashMap (use the keySet method) and include the stock number for
 * each bike in the listing.
 * 5 When you run TrustyBikesApp, it should produce a listing of the Bikes,
 * including their stock numbers
 */
public class Lab1 {
    // no code for this lab
}

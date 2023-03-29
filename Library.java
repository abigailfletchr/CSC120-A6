import java.util.Hashtable;
public class Library extends Building{

  private Hashtable<String, Boolean> collection;

  /**
   * Constructor for the Library class extending the Building class.
   * @param name the name of the building
   * @param address the address of the building
   * @param nFloors the number of floors in the building
   */
    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      // System.out.println("You have built a library: 📖");
      this.collection = new Hashtable<String, Boolean>();
    }

  /**
   * Method that adds a book title to the Library's collection of books.
   * @param title the title of a book
   */
    public void addTitle(String title){
      this.collection.put(title, true);
    }

    /**
     * Method that removes a book title from the Library's collection of books.
     * @param title the title of a book
     */
    public String removeTitle(String title){
      try{
        this.collection.remove(title);
        return title;
      }catch(Exception e){
        return "No title was removed. Title not found.";
      }
    }
    
    /**
     * Method that checks a book out and changes the key value to false when checked out.
     * @param title the title of a book
     */
    public void checkOut(String title){
      this.collection.replace(title, true, false); 
    }

    /**
     * Method that retusn a book and changes the key value to true once returned.
     * @param title the title of a book
     */
    public void returnBook(String title){
      this.collection.replace(title, false, true);
    }

    /**
     * 
     * @param title
     * @return
     */
    public boolean containsTitle(String title){ // have chai look
      return this.collection.contains(title);
    }

    /**
     * Method that checks is a book title is available and returns the value true if it is available.
     * @param title the title of a book
     * @return this.collection.get(title) it will return true if the book is available, or false if it is not
     */
    public boolean isAvailable(String title){
      return this.collection.get(title);
    }

    /**
     * Method that prints out the Library's entire book collection and check out status.
     */
    public void printCollection(){
      for(String title: this.collection.keySet()){
        System.out.println(title + " available: " + this.collection.get(title));
      }
    }


    public static void main(String[] args) {
      Library lib = new Library("Neilson Library", "1 Chapin Way", 4);
      // lib.addTitle("Formula 1: Top Gear");
      // lib.addTitle("Spanish for Beginners");

      // System.out.println("Is available? true >>" + lib.isAvailable("Formula 1: Top Gear"));
      // System.out.println("Is available? true >>" + lib.isAvailable("Spanish for Beginners"));

      // lib.checkOut("Formula 1: Top Gear");

      // System.out.println("Is available? false >>" + lib.isAvailable("Formula 1: Top Gear"));
      // System.out.println("Is available? true >>" + lib.isAvailable("Spanish for Beginners"));

      // lib.returnBook("Formula 1: Top Gear");

      // System.out.println("Is available? true >>" + lib.isAvailable("Formula 1: Top Gear"));
      // System.out.println("Is available? true >>" + lib.isAvailable("Spanish for Beginners"));

      // System.out.println("Printing book collection:");
      // lib.printCollection();
    }
  
  }
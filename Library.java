import java.util.Hashtable;

/* This is a stub for the Library class */
public class Library extends Building{

  // attritubutes
  private Hashtable<String, Boolean> collection;


  // constructor

  /**
   * 
   * @param name
   * @param address
   * @param nFloors
   */
    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      // System.out.println("You have built a library: 📖");
      this.collection = new Hashtable<String, Boolean>();
    }

    /**
     * 
     * @param title
     */
    public void addTitle(String title){
      this.collection.put(title, true); // have chai look 
    }

    /**
     * 
     * @param title
     */
    public void removeTitle(String title){
      for(int i = 0; i < collection.size(); i++){
        if(collection.get(i).equals(title)){ // have chai look
          String tt = title;
          collection.remove(i);
          System.out.println(tt);
        }
      }
      System.out.println(title + " was not found and not removed.");
    }
    
    /**
     * 
     */
    public void checkOut(String title){
      this.collection.replace(title, true, false); 
    }

    /**
     * 
     * @param title
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
      for(int i = 0; i < collection.size(); i++){
        if(collection.get(i).equals(title)){
          return true;

        }
      }
      return false;
    }

    /**
     * 
     * @param title
     * @return
     */
    public boolean isAvailable(String title){
      for(int i = 0; i < collection.size(); i++){
        if(collection.containsKey(title)){
          if(collection.contains(true)){
            return true;
          }
        }

      }
      return false;
    }


    /**
     * 
     */
    public void printCollection(){
      System.out.println(collection.toString());
    }

    




    public static void main(String[] args) {
      new Library("Neilson Library", "1 Chapin Way", 4);
    }
  
  }
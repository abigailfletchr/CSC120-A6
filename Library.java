import java.util.Hashtable;

/* This is a stub for the Library class */
public class Library extends Building{

  // attritubutes
  private Hashtable<String, Boolean> collection;


  // constructor
    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      // System.out.println("You have built a library: 📖");
      this.collection = new Hashtable<String, Boolean>();
    }

    public void addTitle(String title){
      
    }


    public void removeTitle(String title){


    } 




    public static void main(String[] args) {
      new Library();
    }
  
  }
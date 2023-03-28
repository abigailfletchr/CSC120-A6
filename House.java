/* This is a stub for the House class */
import java.util.ArrayList;  
public class House extends Building {

  // attributes
  private ArrayList<String> residents;
  private boolean hasDiningRoom;


  /**
   * 
   * @param hasDiningRoom
   */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
  }

  // getters and setters

  /**
   * 
   * @return
   */
  public boolean hasDiningRoom(){
    return hasDiningRoom;
  }

  /**
   * 
   * @return
   */
  public int nResidents(){
    return residents.size();
  }

  public void moveIn(String name){
    this.residents.add(name);
  }

  public String moveOut(String name){
    for(int i = 0; i < residents.size(); i++){
      if(residents.get(i).equals(name)){
        String nm = name;
        residents.remove(i);
        return nm;
      }
    }
    return name + " was not found so they weren't removed.";
  }

  public boolean isResident(String name){
    return this.residents.contains(name);
  }

  public static void main(String[] args) {
    new House("King House", "10 Elm Street", 4, true);
  }

}
public class Building {

    protected String name = "<Name Unknown>";
    protected String address = "<Address Unknown>";
    protected int nFloors = 1;

    /**
     * The constructor for the Building class
     * @param name the name of the building
     * @param address the address of the building
     * @param nFloors the number of floors in the building
     */
    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

    /**
     * Accessor that gets the name of the building
     * @return this.name the name of the building
     */
    public String getName() {
        return this.name;
    }

    /**
     * Accessor that gets the address of the building
     * @return this.address the address of the building
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Accessor that gets the number of floors in the building
     * @return this.nFloors the number of floors in the building
     */
    public int getFloors() {
        return this.nFloors;
    }

    /**
     * Returns a sentence that describes the building with the given name, number of floors, and address.
     */
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }

    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}

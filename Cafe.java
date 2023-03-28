/* This is a stub for the Cafe class */
public class Cafe extends Building {

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    /**
     * 
     * @param name
     * @param address
     * @param nFloors
     */
    public Cafe(String name, String address, int nFloors) {
        // System.out.println("You have built a cafe: ☕");
        super(name, address, nFloors);
        this.nCoffeeOunces = 60;
        this.nSugarPackets = 35;
        this.nCreams = 35;
        this.nCups = 75;
    }
    
    /**
     * 
     * @param size
     * @param nSugarPackets
     * @param nCreams
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        this.nCoffeeOunces = nCoffeeOunces - size;
        this.nSugarPackets = nSugarPackets - nSugarPackets;
        this.nCreams = nCreams - nCreams;
        this.nCups = nCups -1;

    }

    /**
     * 
     * @param nCoffeeOunces
     * @param nSugarPackets
     * @param nCreams
     * @param nCups
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        if(nCoffeeOunces < 10){
            this.nCoffeeOunces = 60;
        }
        if(nSugarPackets < 2){
            this.nSugarPackets = 35;
        }
        if(nCreams < 2){
            this.nCreams = 35;
        }
        if(nCups < 10){
            this.nCups = 75;
        }
    }

    public static void main(String[] args) {
        new Cafe();
    }
    
}

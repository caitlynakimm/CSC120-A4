public class Passenger implements PassengerRequirements{
    
    //Attributes
    private String name;

    /**
     * Constructor for Passenger
     * @param name
     */
    public Passenger(String name) {
        this.name = name;
    }

    public void boardCar(Car c){
        boolean success = c.addPassenger(this); // "this" refers to the current Passenger object
        
        if (!success) {
            System.out.println("Passenger " + this.name + " failed to board car. Car is full.");
        }
    }

    public void getOffCar(Car c){
        boolean success = c.removePassenger(this);

        if (!success) {
            System.out.println("Passenger " + this.name + " failed to get off car. " + this.name + " wasn't actually onboard.");
        }
    }

    public String toString(){
        return (this.name);
    }

    // public static void main(String[] args) {
    //     Car myCar = new Car(2);
    //     System.out.println(myCar);

    //     Passenger p1 = new Passenger("Caitlyn");
    //     Passenger p2 = new Passenger("Bobby");
    //     Passenger p3 = new Passenger("Jenica");

    //     p1.boardCar(myCar);
    //     p2.boardCar(myCar);
    //     p3.boardCar(myCar);

    //     p2.getOffCar(myCar);
    //     p3.getOffCar(myCar);
    //     p1.getOffCar(myCar);

    //     myCar.printManifest();
    // }
}

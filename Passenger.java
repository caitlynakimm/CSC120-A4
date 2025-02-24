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
        c.addPassenger(this); // "this" refers to the current Passenger object
    }

    public void getOffCar(Car c){
        c.removePassenger(this);
    }

    public String toString(){
        return (this.name);
    }

    public static void main(String[] args) {
        Car myCar = new Car(15);
        System.out.println(myCar);
        Passenger Caitlyn = new Passenger("Caitlyn");
        System.out.println(Caitlyn);
    }
}

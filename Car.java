import java.util.ArrayList;

public class Car implements CarRequirements {
    
    //Attributes
    private int carSeatCapacity;
    private int remainingSeats;
    private ArrayList<Passenger> passengersOnboard; 

    /**
     * Constructor for Car
     * @param carSeatCapacity
     */
    public Car(int carSeatCapacity){
        this.carSeatCapacity = carSeatCapacity;
        this.remainingSeats = carSeatCapacity; //remainingSeats starts with full seats in car
        this.passengersOnboard = new ArrayList<>();
    }


    public int getCapacity(){
        return this.carSeatCapacity;
    }

    public int seatsRemaining(){
        return this.remainingSeats;
    }

    public Boolean addPassenger(Passenger p){
        if (this.remainingSeats > 0) {
            this.remainingSeats -= 1;
            System.out.println("There are " + this.remainingSeats + " remaining seats.");
            return passengersOnboard.add(p);
        } else {
            //System.out.println("Unfortunately, the car is full, there are no seats for " + p + ".");
            return false;
        }
    }


    public Boolean removePassenger(Passenger p){
        if (this.passengersOnboard.contains(p)){
            this.remainingSeats += 1;
            System.out.println("There are " + this.remainingSeats + " remaining seats.");
            return passengersOnboard.remove(p);
        } else {
            //System.out.println(p + " is not on board.");
            return false;
        }
    }

    public void printManifest(){
        if (this.passengersOnboard.size() > 0) {
            System.out.println(this.passengersOnboard);
        } else {
            System.out.println("This car is EMPTY.");
        }
    }

    public String toString(){
        return ("The car's maximum capacity is " + this.carSeatCapacity + " and the remaining number of seats is " + this.remainingSeats + ".");
    }

    // public static void main(String[] args){
    //     Car myCar = new Car(15);
    //     System.out.println(myCar);
    //     Car myOtherCar = new Car(0);
    //     System.out.println(myOtherCar);
    //     myCar.printManifest();
    //     myCar.printManifest();

    //     Passenger Caitlyn = new Passenger("Caitlyn");
    //     Passenger Bob = new Passenger("Bob");
    //     System.out.println(Caitlyn);
    //     myCar.addPassenger(Caitlyn);
    //     myCar.addPassenger(Bob);
    //     myCar.printManifest();
    //     myCar.removePassenger(Bob);
    //     myOtherCar.addPassenger(Bob);


    // }
}




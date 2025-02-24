import java.util.ArrayList;

public class Train implements TrainRequirements{

    //Attributes
    Engine engine;
    private ArrayList<Car> cars;
    private FuelType fuelType;
    private double fuelCapacity;
    private int nCars;
    private int passengerCapacity;

    /**
     * Constructor for Train
     * @param fuelType
     * @param fuelCapacity
     * @param nCars
     * @param passengerCapacity
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType, fuelCapacity, fuelCapacity);
        this.fuelType = fuelType;
        this.cars = new ArrayList<>();
        this.fuelCapacity = fuelCapacity;
        this.nCars = nCars;
        this.passengerCapacity = passengerCapacity;

        for (int i = 0; i < nCars; i++) {
            this.cars.add(new Car(passengerCapacity));
        }
    }

    public Engine getEngine(){
        return this.engine;
    }

    public Car getCar(int i){
        return this.cars.get(i);
    }

    public int getMaxCapacity(){
        int totalMaxCapacity = 0;

        for (Car car: this.cars){
            totalMaxCapacity += car.getCapacity();
        }
        return totalMaxCapacity;
    }

    public int seatsRemaining(){
        int totalSeatsRemaining = 0;

        for (Car car: this.cars){
            totalSeatsRemaining += car.seatsRemaining();
        }
        return totalSeatsRemaining;
    }

    public void printManifest(){
        System.out.println("Roster of all passengers: ");
        for (int i = 0; i < this.cars.size(); i++) {
            System.out.println("Car " + (i+1) + ":");
            this.cars.get(i).printManifest();
        }
    }

    public String toString(){
        return ("The train is fuel type: " + this.fuelType + " that has a fuel capacity of: " + this.fuelCapacity + " which consists of " + this.nCars + " cars with an overall total passenger capacity of " + this.passengerCapacity + ".");
    }

    public static void main(String[] args){
        //remaining seats reset per car help
        Train myTrain = new Train(FuelType.ELECTRIC, 100., 5, 30);
        System.out.println(myTrain);
        System.err.println();

        Car carOne = myTrain.getCar(0);
        System.out.println("Car 1:");
        System.out.println("Maximum capacity is: " + carOne.getCapacity());
        System.out.println("Seats remaining is: " + carOne.seatsRemaining());
        System.err.println();

        Passenger carOnePassengerOne = new Passenger("Emma");
        Passenger carOnePassengerTwo = new Passenger("John Cena");
        carOnePassengerOne.boardCar(carOne);
        carOnePassengerTwo.boardCar(carOne);
        
        System.out.println("Roster for Car 1:");
        carOne.printManifest();
        System.err.println();

        /////// 
        Car carTwo = myTrain.getCar(1);
        System.out.println("Car 2:");
        System.out.println("Maximum capacity is: " + carTwo.getCapacity());
        System.out.println("Seats remaining is: " + carTwo.seatsRemaining());
        System.err.println();

        Passenger carTwoPassengerOne = new Passenger("Mary");
        Passenger carTwoPassengerTwo = new Passenger("Jhadia");
        carTwoPassengerOne.boardCar(carTwo);
        carTwoPassengerTwo.boardCar(carTwo);
        
        System.out.println("Roster for Car 2:");
        carTwo.printManifest();
        System.err.println();

        myTrain.printManifest();
    }
}

public class Engine implements EngineRequirements {
    
    //Attributes
    private FuelType f;
    private double currentFuelLevel;
    private double maxFuelLevel;
    
    /**
     * Constructor for Engine
     * @param f Engine's fuel type
     * @param currentFuelLevel Engine's current fuel level
     * @param maxFuelLevel Engine's max fuel level
     */
    public Engine(FuelType f, double currentFuelLevel, double maxFuelLevel){
        this.f = f;
        this.currentFuelLevel = currentFuelLevel;
        this.maxFuelLevel = maxFuelLevel;
    }

    public FuelType getFuelType(){
        return this.f;
    }

    public double getMaxFuel(){
        return 0.;
        //returning maxfuel from attribute maxFuelLevel
        //can set maxFuelLevel attribute whatever you want
    }

    public double getCurrentFuel(){
        return 0.;
    }

    public void refuel(){
        //engine can increase by whatever increment
    }

    public Boolean go(){
        return true;
        //engine can decrease in fuel by whatever increments you want
        //add bounds to ensure fuel doesn't go negative
    }

    public String toString(){
        return ("Engine has fuel type: " + this.f + " current fuel level: " + this.currentFuelLevel + " and max fuel level: " + this.maxFuelLevel);
    }

    public static void main(String[] args){
        Engine myEngine = new Engine(FuelType.ELECTRIC, 0., 100.);
        System.out.println(myEngine);
        //by default when we print an object we get its location rather than the content inside it
        Engine myOtherEngine = new Engine(FuelType.STEAM, 50., 100.);
        System.out.println(myOtherEngine);
    }
}
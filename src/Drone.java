public abstract class Drone {
    int id;
    private String status;
    double cargoCapacity;
    private double currentCargoWeight;
    int speed;

    public Drone(int id, double cargoCapacity, int speed) {
        this.id = id;
        this.status = "IDLE";
        this.cargoCapacity = cargoCapacity;
        this.currentCargoWeight = 0;
        this.speed = speed;
    }

    public int getId() {
        return id;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public double getCargoCapacity() {
        return cargoCapacity;
    }
    public double getCurrentCargoWeight() {
        return currentCargoWeight;
    }

    public boolean loadCargo(double weight) {
        if(currentCargoWeight + weight < cargoCapacity) {
            currentCargoWeight += weight;
            return true;
        }
        return false;
    }

    public void unloadCargo(){
        currentCargoWeight = 0;
    }

    public abstract double calculateFlightTime(double distance);
}
class LightDrone extends Drone{
    public LightDrone(int id, double cargoCapacity, int speed) {
        super(id, cargoCapacity, speed);
    }
    @Override
    public double calculateFlightTime(double distance) {
        return distance/speed;
    }
}
class HeavyDrone extends Drone{
    public HeavyDrone(int id, double cargoCapacity, int speed) {
        super(id, cargoCapacity, speed);
    }
    @Override
    public double calculateFlightTime(double distance) {
        return distance/speed;
    }
}

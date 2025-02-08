public class Cargo {
    double weight;
    String description;

    public Cargo(double weight, String description) {
        this.weight = weight;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    public double getWeight() {
        return weight;
    }
}
class DeliveryTask{
    Cargo cargo;
    celestialBody origin;
    celestialBody destination;
    Drone assignDrone;

    public DeliveryTask(Cargo cargo, celestialBody origin, celestialBody destination) {
        this.cargo = cargo;
        this.origin = origin;
        this.destination = destination;
    }

    public boolean assignDrone(Drone drone){
        if(drone.loadCargo(cargo.getWeight())){
            this.assignDrone = drone;
            assignDrone.setStatus("IN_FLIGHT");
            return true;
        }
        return false;
    }

    public void startDelivery(){
        if(assignDrone!=null){
            assignDrone.setStatus("IN_FLIGHT");
            System.out.println("Delivery started");
        }else{
            System.out.println("Delivery failed");
        }
    }
    public void completeDelivery(){
        if(assignDrone == null){
            return;
        }
        if(assignDrone.getStatus() == "IN_FLIGHT"){
            assignDrone.setStatus("IDLE");
            assignDrone.unloadCargo();
            System.out.println("Delivery completed " + assignDrone.getId());
        }else{
            System.out.println("No active Drone");
        }
    }


}
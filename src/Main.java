public class Main {
    public static void main(String[] args) {
        LightDrone lightDrone01 = new LightDrone(1,21.1, 120);
        HeavyDrone heavyDrone01 = new HeavyDrone(1,45.5, 70);

        Planet earth = new Planet("Earth", 30, 50, "Oxygen");
        SpaceStation station01 = new SpaceStation("Station01", 60, 80, 3);

        Cargo cargo01 = new Cargo(11.3, "pizza");
        Cargo cargo02 = new Cargo(32.2, "iron");

        DeliveryTask deliveryTask1 = new DeliveryTask(cargo01, earth, station01);
        DeliveryTask deliveryTask2 = new DeliveryTask(cargo02, station01, earth);

        deliveryTask1.assignDrone(lightDrone01);
        deliveryTask2.assignDrone(heavyDrone01);

        System.out.println(earth.distanceTo(station01));

        System.out.println(lightDrone01.calculateFlightTime(earth.distanceTo(station01)));
        System.out.println(heavyDrone01.calculateFlightTime(station01.distanceTo(earth)));

        earth.showDetails();
        System.out.println();
        station01.showDetails();

        deliveryTask1.startDelivery();
        deliveryTask2.startDelivery();

        deliveryTask1.completeDelivery();
        deliveryTask2.completeDelivery();

    }
}
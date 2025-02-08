public class Planet extends celestialBody{
    String atmosphereType;

    public Planet(String name, double coordinateX, double coordinateY, String atmosphereType) {
        super(name, coordinateX, coordinateY);
        this.atmosphereType = atmosphereType;
    }

    @Override
    public void showDetails() {
        System.out.println("Planet: " + getName() + "\nType of atmosphere: " + atmosphereType);
    }
}
class SpaceStation extends celestialBody{
    int stationLevel;

    public SpaceStation(String name, double coordinateX, double coordinateY, int stationLevel) {
        super(name, coordinateX, coordinateY);
        this.stationLevel = stationLevel;
    }

    @Override
    public void showDetails() {
        System.out.println("Space Station: " + getName()+"\nLevel of Station: " + stationLevel);
    }
}

public abstract class celestialBody {
    String name;
    double coordinateX, coordinateY;

    public celestialBody(String name, double coordinateX, double coordinateY) {
        this.name = name;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public String getName() {
        return name;
    }
    public double getCoordinateX() {
        return coordinateX;
    }
    public double getCoordinateY() {
        return coordinateY;
    }

    public double distanceTo(celestialBody other) {
        return Math.sqrt(Math.pow(this.getCoordinateX() - other.getCoordinateX(), 2) + Math.pow(this.getCoordinateY() - other.getCoordinateY(), 2));
    }

    public abstract void showDetails();
}

package dealership.vehicle;

public enum CarShape {

    SALOON(4),
    ESTATE(4),
    SUV(4),
    CONVERTIBLE(2),
    SPORTS(2),
    HATCHBACK(3);

    private final int doors;

    CarShape(int doors){
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }
}

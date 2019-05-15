package dealership.vehicle;

public enum EngineSize {

    TWO_LITRE(2.00),
    ONE_AND_A_HALF_LITRE(1.50),
    SIX_LITRE(6.00);

    private double volume;

    EngineSize(double volume){
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

}

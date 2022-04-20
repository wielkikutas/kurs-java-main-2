package zadanie09;

public class Prostokont implements Obliczanie {
    private double sideB;
    private double sideA;

    public Prostokont(double sideB, double sideA) {
        this.sideB = sideB;
        this.sideA = sideA;
    }

    @Override
    public double obliczPole() {
        return sideA*sideB;
    }

    @Override
    public double obliczObwod() {
        return (sideA+sideB)*2;
    }

    @Override
    public String getType() {
        return "Prostokont";
    }
}

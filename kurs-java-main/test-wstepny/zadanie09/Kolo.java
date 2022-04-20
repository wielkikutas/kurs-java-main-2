package zadanie09;

public class Kolo implements Obliczanie{
    private double radius;

    public Kolo(double radius) {
        this.radius = radius;
    }

    @Override
    public double obliczPole() {
        return radius*radius*Math.PI;
    }

    @Override
    public double obliczObwod() {
        return Math.PI*radius*2;
    }

    @Override
    public String getType() {
        return "Koło";
    }
}

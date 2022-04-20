package zadanie09;

public class Kwadrat implements Obliczanie {
    private double side_length;

    public Kwadrat(double side_length) {
        this.side_length = side_length;

    }

    @Override
    public double obliczPole() {
        return side_length*side_length;
    }

    @Override
    public double obliczObwod() {
        return side_length*4;
    }

    @Override
    public String getType() {
        return null;
    }
}

public class Triangle extends Instrument {

    private int gauge;

    public Triangle(double wholesaleCost, String brand, String model, int gauge) {
        super(wholesaleCost, brand, model);
        this.gauge = gauge;
    }

    public int getGauge() {
        return gauge;
    }

    public String play() {
        return "Ding";
    }
}

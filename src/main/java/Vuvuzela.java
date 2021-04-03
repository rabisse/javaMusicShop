public class Vuvuzela extends Instrument {

    private int maxDecibels;

    public Vuvuzela(double wholesaleCost, String brand, String model, int maxDecibels) {
        super(wholesaleCost, brand, model);
        this.maxDecibels = maxDecibels;
    }

    public int getMaxDecibels() {
        return maxDecibels;
    }

    public String play() {
        return "Vvvvvv";
    }
}

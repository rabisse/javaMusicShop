public class Ukulele extends Instrument {

    private UkuleleSize ukuleleSize;

    public Ukulele(double wholesaleCost, String brand, String model, UkuleleSize ukuleleSize) {
        super(wholesaleCost, brand, model);
        this.ukuleleSize = ukuleleSize;
    }

    public UkuleleSize getUkuleleSize() {
        return ukuleleSize;
    }

    public String play() {
        return "Strum strum";
    }
}

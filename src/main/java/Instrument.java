public abstract class Instrument extends Item implements Playable{

    private String brand;
    private String model;

    public Instrument(double wholesaleCost, String brand, String model) {
        super(wholesaleCost, 30);
        this.brand = brand;
        this.model = model;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

//    public abstract String play();

}

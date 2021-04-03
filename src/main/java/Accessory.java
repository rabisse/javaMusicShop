public class Accessory extends Item {

    private String name;
    private String brand;
    private TypeOfInstrument instrument;

    public Accessory(double wholesaleCost, String name, String brand, TypeOfInstrument instrument) {
        super(wholesaleCost, 50);
        this.name = name;
        this.brand = brand;
        this.instrument = instrument;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public TypeOfInstrument getInstrument() {
        return instrument;
    }

}

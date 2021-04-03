public abstract class Item implements Sellable {

    private double wholesaleCost;
    private double markup;
    private double retailPrice;

    public Item(double wholesaleCost, double markup) {
        this.wholesaleCost = wholesaleCost;
        this.markup = markup;
        this.retailPrice = wholesaleCost + (wholesaleCost * markup);
    }


    public double getWholesaleCost() {
        return wholesaleCost;
    }

    public void setWholesaleCost(double wholesaleCost) {
        this.wholesaleCost = wholesaleCost;
        this.retailPrice = wholesaleCost + (wholesaleCost * markup);
    }

    public double getMarkup() {
        return markup;
    }

    public void setMarkup(double markup) {
        this.markup = markup;
        this.retailPrice = wholesaleCost + (wholesaleCost * markup);
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double newRetailPrice) {
        setMarkup((newRetailPrice - wholesaleCost) / wholesaleCost);
    }
}

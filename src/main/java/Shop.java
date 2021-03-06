import java.util.ArrayList;

public class Shop {

    private ArrayList<Sellable> stock;
    private double totalProfit;

    public Shop() {
        this.stock = new ArrayList<Sellable>();
    }

    public int stockCount() {
        return this.stock.size();
    }

    public void addItemToStock(Sellable item) {
        this.stock.add(item);
    }

    public void removeItemFromStock(Sellable item) {
        this.stock.remove(item);
    }

    public double getTotalPotentialProfit() {
        this.totalProfit = 0;
        stock.forEach(item -> {
            this.totalProfit += item.getPotentialProfit();
        });
        return totalProfit;
    }
}

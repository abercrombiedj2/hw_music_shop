package accessories;

public class SheetMusic extends Accessory {

    public SheetMusic(String item, double pricePaid, double sellPrice) {
        super(item, pricePaid, sellPrice);
    }

    public double calculateMarkup() {
        return this.getSellPrice() - this.getPricePaid();
    }
}

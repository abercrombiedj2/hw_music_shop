package accessories;

public class DrumSticks extends Accessory{

    public DrumSticks(String item, double pricePaid, double sellPrice) {
        super(item, pricePaid, sellPrice);
    }

    public double calculateMarkup() {
        return this.getSellPrice() - this.getPricePaid();
    }
}

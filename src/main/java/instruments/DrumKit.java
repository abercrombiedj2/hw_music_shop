package instruments;

public class DrumKit extends Instrument {

    public DrumKit(String material, String colour, Type type, double pricePaid, double sellPrice) {
        super(material, colour, type, pricePaid, sellPrice);
    }

    public String play() {
        return "Bang bang";
    }

    public double calculateMarkup() {
        return this.getSellPrice() - this.getPricePaid();
    }
}

package instruments;

public class Piano extends Instrument {

    public Piano(String material, String colour, Type type, double pricePaid, double sellPrice) {
        super(material, colour, type, pricePaid, sellPrice);
    }

    public String play() {
        return "Tinkle tinkle";
    }

    public double calculateMarkup() {
        return this.getSellPrice() - this.getPricePaid();
    }

}

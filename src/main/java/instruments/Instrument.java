package instruments;

import shop.ISell;

public abstract class Instrument implements IPlay, ISell {

    String material;
    String colour;
    Type type;
    double pricePaid;
    double sellPrice;

    public Instrument(String material, String colour, Type type, double pricePaid, double sellPrice) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.pricePaid = pricePaid;
        this.sellPrice = sellPrice;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double getPricePaid() {
        return pricePaid;
    }

    public void setPricePaid(double pricePaid) {
        this.pricePaid = pricePaid;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }
}

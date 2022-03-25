package accessories;

import shop.ISell;

public abstract class Accessory implements ISell {

    String item;
    double pricePaid;
    double sellPrice;

    public Accessory(String item, double pricePaid, double sellPrice) {
        this.item = item;
        this.pricePaid = pricePaid;
        this.sellPrice = sellPrice;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
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

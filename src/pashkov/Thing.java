package pashkov;

public class Thing{

    private int weight;
    private int price;

    public Thing(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    public Thing() {
    }

    public double getPrisePerKilogram() {
        return (double) getPrice() / (double) getWeight();
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }
}

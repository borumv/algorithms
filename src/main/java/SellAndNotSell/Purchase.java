package SellAndNotSell;

public class Purchase {
    private String name;

    private Double cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Purchase(String name, Double cost) {
        this.name = name;
        this.cost = cost;
    }
}

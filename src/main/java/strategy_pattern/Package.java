package strategy_pattern;

public class Package {
    private int weight;
    private String method;
    private int price;
    private String status;

    public Package(int weight) {
        this.weight = weight;
        // TODO
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getWeight() {
        return weight;
    }

    public String getMethod() {
        return method;
    }

    public int getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }
}

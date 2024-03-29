import java.util.Map;

public class Order {
    private Integer id;
    private Integer userId;
    private Map<Product, Integer> orderDetails;
    private double totalPrice;

    public Order(Integer id, Integer userId, Map<Product, Integer> orderDetails) {
        this.id=id;
        this.userId=userId;
        this.orderDetails=orderDetails;
        this.totalPrice=calculateTotalPrice();
    }

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    public Integer getUserId() {return userId;}
    public void setUserId(Integer userId) {this.userId = userId;}

    public Map<Product, Integer> getOrderDetails() {return orderDetails;}

    public double getTotalPrice() {return totalPrice;}

    private double calculateTotalPrice() {
        double total = 0;
        for (Map.Entry<Product,Integer> entry:orderDetails.entrySet()) {
            total+=entry.getKey().getPrice()*entry.getValue();
        }
        return total;
    }
}

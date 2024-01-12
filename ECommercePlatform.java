import java.util.HashMap;
import java.util.Map;
public class ECommercePlatform {
    private Map<Integer, User> users;
    private Map<Integer, Product> products;
    private Map<Integer, Order> orders;

    public ECommercePlatform() {
        users=new HashMap<>();
        products=new HashMap<>();
        orders=new HashMap<>();
    }

    public void addUser(User user) {users.put(user.getId(), user);}

    public void addProduct(Product product) {products.put(product.getId(), product);}


    public void createOrder(Integer userId) {
        User user=users.get(userId);
        Order newOrder=new Order(orders.size()+1,userId,new HashMap<>(user.getCart()));
        orders.put(newOrder.getId(), newOrder);
        user.getCart().clear();
    }


    public Map<Integer, Product> getAvailableProducts() {return products;}

    public void updateProductStock(Integer productId,int newStock) {
        if (products.containsKey(productId)) {
            products.get(productId).setStock(newStock);
        }
    }
}

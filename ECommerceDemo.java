// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ECommerceDemo {
    public static void main(String[] args) {
        ECommercePlatform platform = new ECommercePlatform();

        User user1 = new User(1, "User1");
        platform.addUser(user1) ;
        Product product1 = new Product(1,"Product1",100.0,10);
        platform.addProduct(product1);
        user1.addToCart(product1,2) ;
        platform.createOrder(user1.getId() ) ;
        System.out.println("Замовлення створено:"+platform.getAvailableProducts());
    }
}
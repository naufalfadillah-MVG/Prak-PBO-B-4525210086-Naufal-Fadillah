package inner_class;

public class Main {
    public  static  void main(String[] args) {
        System.out.println("=== RESTAURANT ORDER SYSTEM ===");

        Restaurant pizzaHut = new Restaurant("pizzaHut", "Jl,Tamrin", "0881-721-022");
        Restaurant KFC = new Restaurant("KFC", "Jl.Sudirman", "0881-721-021");

        pizzaHut.displayRestaurantInfo();
        KFC.displayRestaurantInfo();

        Restaurant.Order order1 = pizzaHut.createOrder( "Rina");
    }
}

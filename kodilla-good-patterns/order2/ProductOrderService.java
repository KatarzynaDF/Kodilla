package order2;

public class ProductOrderService {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        InformationService informationService = new InformationService();
        OrderRepository orderRepository = new OrderRepository();
        OrderProcessor orderProcessor = new OrderProcessor(informationService, orderService, orderRepository);
        OrderRequest orderRequest = new OrderRequest("Kasia", "book", "greatBook");
        System.out.println(orderProcessor.process(orderRequest));

    }
}
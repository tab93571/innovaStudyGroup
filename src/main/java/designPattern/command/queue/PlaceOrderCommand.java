package designPattern.command.queue;

interface Command {
    void execute();
}

class OrderDetails {
    String productId;
    ;
    public OrderDetails(String productId){
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}

class PlaceOrderCommand implements Command {
    private OrderDetails orderDetails;

    public PlaceOrderCommand(OrderDetails orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public void execute() {
        // Simulate order processing logic
        System.out.println("Processing order for: " + orderDetails.getProductId());
        // Here you would include logic to interact with database, etc.
    }
}

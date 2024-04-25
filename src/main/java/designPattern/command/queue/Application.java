package designPattern.command.queue;

public class Application {
    public static void main(String[] args) {
        MessageQueueClient client = new MessageQueueClient();
        CommandProducer producer = new CommandProducer(client);
        CommandConsumer consumer = new CommandConsumer(client);

        OrderDetails details = new OrderDetails("12345");
        PlaceOrderCommand command = new PlaceOrderCommand(details);
        producer.sendCommand(command);

        new Thread(consumer::start).start();

        OrderDetails details2 = new OrderDetails("123");
        PlaceOrderCommand command2 = new PlaceOrderCommand(details2);
        producer.sendCommand(command2);

        OrderDetails details3 = new OrderDetails("432");
        PlaceOrderCommand command3 = new PlaceOrderCommand(details3);
        producer.sendCommand(command3);

    }
}

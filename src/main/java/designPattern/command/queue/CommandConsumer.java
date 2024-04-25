package designPattern.command.queue;

import com.google.gson.Gson;

public class CommandConsumer {
    private final MessageQueueClient client;

    public CommandConsumer(MessageQueueClient client) {
        this.client = client;
    }

    public void start(){
        client.consumeMessages(message -> {
            try {
                System.out.println("Start to consume");
                Command command = new Gson().fromJson(message, PlaceOrderCommand.class);
                command.execute();  // Execute the command
            } catch (Exception e) {
                System.err.println("Failed to process command, retrying...: " + e.getMessage());

            }
        });
    }
}


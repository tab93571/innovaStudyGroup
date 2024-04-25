package designPattern.command.queue;

import com.google.gson.Gson;

public class CommandProducer {
    private final MessageQueueClient client;

    public CommandProducer(MessageQueueClient client) {
        this.client = client;
    }

    public void sendCommand(Command command) {
        try {
            String json = new Gson().toJson(command);  // Using Gson to serialize the command
            client.sendMessage(json);
        } catch (Exception e) {
            System.err.println("Failed to send command: " + e.getMessage());
        }
    }
}

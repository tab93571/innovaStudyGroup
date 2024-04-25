package designPattern.command.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Consumer;

public class MessageQueueClient {
    private Queue<String> queue = new LinkedList();

    public void sendMessage(String command){
        queue.add(command);
    }

    public void consumeMessages(Consumer<String> messageConsumer)  {
        while (!queue.isEmpty()) {
            String message = queue.poll();
            // Pass the message to the consumer
            messageConsumer.accept(message);
        }
    }
}

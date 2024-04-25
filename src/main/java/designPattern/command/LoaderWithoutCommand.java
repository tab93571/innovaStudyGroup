package designPattern.command;

import designPattern.command.undo.CeilingFan;
import designPattern.command.undo.Light;

public class LoaderWithoutCommand {
    public static void main(String[] args) {
        Light livingRoomLight = new Light("Living Room");
        livingRoomLight.on();
        livingRoomLight.off();

        CeilingFan ceilingFan = new CeilingFan("Living Room");
        ceilingFan.low();
        ceilingFan.high();
    }
}

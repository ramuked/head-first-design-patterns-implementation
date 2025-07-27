package main.java.com.patterns.behavorial.command;

public class CeilingFanHighCommand extends CeilingFanCommand{

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.setHigh();
    }
}

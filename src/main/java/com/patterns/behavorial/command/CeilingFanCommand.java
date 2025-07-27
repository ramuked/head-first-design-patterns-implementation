package main.java.com.patterns.behavorial.command;

public abstract class CeilingFanCommand implements Command{

    protected CeilingFan ceilingFan;
    protected int prevSpeed;
    public CeilingFanCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }
    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.setHigh();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.setMedium();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.setLow();
        } else if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.turnOff();
        }
    }
}

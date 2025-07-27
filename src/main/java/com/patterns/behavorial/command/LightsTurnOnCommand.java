package main.java.com.patterns.behavorial.command;

public class LightsTurnOnCommand implements  Command{

    Lights lights;
    public LightsTurnOnCommand(Lights lights){
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.turnOn();
    }
    @Override

    public void undo() {
        lights.turnOff();
    }
}

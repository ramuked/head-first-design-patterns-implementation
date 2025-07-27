package main.java.com.patterns.behavorial.command;

public class LightsTurnOffCommand implements Command{

    Lights lights;
    public LightsTurnOffCommand(Lights lights){
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.turnOff();
    }
    @Override

    public void undo() {
        lights.turnOn();
    }
}

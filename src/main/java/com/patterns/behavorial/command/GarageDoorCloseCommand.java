package main.java.com.patterns.behavorial.command;

public class GarageDoorCloseCommand implements Command{

    private GarageDoor garageDoor;
    public GarageDoorCloseCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
        garageDoor.closedGarageDoor();
    }

    @Override
    public void undo() {
        garageDoor.openGarageDoor();
    }
}

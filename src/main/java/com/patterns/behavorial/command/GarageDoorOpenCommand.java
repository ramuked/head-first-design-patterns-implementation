package main.java.com.patterns.behavorial.command;

public class GarageDoorOpenCommand implements  Command{

    private GarageDoor garageDoor;
    public GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
        garageDoor.openGarageDoor();;
    }

    @Override
    public void undo() {
        garageDoor.closedGarageDoor();
    }
}

package main.java.com.patterns.behavorial.command;

public class RemoteControlClient {

    public static void main(String[] args){

        RemoteControl remoteControl = new RemoteControl();

        Lights lights = new Lights();
        LightsTurnOnCommand lightsTurnOnCommand = new LightsTurnOnCommand(lights);
        LightsTurnOffCommand lightsTurnOffCommand = new LightsTurnOffCommand(lights);
        remoteControl.setOnCommand(0, lightsTurnOnCommand);
        remoteControl.setOffCommand(0, lightsTurnOffCommand);


        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand  garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
        remoteControl.setOnCommand(1, garageDoorOpenCommand);
        remoteControl.setOffCommand(1, garageDoorCloseCommand);

        CeilingFan ceilingFan = new CeilingFan();
        CeilingFanCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
        CeilingFanCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setOnCommand(2, ceilingFanHighCommand);
        remoteControl.setOffCommand(2, ceilingFanOffCommand);

        remoteControl.setOnCommand(3, ceilingFanMediumCommand);
        remoteControl.setOffCommand(3, ceilingFanOffCommand);

        remoteControl.setOnCommand(4, ceilingFanLowCommand);
        remoteControl.setOffCommand(4, ceilingFanOffCommand);



        remoteControl.onWasPushed(0);
        remoteControl.offWasPushed(0);
        remoteControl.undoWasPushed();

        remoteControl.onWasPushed(1);
        remoteControl.offWasPushed(1);
        remoteControl.undoWasPushed();

        remoteControl.onWasPushed(2);
        remoteControl.undoWasPushed();

        remoteControl.onWasPushed(3);
        remoteControl.undoWasPushed();

        remoteControl.onWasPushed(4);
        remoteControl.offWasPushed(4);
        remoteControl.undoWasPushed();
        remoteControl.undoWasPushed();









    }
}

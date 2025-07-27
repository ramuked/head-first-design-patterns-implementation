package main.java.com.patterns.behavorial.command;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class RemoteControl {
    private final int numButtons = 7;
    private final Command[] onCommands;
    private final Command[] offCommands;
    private final Deque<Command> undoCommands;
    private static final Command NO_COMMAND = new NoCommand();
    public RemoteControl(){
        onCommands = new Command[numButtons];
        offCommands = new Command[numButtons];
        Arrays.fill(onCommands, NO_COMMAND);
        Arrays.fill(offCommands, NO_COMMAND);
        undoCommands = new ArrayDeque<>();
    }

    public void setOnCommand(int slot, Command command){
        onCommands[slot] = command;
    }

    public void setOffCommand(int slot, Command command){
        offCommands[slot] = command;
    }

    public void onWasPushed(int slot){
        onCommands[slot].execute();
        undoCommands.push(onCommands[slot]);
    }

    public void offWasPushed(int slot){
        offCommands[slot].execute();
        undoCommands.push(offCommands[slot]);
    }

    public void undoWasPushed(){
       if(!undoCommands.isEmpty()){
           undoCommands.pop().undo();
       }
    }
}

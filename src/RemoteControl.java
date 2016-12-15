/**
 * Created by User on 2016/11/3.
 */
public class RemoteControl {
    Command[] onCommands;

    public RemoteControl() {
       onCommands=new Command[4];
        Command command=new NoCommand();
        for(int i=0;i<4;i++){
            onCommands[i]=command;
        }
        System.out.println("播放器已经开启！");
    }

    public void setOnCommands(int slot,Command command) {
        onCommands[slot]=command;
    }

    public void ButtonWasPressed(int slot){
        onCommands[slot].excute();
    }
}

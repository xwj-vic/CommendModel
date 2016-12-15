/**
 * Created by User on 2016/11/3.
 */
public class MusicPlayMain {
    public static void main(String[] args){
        RemoteControl remoteControl=new RemoteControl();
        MusicPlayer musicPlayer=new MusicPlayer();

        MusicPlayerIsPlay musicPlayerIsPlay=new MusicPlayerIsPlay(musicPlayer);
        MusicPlayerIsPause musicPlayerIsPause=new MusicPlayerIsPause(musicPlayer);
        MusicPlayerIsNextward musicPlayerIsNextward=new MusicPlayerIsNextward(musicPlayer);
        MusicPlayerIsUpward musicPlayerIsUpward=new MusicPlayerIsUpward(musicPlayer);

        remoteControl.setOnCommands(0,musicPlayerIsPlay);
        remoteControl.setOnCommands(1,musicPlayerIsPause);
        remoteControl.setOnCommands(2,musicPlayerIsNextward);
        remoteControl.setOnCommands(3,musicPlayerIsUpward);

        remoteControl.ButtonWasPressed(0);
        remoteControl.ButtonWasPressed(1);
        remoteControl.ButtonWasPressed(2);
        remoteControl.ButtonWasPressed(3);

    }
}

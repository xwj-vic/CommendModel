/**
 * Created by User on 2016/11/3.
 */
public class MusicPlayerIsPause implements Command {
    MusicPlayer musicPlayer;

    public MusicPlayerIsPause(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void excute() {
        musicPlayer.Pause();
    }
}

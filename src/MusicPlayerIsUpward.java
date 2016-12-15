/**
 * Created by User on 2016/11/3.
 */
public class MusicPlayerIsUpward implements Command {

    MusicPlayer musicPlayer;

    public MusicPlayerIsUpward(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void excute() {
        musicPlayer.Upward();
    }
}

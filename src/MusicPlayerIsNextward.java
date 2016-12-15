/**
 * Created by User on 2016/11/3.
 */
public class MusicPlayerIsNextward implements Command {

    MusicPlayer musicPlayer;

    public MusicPlayerIsNextward(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void excute() {
        musicPlayer.Nextward();
    }
}

/**
 * Created by User on 2016/11/3.
 */
public class MusicPlayerIsPlay implements Command {

    MusicPlayer musicPlayer;

    public MusicPlayerIsPlay(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void excute() {
        musicPlayer.Play();
    }
}

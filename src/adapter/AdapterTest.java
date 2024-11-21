package adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdapterTest {
    AudioPlayer audioPlayer = new AudioPlayer(new MediaAdapter(new AdvancedMediaPlayer()));

    @Test
    public void test_play_mp3() {
        Assertions.assertEquals(
                "Playing mp3 file. Name: test.mp3", audioPlayer.play("mp3", "test.mp3"));
    }

    @Test
    public void test_play_mp4() {
        Assertions.assertEquals("playing mp4", audioPlayer.play("mp4", "test.mp4"));
    }

    @Test
    public void test_play_vlc() {
        Assertions.assertEquals("playing vlc", audioPlayer.play("vlc", "test.vlc"));
    }
}

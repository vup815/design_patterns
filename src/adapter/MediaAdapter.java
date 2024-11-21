package adapter;

// Adapter
public class MediaAdapter implements MediaPlayer {
    private final AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public String play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
            return "playing mp4";
        } else if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
            return "playing vlc";
        } else {
            throw new IllegalArgumentException("Unsupported audio type: " + audioType);
        }
    }
}

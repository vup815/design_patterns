package adapter;

// Client
public class AudioPlayer {
    private final MediaPlayer mediaPlayer;
    public AudioPlayer(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    public String play(String audioType, String fileName) {
        // Built-in support for mp3
        if (audioType.equalsIgnoreCase("mp3")) {
            return "Playing mp3 file. Name: " + fileName;
        }
        // Use the adapter for advanced formats
        else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")) {
            return mediaPlayer.play(audioType, fileName);
        } else {
            throw new IllegalArgumentException("Unsupported audio type: " + audioType);
        }
    }
}

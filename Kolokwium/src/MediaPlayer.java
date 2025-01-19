public interface MediaPlayer {
    abstract void play(String trackName);
    abstract void pause();
    abstract String getCurrentTrack();
}

public class VideoPlayer implements MediaPlayer{
    String track;
    @Override
    public void play(String trackName) {
        this.track = trackName;
        System.out.println("Odtwarzam film: " + trackName);
    }

    @Override
    public void pause() {
        System.out.println("Zapauzowano");
    }

    @Override
    public String getCurrentTrack() {
        return track;
    }
}

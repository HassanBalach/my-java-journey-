
interface Playable{
    void  play();
    void  pause();
    void  stop();
}

class NaatPlayer implements Playable{
    @Override
    public void play(){
        System.out.println("Naat Playing!");
    }


    @Override
    public void pause(){
        System.out.println("Naat Pause!");
    }

    @Override
    public void stop(){
        System.out.println("Naat Stop!");
    }

}

class VideoPlayer implements  Playable{

    @Override
    public void play(){
        System.out.println("Video Playing:");
    }

    @Override
    public void stop(){
        System.out.println("Video Stopped:");
    }

    @Override
    public void pause() {
        System.out.println("Video Pause:");
    }
}

class  MusicPlayer implements Playable{



    @Override
    public void play() {
        System.out.println("Music Playing:");
    }

    @Override
    public void stop() {
        System.out.println("Music Stopped:");
    }

    @Override
    public void pause() {
        System.out.println("Music Paused:");
    }
}



public class InterfaceAbstraction {
    public static void main(String[] args) {

        Playable naatPlayer = new NaatPlayer();
        naatPlayer.play();
        naatPlayer.stop();
        naatPlayer.pause();

        Playable videoPlayer = new VideoPlayer();
        videoPlayer.play();
        videoPlayer.stop();
        videoPlayer.pause();

        Playable musicPlayer = new MusicPlayer();
        musicPlayer.play();
        musicPlayer.stop();
        musicPlayer.pause();


    }
}

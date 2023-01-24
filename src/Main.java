import java.io.File;

public class Main {
    public static void main(String[] args) {
        VideoPlayer player = new VideoPlayer();
        player.play(new File("C:/Users/zyh19/Desktop/test.avi"));
    }
}
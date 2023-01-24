import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class VideoPlayer implements IPlayer{
    @Override
    public void play(File file) {
        List<IDecoder> decoderList = new ArrayList<>();
        decoderList.add(new MP4Decoder());
        decoderList.add(new AVIDecoder());

        for (IDecoder decoder : decoderList) {
            if (decoder.canDecode(file)){
                System.out.println(decoder.decode(file));
                return;
            }
        }
        System.out.println("Not supported format!");
    }
}

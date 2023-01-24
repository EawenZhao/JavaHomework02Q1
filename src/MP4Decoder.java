import java.io.File;

public class MP4Decoder implements IDecoder{
    @Override
    public boolean canDecode(File file) {
        return file.getName().contains("mp4");
    }

    @Override
    public String decode(File file) {
        return "MP4文件解码后的数据...";
    }
}

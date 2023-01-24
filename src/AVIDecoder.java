import java.io.File;

public class AVIDecoder implements IDecoder{
    @Override
    public boolean canDecode(File file) {
        return file.getName().contains("avi");
    }

    @Override
    public String decode(File file) {
        return "AVI文件解码后的数据...";
    }
}

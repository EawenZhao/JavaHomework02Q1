import java.io.File;

public interface IDecoder {
    boolean canDecode(File file);
    String decode(File file);
}

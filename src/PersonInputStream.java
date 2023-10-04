import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.InputStream;
public class PersonInputStream extends ObjectInputStream {
    public PersonInputStream(InputStream in) throws IOException {
        super(in);
    }
}

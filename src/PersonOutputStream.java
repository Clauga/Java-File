import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
public class PersonOutputStream extends ObjectOutputStream {
  public PersonOutputStream(OutputStream out) throws IOException {
    super(out);
  }
}

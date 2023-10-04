import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.InputStream;
import java.util.List;
public class TeamInputStream extends ObjectInputStream {
    public TeamInputStream(InputStream in) throws IOException {
        super(in);
    }
    public List<Person> readTeam() throws IOException, ClassNotFoundException {
        return (List<Person>) this.readObject();
    }
}

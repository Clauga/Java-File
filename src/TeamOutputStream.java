import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.List;
public class TeamOutputStream extends ObjectOutputStream {
    public TeamOutputStream(OutputStream out) throws IOException {
        super(out);
    }
    public void writeTeam(List<Person> team) throws IOException {
        this.writeObject(team);
    }
}

import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class TeamExample {
    public static void main(String[] args)  {
        try {
            List<Person> team = new ArrayList<>();
            team.add(new Person("John",  42));
            team.add(new Person("Jane",  43));
            team.add(new Person("Baby",  1));
            FileOutputStream fileOut = new FileOutputStream("team.ser");
            TeamOutputStream teamOut = new TeamOutputStream(fileOut);
            teamOut.writeTeam(team);
            teamOut.close();

            FileInputStream fileIn = new FileInputStream("team.ser");
            TeamInputStream teamIn = new TeamInputStream(fileIn);
            List<Person> loadedTeam = teamIn.readTeam();
            teamIn.close();

            for (Person person : loadedTeam) {
                System.out.println("Loaded Person: " + person.getName()+ ", " + person.getAge());
            }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
    }
}

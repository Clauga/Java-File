import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("John", 30);
            FileOutputStream fileOut = new FileOutputStream("person.ser");
            PersonOutputStream personOut = new PersonOutputStream(fileOut);
            personOut.writeObject(person);
            personOut.close();

            FileInputStream fileIn = new FileInputStream("person.ser");
            PersonInputStream personIn = new PersonInputStream(fileIn);
            Person loadedPerson = (Person) personIn.readObject();
            personIn.close();

            System.out.println("Loaded Person: " + loadedPerson.getName() + ", " + loadedPerson.getAge());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

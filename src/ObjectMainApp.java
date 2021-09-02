import java.io.*;

public class ObjectMainApp {
    public static void main(String[] args) {

        Person person = new Person("Pearl", "De Smet");
        Person person2 = new Person("Parel", "De Smet");
        Person person3 = new Person("Pear", "De Smet");
        Address address = new Address("Snepkaai", "13", "9000", "Gent", "Belgium");
        person.setAddress(address);

        try (ObjectOutputStream objectOutputStream
                     = new ObjectOutputStream(new FileOutputStream("/Users/pearl/Documents/readingWriting/test.txt"))){

            objectOutputStream.writeObject(person);
            objectOutputStream.writeObject(person2);
            objectOutputStream.writeObject(person3);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream("/Users/pearl/Documents/readingWriting/test.txt"))) {
            Person person1;
            while ((person1 = (Person) objectInputStream.readObject()) != null)
                System.out.println(person1);
        }catch (EOFException eo){
            System.out.println("end of file");

        }catch (IOException | ClassNotFoundException  e) {
            e.printStackTrace();
        }

    }
}

import java.io.FileReader;
import com.opencsv.CSVReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static  void main(String[] args) throws IOException {
        FileReader filereader = new FileReader("C:\\Users\\Lenovo\\Downloads\\foreign_names.csv");
        char separator = ';';
        String[] temp;
        CSVReader csvreader = new CSVReader(filereader,';');
        List<Person> persons = new ArrayList<Person>();
        List<Division> divisions = new ArrayList<Division>();

        Random rand = new Random();
        while ((temp = csvreader.readNext()) != null)
        {
            persons.add(new Person(temp[0], temp[1], temp[2], temp[3], new Division(rand.nextInt(30000), temp[4]), (temp[5])));
        }
        for (int j = 1; j < persons.size(); j++)
        {
            System.out.print(persons.get(j).getId() + "\t ");
            System.out.print(persons.get(j).getName() + "\t ");
            System.out.print(persons.get(j).getSex() + "\t ");
            System.out.print(persons.get(j).getDate() + "\t ");
            System.out.print(persons.get(j).getDiv().getName() + "\t ");
            System.out.print(persons.get(j).getDiv().getId() + "\t ");
            System.out.print(persons.get(j).getZp() + "\t ");
        }
    }
}
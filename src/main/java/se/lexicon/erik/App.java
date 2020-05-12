package se.lexicon.erik;

import se.lexicon.erik.data.PeopleArrayImpl;
import se.lexicon.erik.data.PeopleRepository;
import se.lexicon.erik.model.Person;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PeopleRepository repository = PeopleArrayImpl.getInstance();
        Person erik = repository.create("erik.svensson@lexicon.se", "Erik", "Svensson", 25);
        System.out.println(Arrays.toString(repository.findByLastName("svensson")));
        System.out.println(repository.findById(erik.getId()));
        Person updatedErik = new Person(erik.getId(), "erik@gmail.com", erik.getFirstName(), erik.getLastName(), 22);
        repository.update(updatedErik);
        System.out.println(repository.findById(1));

        System.out.println(repository.delete(erik));

    }
}

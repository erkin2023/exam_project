package service;
import model.Person;

import java.util.List;
import java.util.Optional;

public interface IPerson {
    void savePerson(Person person);
    List<Person> getAllPerson();
    Optional<Person> getPersonByName(String namePerson);
    Person updatePersonById(long idPerson);
    String deletePersonById(long idPerson); // - Адам очсо бардык нерсе очот
}

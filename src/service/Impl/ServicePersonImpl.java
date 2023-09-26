package service.Impl;

import DateBase.DateBase;
import model.Car;
import model.Person;
import service.IPerson;

import java.util.*;

public class ServicePersonImpl implements IPerson {
    private DateBase dateBase;

    public ServicePersonImpl(DateBase dateBase) {
        this.dateBase = dateBase;
    }

    @Override
    public void savePerson(Person person) {
        List<Person>persons=dateBase.getPerson();
        persons.add(person);
        System.out.println("успешно сохранено\n"+person);
    }

    @Override
    public List<Person> getAllPerson() {
        List<Person>persons=dateBase.getPerson();
        return persons;
    }

    @Override
    public Optional<Person> getPersonByName(String namePerson) {
        List<Person>persons=dateBase.getPerson();
        return persons.stream().filter(p -> p.getFirstName().equals(namePerson)).findFirst();

    }

    @Override
    public Person updatePersonById(long idPerson) {
        Scanner scanner = new Scanner(System.in);
        List<Person>persons=dateBase.getPerson();
        for(Person p:persons){
            if (p.getId()==idPerson){
                System.out.println("введите имя");
                String name =scanner.nextLine();
                p.setFirstName(name);
                System.out.println("введите фио");
                String name1 =scanner.nextLine();
                p.setLastName(name1);
                System.out.println("введите возраст");
                int age = scanner.nextInt();
                p.setAge( age);
                System.out.println("Ввеите email");
                String email =scanner.nextLine();
                p.setEmail(email);
                return p;
            }
        } return null;
    }

    @Override
    public String deletePersonById(long idPerson) {
        List<Person> persons = dateBase.getPerson();
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getId()==idPerson){
                iterator.remove();
                return "Машина с ID " + idPerson + " успешно удалена.";
            }
        }
        return "Машина с ID " + idPerson + " не найдена.";
    }
}

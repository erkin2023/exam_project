package DateBase;

import model.Car;
import model.Person;
import model.SocialMedia;

import java.util.List;

public class DateBase {
    private List<Person> person;
    private List<Car> car;
    private List<SocialMedia> socialMedia;

    public DateBase(List<Person> person, List<Car> car, List<SocialMedia> socialMedia) {
        this.person = person;
        this.car = car;
        this.socialMedia = socialMedia;
    }

    public List<Person> getPerson() {
        return person;
    }

    public void setPerson(List<Person> person) {
        this.person = person;
    }

    public List<Car> getCar() {
        return car;
    }

    public void setCar(List<Car> car) {
        this.car = car;
    }

    public List<SocialMedia> getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(List<SocialMedia> socialMedia) {
        this.socialMedia = socialMedia;
    }

    @Override
    public String toString() {
        return "DateBase{" +
                "person=" + person +
                ", car=" + car +
                ", socialMedia=" + socialMedia +
                '}';
    }
}

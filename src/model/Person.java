package model;

import java.util.List;

public class Person {
    private long id;
    private String firstName;
    private String  LastName;
    private int age;
    private String email;
    private List<Car> cars;
    private List<SocialMedia>socialMedia;

    public Person(long id, String firstName, String lastName, int age, String email, List<Car> cars, List<SocialMedia> socialMedia) {
        this.id = id;
        this.firstName = firstName;
        LastName = lastName;
        this.age = age;
        this.email = email;
        this.cars = cars;
        this.socialMedia = socialMedia;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<SocialMedia> getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(List<SocialMedia> socialMedia) {
        this.socialMedia = socialMedia;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}

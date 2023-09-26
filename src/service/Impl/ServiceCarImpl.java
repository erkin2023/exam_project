package service.Impl;

import DateBase.DateBase;
import model.Car;
import model.Person;
import service.ICar;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ServiceCarImpl implements ICar {
    private DateBase dateBase;

    @Override
    public void saveCar(long personId, Car car) {
        List<Person> persons = dateBase.getPerson();
        for (Person p : persons) {
            if (p.getId()==personId) {
                List<Car> cars =new LinkedList<>();
                cars.add(car);
                System.out.println("Успешно сохранен");
            }
        }
    }
    @Override
    public List<Car> getCarByPersonId(long idPerson) {
        List<Person>persons=dateBase.getPerson();
        for(Person p:persons){
            if (p.getId()==idPerson){
                return p.getCars();
            }
        }
        return null;
    }

    @Override
    public Car getCarById(int idCar) {
        List<Car>cars=dateBase.getCar();
        for(Car c: cars){
            if (c.getId()==idCar){
                return c;
            }
        }
        return null;
    }

    @Override
    public void updateCarById(int idCar) {
        Scanner scanner = new Scanner(System.in);
        List<Car>cars=dateBase.getCar();
        for (Car c: cars){
            if (c.getId()==idCar){
                System.out.println("Введите название машины ");
                String name =scanner.nextLine();
                c.setName(name);
                System.out.println("ВВедите модель");
                String model=scanner.nextLine();
                c.setModel(model);
                System.out.println("Введите год выпуска");
                int years =scanner.nextInt();
                c.setYear(years);
            }
        }
    }

    @Override
    public String deleteCarById(int idCar) {
            List<Car> cars = dateBase.getCar();
            Iterator<Car> iterator = cars.iterator();
            while (iterator.hasNext()) {
                Car c = iterator.next();
                if (c.getId() == idCar) {
                    iterator.remove(); // Удаляем элемент через итератор
                    return "Машина с ID " + idCar + " успешно удалена.";
                }
            }

            return "Машина с ID " + idCar + " не найдена.";
        }
}

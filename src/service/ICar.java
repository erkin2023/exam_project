package service;
import model.*;
import java.util.List;

public interface ICar {
    void saveCar(long personId,Car car) ;     //- машина Person го тиешелуу болуп сакталсын
    List<Car> getCarByPersonId(long idPerson);
    Car getCarById(int idCar);
    void updateCarById(int idCar);
    String deleteCarById(int idCar);


    /*Адамдын бир эле машинасы сы очот, адам очпойт
    Бир Адамдын коп social media сы бар, бир social media коп адамда боло алат
    Бир адамдын коп машинасы боло алат, бир машина бир эле адамга тиешелуу боло алат*/
}

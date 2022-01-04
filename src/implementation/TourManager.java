package implementation;

import models.City;

import java.util.ArrayList;
import java.util.List;

public interface TourManager {

    void addCity(City city);

    City getCity(int index);

    int numberOfCities();

}

package implementation;

import models.City;

import java.util.ArrayList;
import java.util.List;

//Todo: Modify the impl
public class TourManagerImpl {

    // Holds our cities
    private static List<City> destinationCities = new ArrayList<>();

    // Adds a destination city
    public static void addCity(City city) {
        destinationCities.add(city);
    }

    // Get a city
    public static City getCity(int index){
        return (City)destinationCities.get(index);
    }

    // Get the number of destination cities
    public static int numberOfCities(){
        return destinationCities.size();
    }

}

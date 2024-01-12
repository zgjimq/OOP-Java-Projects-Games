package java5.WorkF;

import java.util.HashMap;

public class CityPopulationTracker {
    private HashMap<String, City> cityPopulation;

    public CityPopulationTracker() {
        cityPopulation = new HashMap<>();
    }

    public City getCity(String cityName) {
        City city = cityPopulation.get(cityName);
        return city != null ? new City(city.getName(), city.getCountry(), city.getPopulation()) : null;
    }

    public void setCity(City city) {
        if (city == null) {
            throw new IllegalArgumentException("City object cannot be null.");
        }
        String cityName = city.getName();
        if (cityPopulation.containsKey(cityName)) {
            cityPopulation.put(cityName, new City(city.getName(), city.getCountry(), city.getPopulation()));
        } else {
            throw new IllegalArgumentException("City does not exist in the population tracker.");
        }
    }

    public void addCity(City city) {
        if (city == null) {
            throw new IllegalArgumentException("City object cannot be null.");
        }
        String cityName = city.getName();
        if (!cityPopulation.containsKey(cityName)) {
            cityPopulation.put(cityName, new City(city.getName(), city.getCountry(), city.getPopulation()));
        } else {
            throw new IllegalArgumentException("City already exists in the population tracker.");
        }
    }
}

package java5.DetShpie;

import java.util.HashMap;

public class CityPopulationTracker {
    private HashMap<String,City>cityPopulation;
    
    public CityPopulationTracker(){
        cityPopulation=new HashMap<>();
    }
    public City getCity(String name){
        City city= cityPopulation.get(name);
        if(city!=null){
            return new City(city.getName(),city.getCountry(), city.getPolulation());    
        }
        return null;
    }
    public void setCity(City city){
        if(city==null){
            throw new IllegalArgumentException("City cannot be null");
        }
        cityPopulation.put(city.getName(), new City(city.getName(), city.getCountry(), city.getPolulation()));
    }
    public void addCity(City city){
        
        cityPopulation.put(city.getName(), new City(city.getName(), city.getCountry(), city.getPolulation()));
    }
    
}

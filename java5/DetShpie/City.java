package java5.DetShpie;

public class City {
    private String name;
    private String country;
    private long population;

    public City(String name,String country,long population){
        setName(name);
        setCountry(country);
        setPopulation(population);
    }
    public String getName(){
        return this.name;
    }
    public String getCountry(){
        return this.country;
    }
    public Long getPolulation(){
        return population;
    }
    public void setName(String name){
        if(name==null || name.trim().isEmpty())throw new IllegalArgumentException("Invalid name");
        this.name=name;
    }
    public void setCountry(String country){
        if(country==null || country.trim().isEmpty())throw new IllegalArgumentException("Invalid country");
        this.country=country;
    }
    public void setPopulation(Long population){
        if(population<0)throw new IllegalArgumentException("population needs to be greater then 0");
        this.population=population;
    }

}

package model.domain;

public class Eten {
    private String naam;
    private int aantal;
    private int calorie;
    public Eten(String naam, int aantal, int calorie){
        setNaam(naam);
        setAantal(aantal);
        setCalorie(calorie);

    }
    public String getNaam(){
        return naam;
    }
    public int getAantal(){
        return aantal;
    }
    public int getCalorie(){
        return calorie;
    }

    public void setNaam(String naam) {
        if(naam.trim().isEmpty()){
            throw new IllegalArgumentException("naam is empty");
        }
        this.naam = naam;
    }
    public void setAantal(int aantal) {
        if(aantal<0){
            throw new IllegalArgumentException("aantal is kleiner dan 0");
        }
        this.aantal = aantal;
    }
    public void setCalorie(int calorie) {
        if(calorie<0){
            throw new IllegalArgumentException("calorie is kleiner dan 0");
        }
        this.calorie = calorie;
    }
    public void setAantalString(String aantal) {
        this.aantal = Integer.parseInt(aantal);
    }
    public void setCalorieString(String calorie) {
        this.calorie = Integer.parseInt(calorie);
    }
}

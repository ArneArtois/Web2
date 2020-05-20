package model.db;

import model.domain.Eten;

import java.util.ArrayList;

public class EtenDB {
    private ArrayList<Eten> etenArrayList;
    public EtenDB(){
        etenArrayList = new ArrayList<>();
        Eten frieten = new Eten("Frieten", 3,150);
        Eten lasagna = new Eten("Lasagna", 1, 100);
        Eten pizza = new Eten("Pizza", 4, 75);
        etenArrayList.add(frieten);
        etenArrayList.add(lasagna);
        etenArrayList.add(pizza);
    }
    public void addEten(Eten eten){
        if(eten == null){
            throw new IllegalArgumentException("Eten mag niet null zijn");
        }
        etenArrayList.add(eten);
    }
    public ArrayList<Eten> getEtenArrayList(){
        return this.etenArrayList;
    }
    public int berekening(){
        int aantal =0;
        for(Eten eten: etenArrayList){
            aantal+=eten.getAantal();
        }
        return aantal;
    }

}

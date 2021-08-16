package com.dovalle.util;

import com.dovalle.classes.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MyMap {
    Map<Integer, Person> hsmPersons;
    TreeMap<String, String> trmCitiesBrazil;

    public MyMap() {
        this.hsmPersons = new HashMap<>();
        this.trmCitiesBrazil = new TreeMap<>();
        mapPersonsID();
        mapCitiesInitials();
    }

    public Map<Integer, Person> getHsmPersons() {
        return hsmPersons;
    }

    public void setHsmPersons(Map<Integer, Person> hsmPersons) {
        this.hsmPersons = hsmPersons;
    }

    public TreeMap<String, String> getTrmCitiesBrazil() {
        return trmCitiesBrazil;
    }

    public void setTrmCitiesBrazil(TreeMap<String, String> trmCitiesBrazil) {
        this.trmCitiesBrazil = trmCitiesBrazil;
    }

    private void mapPersonsID(){
        List <Person> persons = new Person().sampleListPerson();
        for (int id = 0; id < persons.size(); id++) {
            //add ou update a key and follow value
            this.hsmPersons.put(id, persons.get(id));
        }
    }

    private void mapCitiesInitials(){
        this.trmCitiesBrazil.put("RJ", "Rio de Janeiro");
        this.trmCitiesBrazil.put("SP", "São Paulo");
        this.trmCitiesBrazil.put("GV", "Governador Valadares");
        this.trmCitiesBrazil.put("JP", "João Pessoa");
        this.trmCitiesBrazil.put("JV", "Joinville");
        this.trmCitiesBrazil.put("BH", "Belo Horizonte");
    }

    public String showHashMapPersons(){
        StringBuilder strMap = new StringBuilder();
        strMap.append("\n\nHashMap of Person. HashMap doesn't grants the order insertion and has MORE performance.");
        for (Map.Entry<Integer, Person> hasmapEntry: this.hsmPersons.entrySet()){
            strMap.append(String.format("\nID key: %s, %s", hasmapEntry.getKey(), hasmapEntry.getValue().showPersonDetails()));
        }
        return strMap.toString();
    }

    public String showTreemapCities(){
        StringBuilder strTree = new StringBuilder();
        strTree.append("\n\nTree Map doesn't grant the insertion order. And it has more performance for read, but less when insert");
        strTree.append(String.format("\nFirst entry of tree cities: %s", this.trmCitiesBrazil.firstEntry()));
        strTree.append(String.format("\nLast entry of tree cities: %s", this.trmCitiesBrazil.lastEntry()));
        strTree.append(String.format("\nThe LOWER entry on BH city: %s - %s", this.trmCitiesBrazil.lowerEntry("JP").getKey(), this.trmCitiesBrazil.lowerEntry("JP").getValue()));
        strTree.append(String.format("\nFull tree of cities: %s", this.trmCitiesBrazil));
        return strTree.toString();
    }
}

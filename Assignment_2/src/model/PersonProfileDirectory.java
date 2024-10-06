/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author jaswa
 */
public class PersonProfileDirectory {
    private ArrayList<PersonProfile> person;
    
    public PersonProfileDirectory()
    {
        this.person = new ArrayList<PersonProfile>();
    }
    
    public ArrayList<PersonProfile> getPersons()
    {
        return person;
    }
    
    public void setPersons(ArrayList<PersonProfile> person)
    {
        this.person = person;
    }
    
     public PersonProfile addPerson()
    {
        PersonProfile pp = new PersonProfile();
        person.add(pp);
        return pp;
    }
     
    public void deleteAccount(PersonProfile persons)
    {
        person.remove(persons);
    }
    
    public PersonProfile searchPerson(String searchstring){
        for(PersonProfile pp: person)
        {
            if (pp.getFirstname().contains(searchstring) || pp.getLastname().contains(searchstring) ||pp.getHomeaddress().getStreetaddress().contains(searchstring) || pp.getWorkaddress().getStreetaddress().contains(searchstring)) {
                return pp;
            }
        }
        return null;
    }             
}
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
public class PersonDirectory {
    
   
    private ArrayList<Person> persons;
    
    public PersonDirectory() {
        this.persons = new ArrayList<>(); // Initialize the ArrayList
    }
     
    public PersonDirectory(ArrayList<Person> persons) {
        this.persons = persons;
    } 
    
    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }
    
    // Add a new person
    public void addPerson(Person p) {
        persons.add(p);
    }
    
    // Remove a person
    public void deletePerson(Person p) {
        persons.remove(p);
    }

    public Person searchPersonByNameOrHomeAddress(String firstName, String lastName, String streetAddress, String city, String zipcode) {
    for (Person p : persons) {
        // Check if either the name or home address matches
        boolean nameMatches = p.getFirstName().equalsIgnoreCase(firstName) &&
                              p.getLastName().equalsIgnoreCase(lastName);
                              
        boolean addressMatches = p.getHomeStreetAddress().equalsIgnoreCase(streetAddress) &&
                                 p.getHomeCity().equalsIgnoreCase(city) &&
                                 p.getHomeZipCode().equals(zipcode);

        // Return the person if either condition is true
        if (nameMatches || addressMatches) {
            return p;
        }
    }
    return null;
}
}


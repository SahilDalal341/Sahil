/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;
//hgghjyhg

/**
 * A class to model Student Objects
 * each student has: a name (first an last name)
 * each student can: say their name (getName)
 * 
 * @author dancye May 7, 2018
 */
public class Student 
{
    private String name;
    private String friend;
    private String car;

    public void setCar(String car) {
        this.car = car;
    }

    public String getCar() {
        return car;
    }

    public void setFriend(String friend) {
        this.friend = friend;
    }

    public String getFriend() {
        return friend;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param givenName the name to set
     */
    public void setName(String givenName) {
        name = givenName;
    }
    
    
}

package com.marcos.jackson.json.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Student
{

    private int id;
    private String firstName;
    private String lastName;
    private boolean active;
    private Address address;
    private String[] languages;

    public Student()
    {

    }

    public int getId()
    {
        return id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public boolean isActive()
    {
        return active;
    }

    public Address getAddress()
    {
        return address;
    }

    public String[] getLanguages()
    {
        return languages;
    }

    public void setLanguages(String[] languages)
    {
        this.languages = languages;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

    public void setActive(boolean active)
    {
        this.active = active;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
}

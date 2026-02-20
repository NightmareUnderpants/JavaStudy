package main.lab9_10;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

class PeopleData implements Serializable
{
    private static final long serialVersionUID = 1L;

    private String FirstName;
    private String SecondName;
    private String Address;
    private int Age;

    public PeopleData (String FirstName, String SecondName, String Address, int Age)
    {
        this.FirstName = FirstName;
        this.SecondName = SecondName;
        this.Address = Address;
        this.Age = Age;
    }

    @Override
    public String toString() {
        return "PeopleData{" +
                "FirstName='" + FirstName + '\'' +
                ", SecondName='" + SecondName + '\'' +
                ", Address='" + Address + '\'' +
                ", Age=" + Age +
                '}';
    }
}

public class People
{
    private List<PeopleData> _peoplesData;

    public People()
    {
        _peoplesData = new ArrayList<>();
    }

    public void AddPeople(String FirstName, String SecondName, String Address, int Age)
    {
        PeopleData newPeople = new PeopleData(FirstName, SecondName, Address, Age);

        _peoplesData.add(newPeople);
    }

    public void Clear()
    {
        _peoplesData.clear();
    }

    public void Display()
    {
        for (PeopleData data : _peoplesData)
        {
            System.out.println(data.toString());
        }
    }

    public List<PeopleData> GetPeopleData()
    {
        return _peoplesData;
    }

    public void SetPeopleData(List<PeopleData> peoplesData)
    {
        _peoplesData = peoplesData;
    }
}

package main.lab9_10;

public class Lab9_10
{
    public static void main(String[] args) {
        People people = new People();

        people.AddPeople("Sasha", "Sashovich", "st. Home", 20);
        people.AddPeople("Oleg", "Olegovich", "st. Tools", 23);
        people.AddPeople("Tipok", "Tipochek", "st. Hood", 19);

        System.out.println("Before Save and Load: ");
        people.Display();

        FileSaver.SaveFile(people.GetPeopleData());

        people.Clear();

        people.SetPeopleData(FileReader.LoadFile());

        System.out.println("After Save and Load: ");
        people.Display();
    }
}

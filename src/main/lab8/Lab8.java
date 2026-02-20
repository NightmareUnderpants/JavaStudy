package main.lab8;

public class Lab8
{
    public static void main(String[] args) {
        try
        {
            Stack<Integer> intStack = new Stack<Integer>();

            intStack.Push(1);
            intStack.Push(2);

            intStack.Pop();
            intStack.Pop();
            //intStack.Pop();

            intStack.Push(1);
            intStack.Push(2);
            intStack.Push(3);
            intStack.Push(4);
            intStack.Push(5);
            /*
            intStack.Push(3);
            intStack.Push(6);
            intStack.Find(3);
            */

            intStack.Find(4);
        }
        catch (FullContainerException | EmptyContainerException | SearchContainerException e)
        {
            System.err.println(e.getMessage());
        }
    }
}

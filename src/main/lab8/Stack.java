package main.lab8;

class FullContainerException extends Exception
{
    public FullContainerException(int maxSize)
    {
        super("Container is full. Max size: " + maxSize);
    }
}

class EmptyContainerException extends Exception
{
    public EmptyContainerException()
    {
        super("Container is empty.");
    }
}

class SearchContainerException extends Exception
{
    public SearchContainerException()
    {
        super("Container have 2 similar elements.");
    }
}

public class Stack<T>
{
    private T[] _dataList;

    private int _maxSize = 6;
    private int _topStack;

    public Stack() {
        _dataList = (T[]) new Object[_maxSize];
        _topStack = -1;
    }

    public void Push(T element) throws FullContainerException
    {
        if (_topStack >= _maxSize - 1)
            throw new FullContainerException(_maxSize);

        _topStack++;
        _dataList[_topStack] = element;
    }

    public T Pop() throws EmptyContainerException
    {
        if (_topStack < 0)
            throw new EmptyContainerException();

        T elem = _dataList[_topStack];
        _dataList[_topStack] = null;
        _topStack--;

        return elem;
    }

    public T Find(T element) throws SearchContainerException
    {
        T searched = null;
        for (int i = 0; i < _topStack + 1; i++)
        {
            if (element == _dataList[i])
            {
                if (searched != null)
                    throw new SearchContainerException();

                searched = _dataList[i];
            }
        }

        return searched;
    }
}

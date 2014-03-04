public class Stack<T>
{
    private List<T> stack;
    
    public Stack()
    {
        stack = new BetterArray<T>();
    }
    
    public void push(T value)
    {
        stack.add(value);
    }
    
    // Return top item.
    // Throws java.util.EmptyStackException if stack
    // is empty.
    public T pop()
    {
        if(isEmpty() == true)
        {
            throw new java.util.EmptyStackException();
        }
        else
        {
            return stack.get(stack.size() - 1);
        }
    }
    
    public T peek()
    {
        if(isEmpty() == true)
        {
            throw new java.util.EmptyStackException();
        }
        else
        {
            return null;
        }
    }
    
    public void clear()
    {
        stack.clear();
    }
    
    public boolean isEmpty()
    {
        if (stack.size() == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public String print()
    {
        return stack.toString();
    }
    
    public int size()
    {
        return stack.size();
    }
}
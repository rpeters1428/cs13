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
        return null;
    }
    
    public T peek()
    {
        return null;
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
}
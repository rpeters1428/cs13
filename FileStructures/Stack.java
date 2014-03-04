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
    
    // Return top item.  Remove the top element in the stack
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
            T value = stack.get(stack.size() - 1);
            
            stack.remove();
            
            return value;
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
            return stack.get(stack.size() - 1);
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
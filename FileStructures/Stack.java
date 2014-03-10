public class Stack<T>
{
    private List<T> stack;
    
    public Stack()
    {
        stack = new LList<T>();
    }
    // Put an element on top of the stack
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
            T value = stack.get(0);
            
            stack.remove();
            
            return value;
        }
    }
    // Peek at the top element of the stack and nothing below
    // Throw exception if the stack is empty
    public T peek()
    {
        if(isEmpty() == true)
        {
            throw new java.util.EmptyStackException();
        }
        else
        {
            return stack.get(0);
        }
    }
    // Clear the stack and "start over"
    public void clear()
    {
        stack.clear();
    }
    // Check to see if the stack is empty.  If it is return true or false
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

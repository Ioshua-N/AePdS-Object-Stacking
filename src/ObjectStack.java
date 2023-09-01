public class ObjectStack
{
    // variables
    private Object[] stack; // stack of objects
    private int size; // actual size of the stack

    // constructor
    public ObjectStack(int number)
    {
        this.stack = new Object[number];
        this.size = 0;
    }

    // add an object into the stack
    public void push (Object object) throws StackFullException
    {
        // test if the stack is full
        if (size >= stack.length)
        {
            // call exception if stack is full
            throw new StackFullException("The Stack is full.");
        }
        // add object to the stack and go to the next space
        stack[size] = object;
        size++;
    }

    // get the object on the top of the stack
    public Object pop () throws StackEmptyException
    {
        // test if the stack is empty
        if (size <= 0)
        {
            // call exception
            throw new StackEmptyException("The Stack is empty.");
        }
        // show the object
        return stack[size - 1];
    }
}
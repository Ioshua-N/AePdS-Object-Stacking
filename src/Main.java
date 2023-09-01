public class Main
{
    public static void main(String[] args) throws StackEmptyException, StackFullException
    {
        // variables
        ObjectStack stack = new ObjectStack(2);
        Teste a = new Teste(1);
        Teste b = new Teste(2);
        Teste c = new Teste(3);

        // teste pop exception
        // stack.pop(); // return the StackEmptyException (OK)

        // test push
        stack.push(a);
        // test pop
        System.out.println(stack.pop().toString());

        // test push exception
        stack.push(b);
        // stack.push(c); // return StackFullException (OK)

        System.out.println(stack.pop().toString());
    }
}
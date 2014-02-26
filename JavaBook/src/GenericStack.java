public class GenericStack<E>
{
	private java.util.ArrayList<E> list = new java.util.ArrayList<E>();
	
	public int getSize()
	{
		return list.size();
	}
	public E peek()
	{
		return list.get(getSize()-1);
	}
	public void push(E o)
	{
		list.add(o);
	}
	public E pop()
	{
		E o = list.get(getSize()-1);
		System.out.println(o);
		list.remove(getSize()-1);
		return o;
	}
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	public static void main(String [] args)
    {
		GenericStack<String> stack1 = new GenericStack<String>();
		stack1.push("London");
		stack1.push("Paris");
		stack1.push("Berlin");
		System.out.println(stack1);
		stack1.pop();
		stack1.pop();
		stack1.pop();
		
		GenericStack<Integer> stack2 = new GenericStack<Integer>();
		stack2.push(1);
		stack2.push(2);
		stack2.push(3);
		stack2.pop();
		stack2.pop();
		stack2.pop();
	}
}
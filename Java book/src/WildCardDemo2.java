public class WildCardDemo2
{
	public static void main(String[] args)
	{
		GenericStack<Integer> intStack2 = new GenericStack<Integer>();
		intStack2.push(1);
		intStack2.push(2);
		intStack2.push(-2);

		print(intStack2);
	}
	public static void print(GenericStack<?> stack)
	{
		while(!stack.isEmpty())
		{   
			//stack.pop();
			System.out.println(stack.pop());//输出两次栈元素
		}
	}
	
}
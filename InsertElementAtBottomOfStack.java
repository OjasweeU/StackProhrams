//Given stack write a function to insert element at the bottom of the stack.
package Questions;
import java.util.Stack;
public class InsertElementAtBottomOfStack 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Stack<Integer> stack=new Stack<>();
		 stack.push(5);
		 stack.push(15);
		 stack.push(10);
		 
		 insertElementAtBottom(stack, 55);
		 
		 while(!stack.isEmpty())
		 {
			 System.out.println(stack.pop());
		 }
	}
	private static void insertElementAtBottom(Stack<Integer> stack, int element)
	{
		if(stack.isEmpty())
		{
			stack.push(element);
		}
		else
		{
			int top=stack.pop();
			insertElementAtBottom(stack, element);
			stack.push(top);
		}
	}

}


/*OUTPUT
10
15
5
55
*/
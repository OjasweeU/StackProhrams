//Given a stack, reverse its elements
package Questions;
import java.util.Stack;
public class ReverseStack 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
       Stack<Integer> stack= new Stack<>();
       stack.push(1);
       stack.push(2);
       stack.push(3);
       
       reverseStack(stack);
       
       while(!stack.isEmpty())
       {
    	   System.out.println(stack.pop());
       }
	}
	
	private static void reverseStack(Stack <Integer> stack)
	{
		if(stack.isEmpty())
		{
			return;
		}
		int top=stack.pop();
		reverseStack(stack);
		stack.push(top);
	}

}


/*OUTPUT
3
2
1*/
//Given a stack, sort elements such that largest value is at the top
package Questions;
import java.util.Stack;
public class SortStack 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 Stack<Integer> stack=new Stack<>();
		 stack.push(5);
		 stack.push(15);
		 stack.push(10);
		 
		 sortStack(stack);
		 
		 while(!stack.isEmpty())
		 {
			 System.out.println(stack.pop());
		 }
	}
   private static void sortStack(Stack<Integer> stack)
   {
	   Stack <Integer> tempStack=new Stack<>();
	   
	   while(!stack.isEmpty())
	   {
		   int element=stack.pop();
		   
		   while(!tempStack.isEmpty()&& tempStack.peek( ) < element)
		   {
			   stack.push(tempStack.pop());
		   }
		   tempStack.push(element);
	   }
	   while(!tempStack.isEmpty( ))
	   {
		   stack.push(tempStack.pop( ));
	   }
   }
}


/*OUTPUT
 * 15
10
5
*/

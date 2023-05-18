//Sorted Insert using Stack, insert elements in sorted order , with highest at the top and lowest at the bottom
package Questions;
import java.util.Stack;
public class InsertElementsInSortedOrder
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       Stack<Integer> stack=new Stack<>();
       stack.push(10);
       stack.push(5623);
       stack.push(7372);
       
       insertElementsInSortedOrder(stack);
       
       while(!stack.isEmpty( ))
       {
    	   System.out.println(stack.pop( ));
       }
	}
   private static void insertElementsInSortedOrder(Stack<Integer> stack)
   {
	   Stack <Integer> tempStack= new Stack<>( );
	   
	   while (!stack.isEmpty())
	   {
		   int element=stack.pop();
		   
		   while(!tempStack.isEmpty( )&& tempStack.peek( ) < element)
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
 * 7372
5623
10
*/

import java.util.Stack;
public class PopMiddle{
    private static Stack<Integer> PopMiddle(Stack<Integer> stack,int middle){
         if(middle == 1)
         {
             stack.pop();
             return stack;
         }
        int element = stack.pop();
        stack =  PopMiddle(stack, --middle);
        stack.push(element);
        return stack;
    } 
    
   static Stack<Integer> deleteMiddle(Stack<Integer> stack)
    {

        if(stack.size() == 0)
        return stack;
        
        else{
         int middle ;
         if(stack.size()%2 == 0)
         middle = (stack.size() /2)  ;   
         else
         middle = (stack.size()/2) + 1;
        return PopMiddle(stack,middle);
        }
        
    }
    
    public static void main(String args[]){

            Stack<Integer> stack = new Stack<Integer>();
            int i = 1;
            while(i<=10)
            stack.push(i++);

            System.out.println(stack);

            Stack<Integer> stack1 = deleteMiddle(stack);
            System.out.println(stack1);

	}
}

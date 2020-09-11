// package Competitive-Coding-problems-and-solutions;
import java.util.Stack;

public class ReverseStack {

    static Stack<Integer> Reverse(Stack<Integer> stack,Stack<Integer> stackNew)
    {
        if(stack.isEmpty())
        return stackNew;

        
        
        stackNew.push(stack.pop());
        stack = Reverse(stack,stackNew);
        
        
        return stackNew;
        
    }
    private static Stack<Integer> reverseStack(Stack<Integer> stack)
    {
        if(stack.size() == 0)
        {
            System.out.println("provide valid stack!!");
            return stack;

        }
        Stack<Integer> stackNew = new Stack<Integer>();

        stackNew = Reverse(stack,stackNew);
    

        
    return stackNew;
    }

    public static void main(String args[]){
    Stack<Integer> stack = new Stack<Integer>();
    int i = 1;
    while(i<=10)
    stack.push(i++);

    System.out.println(stack);
   Stack<Integer> stack1 =  reverseStack(stack);
   System.out.println(stack1);
    
    } 

 }


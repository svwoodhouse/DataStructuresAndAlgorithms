package palindromecheck;

import java.util.LinkedList;

public class LinkedStack {
    private LinkedList<Character> stack;
    
    public LinkedStack() {
        stack = new LinkedList<Character>();
    }
    
    public void push(char c){
        stack.push(c);
    }
    
    public char peek(){
        return stack.peek();
    }
    
    public void pop(){
        stack.pop();
    }
    
    public boolean isEmpty()
    {
        return stack.isEmpty();
    }
    
    public int size() {
        return stack.size();
    }
    
    public void printStack (){
        for(int i = stack.size()-1; i >=0; i--)
        {
            System.out.print(stack.get(i));
        }
        System.out.println();
    }
}

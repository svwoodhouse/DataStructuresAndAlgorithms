/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromecheck;

public class Main {
    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }
    public static boolean checkForPalindrome(String string) {
        StringBuilder palindromeString = new StringBuilder();
        String str = "";
        string = string.replaceAll("[^A-Za-z]", "");
        string = string.toLowerCase();
       // System.out.println(string);
        LinkedStack stack = new LinkedStack();
        for(int i = 0; i < string.length(); i++){
            if((string.charAt(i) >= 'a' && string.charAt(i) <= 'z')){
                stack.push(string.charAt(i));
            }
        }
      // stack.printStack();
        int num = stack.size();
        for(int i = 0; i < num; i++)
        {
            palindromeString.append(stack.peek());
            stack.pop();
        }
        str = palindromeString.toString();
       // System.out.println(str);
        
        if(string.equalsIgnoreCase(str))
            return true;
        
        return false;
    }
}

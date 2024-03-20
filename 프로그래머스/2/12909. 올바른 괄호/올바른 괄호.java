import java.util.Stack;

class Solution {
    boolean solution(String s) {

        Stack<Character> c = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                c.push('(');
            }else if(s.charAt(i) == ')'){
                if(c.empty()){
                    return false;
                }
                c.pop();
            }
        }
        return c.isEmpty();
    }
}
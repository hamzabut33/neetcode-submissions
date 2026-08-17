class Solution {
    public boolean isValid(String s) {

        Stack <Character> tower = new Stack <Character> ();

        for(int i = 0; i < s.length() ; i++){
            char current = s.charAt(i);
            if (current == '(' || current == '[' || current == '{'){
                tower.push(current);}
            else {
                if (tower.isEmpty())
                   return false;
                if (current == ')' && tower.peek() == '(')
                   tower.pop();
                else if (current == '}' && tower.peek() == '{')
                   tower.pop();
                else if (current == ']' && tower.peek() == '[') 
                    tower.pop();
                else
                    return false;
            }
            }
        return tower.isEmpty();
        } 
    }


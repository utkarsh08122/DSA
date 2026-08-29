import java.util.*;
class isValid {
    public boolean isValid(String s) {

        Stack<Character> str = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char current = s.charAt(i);

            if (current == '(' || current == '[' || current == '{') {
                str.push(current);
            } 
            else {

                if (str.isEmpty()) {
                    return false;
                }

                char top = str.peek();

                if ((current == ')' && top == '(') ||
                    (current == ']' && top == '[') ||
                    (current == '}' && top == '{')) {

                    str.pop();

                } else {
                    return false;
                }
            }
        }

        return str.isEmpty();
    }
}
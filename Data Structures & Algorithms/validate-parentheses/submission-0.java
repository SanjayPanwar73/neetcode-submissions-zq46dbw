class Solution {
    public boolean isValid(String S) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    return false;
                }

                if ((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}')
                        || (s.peek() == '[' && ch == ']')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }

        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}

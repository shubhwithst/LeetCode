class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<Integer>();
        int sumAll = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                int top = st.pop();
                int newScore = top + st.peek();
                st.push(top);
                st.push(newScore);
            } else if (operations[i].equals("D")) {
                st.push(2 * st.peek());
            } else if (operations[i].equals("C")) {
                st.pop();
            } else {
                st.push(Integer.parseInt(operations[i]));
            }
        }
        while (!st.isEmpty()) {
            sumAll += st.pop();
        }
        return sumAll;
    }
}
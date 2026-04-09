class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (String opr : operations) {
                if ("+".equals(opr)) {
                    int prevValue = stack.pop();
                    int prevSecondValue = stack.peek();
                    int newCurrValue = prevValue + prevSecondValue;
                    stack.push(prevValue);
                    stack.push(newCurrValue);
                }
                else if ("C".equals(opr)) {
                    stack.pop();
                }
                else if ("D".equals(opr)) {
                    int prevValue = stack.peek();
                    int newCurrValue = prevValue * 2;
                    stack.push(newCurrValue);
                } else {
                    stack.push(Integer.parseInt(opr));
                }
        }
        int result = 0;
        for (int i : stack) {
            result = result + i;
        }
        return result;
    }
}
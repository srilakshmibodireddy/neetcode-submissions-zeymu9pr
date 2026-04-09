class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (String opr : operations) {
            if (!"+".equals(opr) && !"D".equals(opr) && !"C".equals(opr)) {
                stack.push(Integer.valueOf(opr));
            } else {
                if ("+".equals(opr)) {
                    Integer prevValue = stack.pop();
                    Integer prevSecondValue = stack.peek();
                    Integer newCurrValue = prevValue + prevSecondValue;
                    stack.push(prevValue);
                    stack.push(newCurrValue);
                }
                if ("C".equals(opr)) {
                    stack.pop();
                }
                if ("D".equals(opr)) {
                    Integer prevValue = stack.pop();
                    Integer newCurrValue = prevValue * 2;
                    stack.push(prevValue);
                    stack.push(newCurrValue);
                }
            }
        }
        Integer result = 0;
        for (Integer i : stack) {
            result = result + i;
        }
        return result;
    }
}
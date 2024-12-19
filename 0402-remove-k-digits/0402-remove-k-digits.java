class Solution {     
    public String removeKdigits(String num, int k) {         
        Stack<Character> stk = new Stack<>(); // Stack to store digits of the resulting number

        // Iterate through each digit in the input number
        for (int i = 0; i < num.length(); i++) {             
            // Remove digits from the stack while the current digit is smaller than the top of the stack,
            // and k > 0 (to reduce the size by k digits)
            // Example: num = "1432219", k = 3
            // Stack changes: [1] -> [1, 4] -> [1, 3] (4 removed) -> [1, 3, 2] (3 removed) -> [1, 2, 2]
            while (!stk.isEmpty() && k > 0 && stk.peek() > num.charAt(i)) {                 
                stk.pop();                 
                k--;             
            }             
            // Push the current digit onto the stack
            stk.push(num.charAt(i));         
        }         

        // If there are still remaining digits to remove, pop them from the stack
        // Example: num = "123456", k = 2
        // After the loop, stack = [1, 2, 3, 4, 5, 6], remaining k = 2
        // Remove the top k digits -> stack = [1, 2, 3, 4]
        while (k > 0) {             
            stk.pop();             
            k--;         
        }         

        // If the stack is empty after processing, return "0"
        // Example: num = "10", k = 2 -> All digits are removed, return "0"
        if (stk.isEmpty()) {             
            return "0";         
        }         

        StringBuilder sb = new StringBuilder(); // To store the resulting number

        // Build the result from the stack (digits are in reverse order)
        // Example: num = "10200", k = 1
        // Stack after processing: [1, 0, 2, 0, 0]
        // Result built in reverse order: "00201"
        while (!stk.isEmpty()) {             
            sb.append(stk.peek());             
            stk.pop();         
        }                  

        // Remove leading zeros in the resulting number
        // Example: num = "0002323", k = 3
        // Result before removing zeros: "323000"
        // Result after removing zeros: "323"
        while (sb.length() != 0 && sb.charAt(sb.length() - 1) == '0') {             
            sb.deleteCharAt(sb.length() - 1);         
        }          

        // Reverse the StringBuilder to get the correct order of digits
        // Example: num = "1432219", k = 3
        // Reversed result after processing: "1219"
        sb.reverse();         

        // If the resulting number is empty after removing zeros, return "0"
        // Example: num = "0000", k = 2 -> After processing, result = "", so return "0"
        if (sb.length() == 0) {             
            return "0";         
        }         

        // Return the resulting number as a string
        return sb.toString();      
    } 
}

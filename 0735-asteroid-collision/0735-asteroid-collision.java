class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk = new Stack<>();
        
        for (int asteroid : asteroids) {
            if (asteroid > 0) {
                // Positive asteroids are pushed directly onto the stack.
                stk.push(asteroid);
            } else {
                // Process the collision for negative asteroids.
                while (!stk.isEmpty() && stk.peek() > 0 && stk.peek() < Math.abs(asteroid)) {
                    // Remove smaller positive asteroid.
                    stk.pop();
                }
                if (!stk.isEmpty() && stk.peek() == Math.abs(asteroid)) {
                    // Both asteroids are equal; destroy both.
                    stk.pop();
                } else if (stk.isEmpty() || stk.peek() < 0) {
                    // No collision or only negative asteroids on the stack.
                    stk.push(asteroid);
                }
            }
        }
        
        // Create the result array in the correct order.
        int[] res = new int[stk.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = stk.pop();
        }
        
        return res;
    }
}

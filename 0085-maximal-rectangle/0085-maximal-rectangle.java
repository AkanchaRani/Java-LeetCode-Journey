import java.util.*;

class Solution {

    public int largestRectangleArea(int[] heights) {

        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {

            while (!stack.isEmpty() &&
                   heights[stack.peek()] > heights[i]) {

                int height = heights[stack.pop()];

                int width;

                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }

                int area = height * width;
                maxArea = Math.max(maxArea, area);
            }

            stack.push(i);
        }

        // Process remaining bars
        while (!stack.isEmpty()) {

            int height = heights[stack.pop()];

            int width;

            if (stack.isEmpty()) {
                width = heights.length;
            } else {
                width = heights.length - stack.peek() - 1;
            }

            int area = height * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public int maximalRectangle(char[][] matrix) {

        if (matrix.length == 0) {
            return 0;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] heights = new int[cols];

        int maxArea = 0;

        for (int i = 0; i < rows; i++) {

            // Build histogram for current row
            for (int j = 0; j < cols; j++) {

                if (matrix[i][j] == '1') {
                    heights[j]++;
                } else {
                    heights[j] = 0;
                }
            }

            // Apply Largest Rectangle in Histogram
            maxArea = Math.max(
                maxArea,
                largestRectangleArea(heights)
            );
        }

        return maxArea;
    }
}
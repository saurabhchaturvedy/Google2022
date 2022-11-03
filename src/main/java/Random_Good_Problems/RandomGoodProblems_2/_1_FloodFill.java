package main.java.Random_Good_Problems.RandomGoodProblems_2;

class _1_FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if (color != newColor) {
            dfs(image, sr, sc, color, newColor);
        }
        return image;
    }

    public void dfs(int[][] image, int sr, int sc, int color, int newColor) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != color) {
            return;
        }
        image[sr][sc] = newColor;
        dfs(image, sr + 1, sc, color, newColor);
        dfs(image, sr - 1, sc, color, newColor);
        dfs(image, sr, sc + 1, color, newColor);
        dfs(image, sr, sc - 1, color, newColor);
    }

    public static void main(String[] args) {

        int[][] arr = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        _1_FloodFill floodFill = new _1_FloodFill();
        floodFill.floodFill(arr, 1, 1, 2);
    }
}
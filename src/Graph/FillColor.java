package Graph;
//can be referred  as  matrix recursive problem
//leetcode 733
/*
You are given an image represented by an m x n grid of integers image, where image[i][j] represents the pixel value of the image. You are also given three integers sr, sc, and color. Your task is to perform a flood fill on the image starting from the pixel image[sr][sc].

To perform a flood fill:

Begin with the starting pixel and change its color to color.
Perform the same process for each pixel that is directly adjacent (pixels that share a side with the original pixel, either horizontally or vertically) and shares the same color as the starting pixel.
Keep repeating this process by checking neighboring pixels of the updated pixels and modifying their color if it matches the original color of the starting pixel.
The process stops when there are no more adjacent pixels of the original color to update.
Return the modified image after performing the flood fill.
 */

public class FillColor {
    public static void main(String[] args) {
        int[][] image={{1,1,1},{1,1,0},{1,0,1}};

        int sr=1,sc=1, color=2;
        int row=image.length,col=image[0].length;
        System.out.println("before coloring: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(image[i][j]+" ");
            }
            System.out.println();
        }
        int originalColor=image[sr][sc];
        color(image,sr,sc,color,originalColor);
        System.out.println("After coloring: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(image[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void color(int[][] image, int sr, int sc, int color,int originalColor){
        if(sr<0 || sr==image.length || sc<0 || sc==image[0].length || image[sr][sc]==color || image[sr][sc]!=originalColor) return;
        image[sr][sc]=color;
        //up
        color(image,sr-1,sc,color,originalColor);
        //down
        color(image,sr+1,sc,color,originalColor);
        //left
        color(image,sr,sc-1,color,originalColor);
        //right
        color(image,sr,sc+1,color,originalColor);
    }
}

//the game of life
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class GameOfLifeAssignment {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[][] lifegrid = randomizeGrid();
        
        while (true) {
            displayGrid(lifegrid);
            input.nextLine();
            lifegrid = updateGrid(lifegrid);
        }
    }

//all this needs to do is count how many neighbors a spot has
public static int countNeighbors(boolean[][] griddy, int coord1, int coord2) {  int neighbors = 0;

    for (int row = Math.max(0, coord1 - 1); row <= Math.min(griddy.length - 1, coord1 + 1); row++) { //using math.max/min to not go out of bounds i wish i'd thought of that sooner
        for (int column = Math.max(0, coord2 - 1);
             column <= Math.min(griddy[row].length - 1, coord2 + 1); column++) {
            if ((row != coord1 || column != coord2) && griddy[row][column]) {
                neighbors++;
            }

        }
    }

    return neighbors;
}
//display the grid
public static void displayGrid(boolean[][] grid) {
    for (boolean[] row : grid) {
        for (boolean entry : row) {
            
            if (entry == true) { System.out.print("*"); } else {System.out.print(" "); };
        }
        System.out.println(); // Move to the next line after printing each row
    }
}
//create the grid
public static boolean[][] randomizeGrid() {
    boolean[][] gridlife = new boolean[22][80];
    
    for (int i = 0; i < gridlife.length; i++) {
        for (int j = 0; j < gridlife[i].length; j++) {
            gridlife[i][j] = Math.random() < 0.5; //50% chance of being alive
        }
    }
    return gridlife;
}
//update the grid
public static boolean[][] updateGrid(boolean[][] grid) {
    boolean[][] newGrid = new boolean[grid.length][grid[0].length];
    for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[i].length; j++) {
            int neighbors = countNeighbors(grid, i, j);
            if (grid[i][j]) {
                newGrid[i][j] = neighbors == 2 || neighbors == 3;
            } else {
                newGrid[i][j] = neighbors == 3;
            }
        }
    }
    return newGrid;
}
}
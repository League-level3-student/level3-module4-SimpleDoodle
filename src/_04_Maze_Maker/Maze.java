package _04_Maze_Maker;
import java.awt.Graphics;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Maze {
    // 1. Create a 2D array of cells. Don't initialize it.
    Cell[] cellarray;
    private int rows;
    private int cols;

    public Maze(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;

        // 2. Initialize the cells array using the rows and cols variables
        cellarray = new Cell[rows*cols];
        // 3. Iterate through each cell and initialize it
        //    using row and col as the cell location
        System.out.println(cellarray.length);
        for (int i = 0; i < cellarray.length; i++) {
	cellarray = new Cell[] {new Cell(i, i)};
}
System.out.println(cellarray.length);
    }

    // 4. This method iterates through the cells and draws them
    public void draw(Graphics g) {
        Cell mooncell;
 for (int i = 0; i < cellarray.length; i++) {
	    mooncell = new Cell(cellarray[i].getRow(), cellarray[i].getCol());
	    mooncell.draw(g);
}
    }

    // 5. This method returns the selected cell
    public Cell getCell(int row, int col){
        return  new Cell(cellarray[row].getRow(), cellarray[col].getCol());
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }
}

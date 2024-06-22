/*
Name: Lê Nguyễn Thành Long - ITDSIU21097
Purpose: Represents a cell in a grid-based game board, managing its position, occupancy status, and graphical representation.
*/
package general.logic;

public class Cell {
    protected int row;
    protected int column;
    protected Map map;
    protected GraphicCell gc;
    protected boolean free;

    public Cell(int row, int column, Map map) {
        this.row = row;
        this.column = column;
        this.map = map;
        this.free = true;
    }

    public GraphicCell getGraphicCell() {
        return gc;
    }

    public void put(GraphicCell gc) {
        free = false;
        this.gc = gc;
        map.changeCell(this);
    }

    public void clear() {
        free = true;
        this.gc = map.getFreeCell();
        map.changeCell(this);
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public boolean isFree() {
        return free;
    }
}

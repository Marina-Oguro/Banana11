package Minipro;

 

public class Line {
    
private Cell[] cells;
    
    public Line(Cell cell1, Cell cell2, Cell cell3) {
        this.cells = new Cell[] {cell1, cell2,cell3};
    }
    
    public boolean isConsective() {
        Mark playerMark = cells[0].getMark();
        Mark otherMark1 = cells[1].getMark();
        Mark otherMark2 = cells[2].getMark();
        boolean ret = true;
        if (playerMark == Mark.NONE) {
            ret = false;
        } else {
            if (playerMark == otherMark1 && playerMark == otherMark2) {
                ret = true;
            } else {
                ret = false;
            }
            }
        return ret;
        }
}
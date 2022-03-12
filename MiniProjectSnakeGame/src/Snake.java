import java.util.LinkedList;

public class Snake {
    private LinkedList<Cell> lst=new LinkedList<>();
    private Cell head;

    public LinkedList<Cell> getLst() {
        return lst;
    }

    public void setLst(LinkedList<Cell> lst) {
        this.lst = lst;
    }

    public Cell getHead() {
        return head;
    }

    public void setHead(Cell head) {
        this.head = head;
    }

    //constructor
    public Snake(Cell initialPosition){
        head = initialPosition;
        lst.add(head);
        head.setCellType(CellType.SNAKE_NODE);
    }

    public void grow(){
        lst.add(head);
    }

    public void move(Cell c){
        System.out.println("snake is Moving to :"+c.getRow()+" "+c.getCol());
        Cell tail=lst.removeLast();
        tail.setCellType(CellType.EMPTY);

        head =c;
        head.setCellType(CellType.SNAKE_NODE);
        lst.addFirst(head);
    }

    public boolean checkCrash(Cell nextCell){
        System.out.println("Going to check for crash");
        for( Cell c:lst){
            if(c==nextCell){
                return true;
            }
        }
        return false;
    }


}

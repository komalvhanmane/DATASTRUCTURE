import java.util.LinkedList;

public class Room {
    private int roomNo;
    private int limit;
    LinkedList<Student> s;

    public Room(int roomNo, int limit) {
        this.roomNo = roomNo;
        this.limit = limit;
        s=new LinkedList<>();
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}

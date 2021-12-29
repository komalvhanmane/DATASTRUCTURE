import java.util.LinkedList;

public class Floor {
    private int floorNo;
    private int RoomCount;
    LinkedList<Room> r;

    public Floor(int floorNo, int roomCount) {
        this.floorNo = floorNo;
        RoomCount = roomCount;
        r=new LinkedList<>();
    }

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    public int getRoomCount() {
        return RoomCount;
    }

    public void setRoomCount(int roomCount) {
        RoomCount = roomCount;
    }
}

import java.util.LinkedList;

public class Building {
    private int buildingNo;
    private int TotalFloor;
    LinkedList<Floor> f;
    public Building(int buildingNo, int totalFloor) {
        this.buildingNo = buildingNo;
        TotalFloor = totalFloor;
        f=new LinkedList<>();
    }

    public int getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(int buildingNo) {
        this.buildingNo = buildingNo;
    }

    public int getTotalFloor() {
        return TotalFloor;
    }

    public void setTotalFloor(int totalFloor) {
        TotalFloor = totalFloor;
    }
}

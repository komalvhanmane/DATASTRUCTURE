public class Account {
    private int accId;
    private String accName;
    private double accBal;
    Account link;

    public Account(int accId, String accName, double accBal) {
        this.accId = accId;
        this.accName = accName;
        this.accBal = accBal;
        link=null;
    }

    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public double getAccBal() {
        return accBal;
    }

    public void setAccBal(double accBal) {
        this.accBal = accBal;
    }
}

public class Account {
    private int acc_no;
    private String cust_name;
    private double acc_bal;

    public Account(int acc_no, String cust_name, double acc_bal) {
        this.acc_no = acc_no;
        this.cust_name = cust_name;
        this.acc_bal = acc_bal;
    }

    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public double getAcc_bal() {
        return acc_bal;
    }

    public void setAcc_bal(double acc_bal) {
        this.acc_bal = acc_bal;
    }
}

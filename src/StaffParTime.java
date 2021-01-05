public class StaffParTime extends Staff {
    private double wortTime;

    public StaffParTime(String iD, String name, int yearOld, String phone, String email, double wortTime) {
        super(iD, name, yearOld, phone, email);
        this.wortTime = wortTime;
    }



    public double getSalary(){
         return wortTime*100;
    }

    @Override
    public String toString() {
        return super.toString()+wortTime;
    }
}

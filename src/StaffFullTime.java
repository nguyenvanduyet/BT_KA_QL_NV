public class StaffFullTime extends Staff implements Comparable{
    private int reward;
    private int punish;
    private int salary;

    public StaffFullTime(String iD, String name, int yearOld, String phone, String email, int reward, int punish, int salary) {
        super(iD, name, yearOld, phone, email);
        this.reward = reward;
        this.punish = punish;
        this.salary = salary;
    }


    public int testRealField(){
      return salary+reward-punish;
    }

    @Override
    public String toString() {
        return super.toString()+reward+","+punish+","+salary;
    }

    @Override
    public int compareTo(Object o) {
        StaffFullTime staffFullTime = (StaffFullTime) o;
        if(this.testRealField()>staffFullTime.testRealField()){
            return 1;
        } else if(this.testRealField()<staffFullTime.testRealField()){
            return -1;
        } else return 0;
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManageStaff {
    ArrayList<Staff> staffArrayList =new ArrayList();
    public void addStaff(Staff staff){
        staffArrayList.add(staff);
    }
    public void showAll() {
        for (Staff s: staffArrayList) {
            if(s instanceof StaffFullTime){
                StaffFullTime staffFullTime = (StaffFullTime) s;
                System.out.println(staffFullTime);
            }
            if( s instanceof StaffParTime){
                StaffParTime staffParTime = (StaffParTime) s;
                System.out.println(staffParTime);
            }
        }
    }
    public int avgSalary(){
        int count=0;
        int totalLuongNVFT = 0;
        int avgSalary = 0;
        for (int i = 0; i < staffArrayList.size(); i++) {
            Staff staff = staffArrayList.get(i);
            if (staff instanceof StaffFullTime){
                StaffFullTime staffFullTime = (StaffFullTime) staff;
               totalLuongNVFT +=  staffFullTime.testRealField();
               count++;
            }
        }
        avgSalary = totalLuongNVFT/count;
        return avgSalary;
    }
    public void showStaffHaveSalaryLessAvg(){
        int avgSalary = avgSalary();
        for (Staff s: staffArrayList) {
            if( s instanceof StaffFullTime){
                StaffFullTime staffFullTime = (StaffFullTime) s;
                if(staffFullTime.testRealField()<avgSalary){
                    System.out.println(staffFullTime);
                }
            }
        }
    }
    public void totalSalaryPartTime(){
        int sum = 0;
        for (Staff s: staffArrayList) {
            if(s instanceof StaffParTime){
                StaffParTime staffParTime = (StaffParTime) s;
                sum += staffParTime.getSalary();
            }
        }
        System.out.println("Tổng lương của nhân viên parttime là"+sum);
    }
    public void sortSalaryOfStaffFullTime(){
        List<StaffFullTime> list = getListOfStaffFullTime();
        Collections.sort(list);
        showAll();
    }
    public List<StaffFullTime> getListOfStaffFullTime(){
        List<StaffFullTime> staffFullTimeList = new ArrayList<>();
        for (Staff s : staffArrayList) {
            if(s instanceof  StaffFullTime) {
                StaffFullTime staffFullTime = (StaffFullTime) s;
                staffFullTimeList.add(staffFullTime);
            }
        }
        return staffFullTimeList;
    }
}

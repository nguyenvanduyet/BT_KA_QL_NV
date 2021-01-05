import java.util.Scanner;

public class TestMain {
    static Scanner sc = new Scanner(System.in);
    static ManageStaff manageStaff = new ManageStaff();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1.add");
            System.out.println("2.Show all");
            System.out.println("3.hiển thị lương nhân viên full time lớn hơn lương trung bình");
            System.out.println("4.hiển thị tổng lương trả cho nhân viên part time");
            System.out.println("5. Hiển thị danh sách lương nhân viên full time đã được sắp xếp");
            System.out.println("0. exit");
            System.out.println("Mời nhập choice");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập số nhân viên muốn thêm");
                    int amount = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < amount; i++) {
                        addNew();
                    }
                    break;
                case 2:
                    manageStaff.showAll();
                    break;
                case 3:
                    manageStaff.showStaffHaveSalaryLessAvg();
                    break;
                case 4:
                    manageStaff.totalSalaryPartTime();
                    break;
                case 5:
                    manageStaff.sortSalaryOfStaffFullTime();
                    break;
                case 0:
                    System.out.println("thoát chương trình");
                    System.exit(0);
                    break;
            }
        } while (choice != 0);
    }
    public static void addNew(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Nhập tên");
        String name = sc1.nextLine();
        System.out.println("Nhập id");
        String id  = sc.nextLine();
        System.out.println("Nhập tuổi");
        int age = Integer.parseInt(sc1.nextLine());
        System.out.println("Nhập số điện thoại");
        String phone = sc.nextLine();
        System.out.println("Nhập email");
        String email = sc1.nextLine();
        System.out.println("Nhập kiểu nhân viên");
        String kindOfStaff = sc.nextLine();
        if (kindOfStaff.equalsIgnoreCase("StaffFullTime")){
            System.out.println("Nhập luong thưởng");
            int bonus = Integer.parseInt(sc1.nextLine());
            System.out.println("Nhập tiền pạt");
            int punish = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập lương cứng");
            int fixSalary = Integer.parseInt(sc1.nextLine());
            Staff  staffFullTime = new StaffFullTime(id, name,age,phone,email,bonus,punish,fixSalary);
            manageStaff.addStaff(staffFullTime);
        }
        if(kindOfStaff.equalsIgnoreCase("StaffpartTime")){
            System.out.println("Số giờ làm");
            double workTime =Double.parseDouble(sc.nextLine());
            StaffParTime staffParTime = new StaffParTime(id, name,age,phone,email,workTime);
            manageStaff.addStaff(staffParTime);
        }
        System.out.println("_______________________________________________________________");
    }
}

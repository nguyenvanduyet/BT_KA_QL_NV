public class Staff {
    private String iD;
    private String name;
    private int yearOld;
    private String phone;
    private String email;

    public Staff(String iD, String name, int yearOld, String phone, String email) {
        this.iD = iD;
        this.name = name;
        this.yearOld = yearOld;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "iD='" + iD + '\'' +
                ", name='" + name + '\'' +
                ", yearOld=" + yearOld +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

package iuh.fit;

public class Employee {
    private String chucvu;

    public Employee(String chucvu) {
        this.chucvu = chucvu;
    }

    public void handleRequest() {
        if (chucvu.equals("Đội trưởng")) {
            System.out.println("Đội trưởng: Đi tuần và gán việc cho nhân viên.");
        } else if (chucvu.equals("Giám đốc")) {
            System.out.println("Giám đốc: Xem xét kế hoạch và đưa ra quyết định.");
        } else if (chucvu.equals("Nhân viên VP")) {
            System.out.println("Nhân viên VP: Pha chế và kiểm tra công việc văn phòng.");
        } else if (chucvu.equals("Nhân viên Xưởng")) {
            System.out.println("Nhân viên Xưởng: Làm việc tại xưởng và vận hành máy móc.");
        } else if (chucvu.equals("Kế toán trưởng")) {
            System.out.println("Kế toán trưởng: Quản lý tài chính và lập báo cáo.");
        } else {
            System.out.println("Chức vụ không hợp lệ.");
        }
    }
}

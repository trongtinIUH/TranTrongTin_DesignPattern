package iuh.fit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập chức vụ
        System.out.println("Nhập chức vụ nhân viên (Đội Trưởng, Giám Đốc, Nhân viên VP, Nhân viên Xưởng, Kế Toán Trưởng): ");
        String role = scanner.nextLine();

        TaskStrategy strategy;

        // Khởi tạo chiến lược công việc cho nhân viên theo chức vụ
        switch (role) {
            case "Đội Trưởng":
                strategy = new TeamLeaderTaskStrategy();
                break;
            case "Giám Đốc":
                strategy = new ManagerTaskStrategy();
                break;
            case "Nhân viên VP":
                strategy = new VpEmployeeTaskStrategy();
                break;
            case "Nhân viên Xưởng":
                strategy = new FactoryWorkerTaskStrategy();
                break;
            case "Kế Toán Trưởng":
                strategy = new AccountantTaskStrategy();
                break;
            default:
                System.out.println("Chức vụ không hợp lệ!");
                return;
        }

        // Tạo đối tượng EmployeeContext với chiến lược tương ứng
        EmployeeContext employee = new EmployeeContext(strategy);

        // In ra công việc của nhân viên
        employee.performTasks();

        // Yêu cầu người dùng thay đổi chiến lược công việc cho nhân viên
        System.out.println("Chọn nhiệm vụ bổ sung (Nhân viên Xưởng, Giám Đốc): ");
        String task = scanner.nextLine();

        if (task.equals("Giám Đốc")) {
            employee.setTaskStrategy(new ManagerTaskStrategy());  // Chuyển sang chiến lược của Giám Đốc
        }

        // In ra công việc của nhân viên sau khi thay đổi chiến lược
        employee.performTasks();
    }



}
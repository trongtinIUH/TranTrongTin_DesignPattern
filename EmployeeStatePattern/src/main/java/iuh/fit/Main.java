package iuh.fit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập chức vụ
        System.out.println("Nhập chức vụ nhân viên (Đội Trưởng, Giám Đốc, Nhân viên VP, Nhân viên Xưởng, Kế Toán Trưởng): ");
        String role = scanner.nextLine();

        EmployeeState state;

        switch (role) {
            case "Đội Trưởng":
                state = new TeamLeaderState();
                break;
            case "Giám Đốc":
                state = new ManagerState();
                break;
            case "Nhân viên VP":
                state = new VpEmployeeState();
                break;
            case "Nhân viên Xưởng":
                state = new FactoryWorkerState();
                break;
            case "Kế Toán Trưởng":
                state = new AccountantState();
                break;
            default:
                System.out.println("Chức vụ không hợp lệ!");
                return;
        }

        // Tạo đối tượng EmployeeContext với trạng thái tương ứng
        EmployeeContext employee = new EmployeeContext(state);

        // In ra công việc của nhân viên theo chức vụ
        employee.performTasks();
    }


}
package iuh.fit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập chức vụ
        System.out.println("Nhập chức vụ nhân viên (Đội Trưởng, Giám Đốc, Nhân viên VP, Nhân viên Xưởng, Kế Toán Trưởng): ");
        String role = scanner.nextLine();

        EmployeeState state;

        // Khởi tạo trạng thái ban đầu cho nhân viên theo chức vụ
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
        EmployeeState employee = state;

        // Yêu cầu người dùng lựa chọn các nhiệm vụ bổ sung cho nhân viên
        System.out.println("Chọn các nhiệm vụ bổ sung cho nhân viên (Đào tạo, Chuyên gia, Đánh giá): ");
        String tasks = scanner.nextLine();

        // Trang trí nhân viên theo nhiệm vụ lựa chọn
        if (tasks.contains("Đào tạo")) {
            employee = new TrainingDecorator(employee);
        }
        if (tasks.contains("Chuyên gia")) {
            employee = new ExpertDecorator(employee);
        }
        if (tasks.contains("Đánh giá")) {
            employee = new EvaluationDecorator(employee);
        }

        // In ra công việc của nhân viên sau khi trang trí
        employee.performTasks();
    }
    }

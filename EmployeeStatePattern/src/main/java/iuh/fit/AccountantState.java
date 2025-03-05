package iuh.fit;

public class AccountantState implements EmployeeState {
    @Override
    public void performTasks(EmployeeContext context) {
        System.out.println("Nhân viên kế toán: Kiểm tra báo cáo, tính lương.");
    }
}

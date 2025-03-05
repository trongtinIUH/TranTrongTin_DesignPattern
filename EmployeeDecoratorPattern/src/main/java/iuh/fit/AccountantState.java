package iuh.fit;

public class AccountantState implements  EmployeeState{
    @Override
    public void performTasks() {
        System.out.println("Kế Toán Trưởng: Kiểm tra sổ sách, Lập báo cáo tài chính.");
    }
}

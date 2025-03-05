package iuh.fit;

public class VpEmployeeState implements EmployeeState {
    @Override
    public void performTasks() {
        System.out.println("Nhân viên VP: Pha và phê các báo cáo.");
    }
}

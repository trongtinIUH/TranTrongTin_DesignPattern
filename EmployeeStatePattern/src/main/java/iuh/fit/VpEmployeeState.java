package iuh.fit;

public class VpEmployeeState implements EmployeeState {
    @Override
    public void performTasks(EmployeeContext context) {
        System.out.println("Nhân viên VP: Pha và phê các báo cáo.");
    }
}

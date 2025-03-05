package iuh.fit;

public class ManagerState  implements EmployeeState {
    @Override
    public void performTasks(EmployeeContext context) {
        System.out.println("Giám Đốc: Lập kế hoạch, Đưa ra chiến lược cho công ty.");
    }
}

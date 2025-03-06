package iuh.fit;

public class VpEmployeeTaskStrategy implements TaskStrategy {
    @Override
    public void performTasks() {
        System.out.println("Nhân viên VP: Pha và phê các báo cáo.");
    }
}

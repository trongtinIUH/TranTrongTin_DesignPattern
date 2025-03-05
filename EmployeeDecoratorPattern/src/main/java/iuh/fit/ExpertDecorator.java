package iuh.fit;

public class ExpertDecorator extends EmployeeDecorator {
    public ExpertDecorator(EmployeeState employeeState) {
        super(employeeState);
    }

    @Override
    public void performTasks() {
        super.performTasks();  // Gọi nhiệm vụ chính của nhân viên
        System.out.println("Chuyên gia tư vấn về công việc.");
    }
}

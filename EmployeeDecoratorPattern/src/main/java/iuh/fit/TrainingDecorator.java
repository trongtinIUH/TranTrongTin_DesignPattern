package iuh.fit;

public class TrainingDecorator  extends EmployeeDecorator {
    public TrainingDecorator(EmployeeState employeeState) {
        super(employeeState);
    }
    public void train() {
        System.out.println("Training...");
    }

    @Override
    public void performTasks() {
        super.performTasks();  // Gọi nhiệm vụ chính của nhân viên
        System.out.println("Đào tạo nhân viên mới.");
    }
}

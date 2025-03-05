package iuh.fit;

public class   EvaluationDecorator extends EmployeeDecorator {
   public EvaluationDecorator(EmployeeState employeeState) {
        super(employeeState);
    }

    @Override
    public void performTasks() {
        super.performTasks();  // Gọi nhiệm vụ chính của nhân viên
        System.out.println("Đánh giá công việc của nhân viên.");
    }
}

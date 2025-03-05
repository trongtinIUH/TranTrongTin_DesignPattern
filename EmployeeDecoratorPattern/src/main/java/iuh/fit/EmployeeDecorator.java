package iuh.fit;

public abstract class EmployeeDecorator implements EmployeeState {
    protected EmployeeState employeeState;

    public EmployeeDecorator(EmployeeState employeeState) {
        this.employeeState = employeeState;
    }

    @Override
    public void performTasks() {
        employeeState.performTasks();  // Gọi nhiệm vụ của nhân viên gốc
    }
}

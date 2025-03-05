package iuh.fit;

public class EmployeeContext {
     private EmployeeState state;


    public EmployeeContext(EmployeeState state) {
        this.state = state;
    }

    public void setState(EmployeeState state) {
        this.state = state;
    }
    public void performTasks() {
        state.performTasks(this); // Gọi phương thức thực hiện công việc theo trạng thái
    }
}

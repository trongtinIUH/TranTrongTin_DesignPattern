package iuh.fit;

public class EmployeeContext {
    private TaskStrategy taskStrategy;

    public EmployeeContext(TaskStrategy taskStrategy) {
        this.taskStrategy = taskStrategy;
    }

    // Đổi chiến lược khi cần thiết
    public void setTaskStrategy(TaskStrategy taskStrategy) {
        this.taskStrategy = taskStrategy;
    }

    // Thực hiện công việc theo chiến lược
    public void performTasks() {
        taskStrategy.performTasks();
    }
}

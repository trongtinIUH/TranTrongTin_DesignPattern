package iuh.fit;

public class TeamLeaderState implements EmployeeState  {
    @Override
    public void performTasks() {
        System.out.println("Đội Trưởng: Đi tuần, Gán việc cho nhân viên.");
    }
}

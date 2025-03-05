package iuh.fit;

public class TeamLeaderState  implements EmployeeState {



    @Override
    public void performTasks(EmployeeContext context) {
        System.out.println("Đội Trưởng: Đi tuần, Gán việc cho nhân viên.");
    }
}

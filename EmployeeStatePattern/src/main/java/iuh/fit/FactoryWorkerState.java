package iuh.fit;

public class FactoryWorkerState  implements EmployeeState {
    @Override
    public void performTasks(EmployeeContext context) {
        System.out.println("Nhân viên Xưởng: Sản xuất sản phẩm, Kiểm tra chất lượng.");
    }
}

package vn.edu.iuh.fit;

public class FixingState extends OrderState {
    @Override
    public void order(OrderContext context) {
        System.out.println("Đơn hàng đang được sửa chữa. Không thể đặt lại.");
    }

    @Override
    public void fix(OrderContext context) {
        System.out.println("Đơn hàng đã được sửa chữa xong.");
        context.setState(new FreeState()); // Quay lại trạng thái Free
    }
}

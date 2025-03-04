package vn.edu.iuh.fit;

public class OrderedState extends OrderState {
    @Override
    public void order(OrderContext context) {
        System.out.println("Đơn hàng đã được đặt. Không thể đặt lại.");
    }

    @Override
    public void fix(OrderContext context) {
        System.out.println("Đơn hàng đang được sửa chữa.");
        context.setState(new FixingState()); // Chuyển sang trạng thái Fixing
    }
}

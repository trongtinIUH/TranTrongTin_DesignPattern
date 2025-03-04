package vn.edu.iuh.fit;

public class FreeState extends OrderState {
    @Override
    public void order(OrderContext context) {
        System.out.println("Đơn hàng đã được đặt.");
        context.setState(new OrderedState()); // Chuyển sang trạng thái Ordered
    }

    @Override
    public void fix(OrderContext context) {
        System.out.println("Không thể sửa chữa khi đơn hàng còn trống.");
    }
}

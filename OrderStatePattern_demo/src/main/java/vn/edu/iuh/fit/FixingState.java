package vn.edu.iuh.fit;

public class FixingState extends OrderState {

    @Override
    public void order(OrderContext context) {
        System.out.println("Đơn hàng đã được đặt hàng");

    }

    @Override
    public void fix(OrderContext context) {
        System.out.println("Đơn hàng đã được sửa");
        context.setState(new OrderedState());
    }
}

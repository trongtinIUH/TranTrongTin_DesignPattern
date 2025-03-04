package vn.edu.iuh.fit;

public class OrderedState extends OrderState {

    @Override
    public void order(OrderContext context) {
        System.out.println("Đơn hàng đã được đặt hàng");
        context.setState(this);
    }

    @Override
    public void fix(OrderContext context) {
        System.out.println("Đơn hàng không thể sửa");
    }
}

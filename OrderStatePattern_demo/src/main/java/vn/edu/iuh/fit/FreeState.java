package vn.edu.iuh.fit;


//Mỗi lớp này sẽ đại diện cho một trạng thái của đơn hàng.
public class FreeState extends OrderState {

    @Override
    public void order(OrderContext context) {
        System.out.println("Đơn hàng đã được đặt hàng");
        context.setState(new OrderedState());
    }

    @Override
    public void fix(OrderContext context) {
        System.out.println("Không thể sửa đơn hàng khi đơn hàng đang ở trạng thái miễn phí");
    }
}

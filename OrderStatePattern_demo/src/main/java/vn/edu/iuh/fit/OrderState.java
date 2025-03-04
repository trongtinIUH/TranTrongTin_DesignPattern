package vn.edu.iuh.fit;

public abstract class OrderState {

    //tạo trrạng thái cho đơn hàng
    public  abstract  void  order (OrderContext context);
    public  abstract  void  fix (OrderContext context);
}

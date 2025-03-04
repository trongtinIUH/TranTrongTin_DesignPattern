package vn.edu.iuh.fit;

//Lớp này sẽ giữ trạng thái hiện tại và cung cấp các phương thức để thay đổi trạng thái.
public class OrderContext {
    private  OrderedState state;

    public OrderContext() {
        this.state = state;
    }

    public void setState(OrderedState state) {
        this.state = state;
    }

    public  void order(){
        state.order(this);
    }
     public  void fix(){
        state.fix(this);
     }
}

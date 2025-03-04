package vn.edu.iuh.fit;

public class OrderContext {
    private OrderState state;

    // Constructor khởi tạo trạng thái mặc định là FreeState
    public OrderContext() {
        this.state = new FreeState(); // Khởi tạo trạng thái mặc định là FreeState
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void order() {
        if (state != null) {
            state.order(this); // Kiểm tra null trước khi gọi phương thức
        } else {
            System.out.println("Lỗi: Trạng thái không hợp lệ.");
        }
    }

    public void fix() {
        if (state != null) {
            state.fix(this); // Kiểm tra null trước khi gọi phương thức
        } else {
            System.out.println("Lỗi: Trạng thái không hợp lệ.");
        }
    }
}

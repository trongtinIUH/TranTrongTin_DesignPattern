package vn.edu.iuh.fit;

public class Main {
    public static void main(String[] args) {

            OrderContext order = new OrderContext();
        System.out.println("Bước 1: Đơn hàng đang ở trạng thái Free.");
        order.order();  // Đặt đơn hàng -> chuyển sang OrderedState

        System.out.println("Bước 2: Đơn hàng đang ở trạng thái Ordered.");
        order.fix();  // Sửa chữa đơn hàng -> chuyển sang FixingState

        System.out.println("Bước 3: Đơn hàng đang ở trạng thái Fixing.");
        order.fix();  // Sửa chữa xong -> quay lại FreeState

        System.out.println("Bước 4: Đơn hàng đã quay lại trạng thái Free.");


    }
}
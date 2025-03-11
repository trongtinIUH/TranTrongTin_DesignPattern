package iuh.fit;

import java.util.ArrayList;
import java.util.List;

public class Table implements Component {
    private List<Component> products = new ArrayList<>();  // Danh sách các sản phẩm trong bàn

    // Thêm sản phẩm vào bàn
    public void addProduct(Component product) {
        products.add(product);
    }

    // Tính tổng giá của các sản phẩm trong bàn
    @Override
    public double getPrice() {
        double total = 0;
        for (Component product : products) {
            total += product.getPrice();
        }
        return total;
    }
}
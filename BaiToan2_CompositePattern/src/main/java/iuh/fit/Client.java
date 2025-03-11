package iuh.fit;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private List<Table> tables = new ArrayList<>();  // Danh sách các bàn trong quán

    // Thêm bàn vào quán
    public void addTable(Table table) {
        tables.add(table);
    }

    // Tính tổng doanh thu của quán
    public double calculateRevenue() {
        double revenue = 0;
        for (Table table : tables) {
            revenue += table.getPrice();  // Cộng tổng giá của các bàn trong quán
        }
        return revenue;
    }
}
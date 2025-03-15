package iuh.fit;

public class Main {
    public static void main(String[] args) {

        XMLData xmlData = new XMLData();
        System.out.println("Dữ liệu XML: "+ xmlData.getXMLData()); // In ra dữ liệu XML
        JSONTarget jsonTarget = new XMLAdapter(xmlData); // Sử dụng Adapter
        System.out.println("sau khi chuyển đổi sang JSON: "+jsonTarget.getData());  // In ra dữ liệu JSON

    }
}
package iuh.fit;

public class XMLAdapter implements  JSONTarget{
    private XMLData xmlData; // Đối tượng XML cần thích ứng

    public XMLAdapter(XMLData xmlData) {
        this.xmlData = xmlData;
    }
    @Override
    public String getData() {
        // Chuyển đổi XML thành JSON (Ví dụ đơn giản)
        String xml = xmlData.getXMLData();
        // Phương thức giả sử chuyển đổi
        return convertXMLToJSON(xml);
    }

    private String convertXMLToJSON(String xml) {
        // Giả sử đây là một quá trình chuyển đổi đơn giản từ XML sang JSON
        return "{\"data\": {\"value\": \"123\"}}";
    }
}

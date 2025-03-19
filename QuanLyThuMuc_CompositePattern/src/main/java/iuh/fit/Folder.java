package iuh.fit;

import java.util.ArrayList;
import java.util.List;

public class Folder  implements  FileSystem{
    private String folderName;
    private List<FileSystem> components = new ArrayList<>();

    public Folder(String folderName) {
        this.folderName = folderName;
    }

    @Override
    public void showDetails() {
        System.out.println("\nFolder name: " + folderName);
        for (FileSystem component : components) {
            component.showDetails();
        }

    }

    //thêm file hoặc folder vào folder
    public void addComponent(FileSystem component) {
        components.add(component);
    }
    //xóa file hoặc folder khỏi folder
    public void removeComponent(FileSystem component) {
        components.remove(component);
    }
}

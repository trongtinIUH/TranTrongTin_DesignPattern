package iuh.fit;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("meo.java");
        File file2 = new File("cho.java");
        File file3 = new File("hihi.java");

        Folder folder1 = new Folder("Folder 1");
        folder1.addComponent(file1);

        Folder folder2 = new Folder("Folder 2");
        folder2.addComponent(file2);
        folder2.addComponent(file3);

        Folder rootFolder = new Folder("root");
        rootFolder.addComponent(folder1);
        rootFolder.addComponent(folder2);

        rootFolder.showDetails();




    }
}
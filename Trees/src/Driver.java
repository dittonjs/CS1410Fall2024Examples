public class Driver {
    public static void main(String[] args) {
        Tree<FileSystemObject> files = new Tree<>();
        File file = new File("program.py", "print(\"Hello, world!\")\n");
        files.insert("home", new Folder("home"));
        files.insert("home/school", new Folder("school"));
        files.insert("home/school/program.py", file);
        files.insert("bin", new Folder("bin"));
        files.insert("bin/python.exe", new File("python.exe", "asdfl;khasd;lkfjas;lkdjf"));
        files.displayTreePaths();
        File obj = (File)files.find("home/school/program2.py");
        System.out.println(obj);

    }
}

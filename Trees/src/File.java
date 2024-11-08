public class File extends FileSystemObject {
    private String contents;
    public File(String name, String contents) {
        super(name);
        this.contents = contents;
    }

    public String getContents() {
        return contents;
    }
}

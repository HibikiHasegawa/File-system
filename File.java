public class File extends Entry {
    int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    public Entry add(Entry ent) {
        return null;
    }

    public int size() {
        return size;
    }

    public void print(String prefix) {
        System.out.println(prefix + "/" + name + " (" + size() + ")");
    }
}

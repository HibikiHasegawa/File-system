public class SymbolicLink extends Entry {
    String path;

    public SymbolicLink(String name, String path) {
        super(name);
        this.path = path;
    }

    public Entry add(Entry ent) {
        return null;
    }

    public int size() {
        return 0;
    }

    public void print(String prefix) {
        System.out.println(prefix + "/" + name + " -> " + path);
    }
}

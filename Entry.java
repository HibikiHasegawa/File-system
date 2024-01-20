public abstract class Entry {
    public static void main(String[] args) {
        Directory dir2 = new Directory("dir");
        File file2 = new File("file2", 200);
        File file3 = new File("file3", 3000);
        SymbolicLink link1 = new SymbolicLink("link1", "/root");
        dir2.add(file2);
        dir2.add(link1);
        dir2.add(file3);
        Directory dir1 = new Directory("root");
        File file1 = new File("file1", 10);
        dir1.add(file1);
        dir1.add(dir2);
        dir1.print();
    }

    String name;

    public Entry(String name) {
        this.name = name;
    }

    public abstract Entry add(Entry ent);

    public abstract int size();

    public abstract void print(String prefix);

    public void print() {
        print("");
    }
}

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    List<Entry> directory;

    public Directory(String name) {
        super(name);
        directory = new ArrayList<Entry>();
    }

    public Entry add(Entry ent) {
        directory.add(ent);
        return this;
    }

    public int size() {
        int size = 0;
        for (Entry ent : directory) {
            size += ent.size();
        }
        return size;
    }

    public void print(String prefix) {
        String newPrefix = prefix + "/" + name;
        System.out.println(newPrefix + " (" + size() +")");
        for (Entry ent : directory) {
            ent.print(newPrefix);
        }
    }
}

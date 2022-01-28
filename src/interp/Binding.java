package interp;

// tuples (var, val) for the envs
public class Binding<V> {
    public String name;
    public V value;

    public Binding(String name, V value) {
        this.name = name;
        this.value = value;
    }
}
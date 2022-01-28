package interp;

import java.util.Optional;

public abstract class Env<V> {
    public abstract boolean isEmpty();
    // last() returns the last binding added to the environment
    public abstract Binding<V> last();
    // previous() returns the previous environment
    public abstract Env<V> previous();
    // creates a new environment whose last binding is id = value
    public abstract Env<V> add(String id, V value);
    // returns the value of id if it exists, hence the use of Optional
    public abstract Optional<V> lookup(String id);
}

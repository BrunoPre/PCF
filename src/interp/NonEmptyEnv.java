package interp;

import java.util.Optional;

public class NonEmptyEnv<V> extends Env<V> {
    private final Binding last;
    private final Env<V> previous;

    public NonEmptyEnv(Binding last, Env<V> previous) {
        this.last = last;
        this.previous = previous;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Binding<V> last() {
        return this.last;
    }

    @Override
    public Env<V> previous() {
        return this.previous;
    }

    @Override
    public Env<V> add(String id, V value) {
        return new NonEmptyEnv(new Binding(id, value), this);
    }

    @Override
    public Optional<V> lookup(String id) {
        if (! last.name.equals(id))
            return previous.lookup(id);
        else
            return Optional.of(this.last().value);
    }
}
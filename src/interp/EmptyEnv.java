package interp;

import java.util.Optional;

public class EmptyEnv<V> extends Env<V> {
    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public Binding last() {
        return null;
    }

    @Override
    public Env<V> previous() {
        return this;
    }

    @Override
    public Env<V> add(String id, V value) {
        return this;
    }

    @Override
    public Optional<V> lookup(String id) {
        return Optional.empty();
    }
}

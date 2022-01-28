package interp;

public final class IntVal extends Value {
    public int value;
    public IntVal(int v) { this.value = value; }

    @Override
    public String toString(){
        return Integer.toString(value);
    }
}

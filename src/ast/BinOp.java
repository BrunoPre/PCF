package ast;

import interp.EmptyEnv;
import interp.Env;
import interp.IntVal;
import interp.Value;

import typer.Type;

public class BinOp extends Term {
    public OP op;
    public Term term1;
    public Term term2;
    public BinOp(OP op, Term term1, Term term2) {
        this.op = op;
        this.term1 = term1;
        this.term2 = term2;
    }

    @Override
    public Value interp(Env<Value> e) {
        IntVal t1 = (IntVal) term1.interp(e);
        IntVal t2 = (IntVal) term2.interp(e);
        return switch (op) {
            case PLUS -> new IntVal(t1.value + t2.value);
            case MINUS -> new IntVal(t1.value - t2.value);
            case TIMES -> new IntVal(t1.value * t2.value);
            case DIVIDE -> new IntVal(t1.value / t2.value);
            default -> throw new IllegalArgumentException("Unexpected operator: " + op);
        };
    }


    @Override
    public Type typer(Env<Type> e) {
        return null;
    }
}

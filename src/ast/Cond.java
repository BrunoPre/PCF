package ast;

import interp.EmptyEnv;
import interp.Env;
import interp.IntVal;
import interp.Value;

import typer.Type;

public class Cond extends Term {
    public Term test;
    public Term branchTrue; // non zero
    public Term branchFalse;

    public Cond(Term test, Term branchTrue, Term branchFalse) {
        this.test = test;
        this.branchTrue = branchTrue;
        this.branchFalse = branchFalse;
    }

    @Override
    public Value interp(Env<Value> e) {
        System.out.println("test = " + ((IntVal) test.interp(e)).value);
        System.out.println("branchTrue = " + ((IntVal) branchTrue.interp(e)).value);
        System.out.println("branchFalse = " + ((IntVal) branchFalse.interp(e)).value);
        return ((IntVal) test.interp(e)).value != 0 ? branchTrue.interp(e) : branchFalse.interp(e);
    }

    @Override
    public Type typer(Env<Type> e) {
        return null;
    }
}

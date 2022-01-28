package ast;

import interp.EmptyEnv;
import interp.Env;
import interp.Value;

import typer.Type;

public class Fun extends Term{ // 'fun' VAR '->' term 'in' term
    public Var arg;        // VAR
    public Term output;    // after '->'
    public Term scope;     // after 'in'

    public Fun(Var arg, Term output, Term scope){
        this.arg = arg;
        this.output = output;
        this.scope = scope;
    }

    @Override
    public Value interp(Env<Value> e) {
        return null;
    }

    @Override
    public Type typer(Env<Type> e) {
        return null;
    }
}

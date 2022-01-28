package ast;

import interp.EmptyEnv;
import interp.Env;
import interp.Value;

import typer.Type;

public class Var extends Term{
    public String name;
    public Term value;

    public Var(String name, Term value){
        this.name = name;
        this.value = value;
    }


    @Override
    public Value interp(Env<Value> e) {
        return value.interp(e);
    }

    @Override
    public Type typer(Env<Type> e) {
        return null;
    }
}

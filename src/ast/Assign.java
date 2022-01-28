package ast;

import interp.EmptyEnv;
import interp.Env;
import interp.Value;

import typer.Type;

public class Assign extends Term{

    @Override
    public Value interp(Env<Value> e) {
        return null;
    }

    @Override
    public Type typer(Env<Type> e) {
        return null;
    }
}

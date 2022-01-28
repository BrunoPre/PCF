package ast;

import interp.Env;
import interp.Value;
import typer.Type;

public abstract class Term extends AST {

    // In the context of an environment `e`, the function returns the value of the term
    public abstract Value interp(Env<Value> e);

    public abstract Type typer(Env<Type> e);

}

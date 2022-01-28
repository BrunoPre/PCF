package ast;

import interp.EmptyEnv;
import interp.Env;
import interp.Value;

import typer.Type;

public class Call extends Term{
    public Term argVal;
    public Fun fun;

    public Call(Term argVal, Fun fun) {
        this.argVal = argVal;
        this.fun = fun;
    }

    @Override
    public Value interp(Env<Value> e) {
        /*
        Var function = e.getVar(varName);
        if (function instanceof Fun f) {
            e.addVar(new Var(f.getArgValue(),argumentValue, null));
            return f.getValue().interp(e);
        }
        throw new NotAFunctionException(function.getName());
        */
        return null;
    }

    @Override
    public Type typer(Env<Type> e) {
        return null;
    }
}

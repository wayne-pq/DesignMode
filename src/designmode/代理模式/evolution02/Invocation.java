package designmode.代理模式.evolution02;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Invocation {
    private Method method;
    private Object[] args;

    public Invocation(Method method, Object[] args) {
        this.method = method;
        this.args = args;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Object[] getArgs() {
        return args;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }

    @Override
    public String toString() {
        return "Invocation{" +
                "method=" + method +
                ", args=" + Arrays.toString(args) +
                '}';
    }
}
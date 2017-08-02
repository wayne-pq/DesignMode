package designmode.代理模式.evolution03;

public interface Interceptor {
    Object intercept(Invocation invocation) throws Throwable;
}
package designmode.代理模式.evolution04;

public interface Interceptor {
    Object intercept(Invocation invocation) throws Throwable;
}
package designmode.代理模式.evolution05;

public interface Interceptor {
    Object intercept(Invocation invocation) throws Throwable;
}
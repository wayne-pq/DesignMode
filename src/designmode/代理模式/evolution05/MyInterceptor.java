package designmode.代理模式.evolution05;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Intercepts(methods = {"method1"})
public class MyInterceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Intercepts annotation = this.getClass().getAnnotation(Intercepts.class);
        if (Objects.nonNull(annotation)) {
            List<String> methods = Arrays.asList(annotation.methods());
            if (methods.contains(invocation.getMethod().getName())) {
                System.out.println(invocation.getMethod().getName() + " ：该方法可以执行");
            } else {
                System.out.println(invocation.getMethod().getName() + " ：该方法不能执行");
            }
        }
        return null;
    }
}

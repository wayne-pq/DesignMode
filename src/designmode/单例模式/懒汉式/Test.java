package designmode.单例模式.懒汉式;


public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Thread thread = new Thread(() -> {
                Singleton instance = Singleton.getInstance();
                System.out.println(instance);
            });
            thread.setDaemon(false);
            thread.start();
        }
    }
}

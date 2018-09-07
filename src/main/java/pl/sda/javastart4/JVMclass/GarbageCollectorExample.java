package pl.sda.javastart4.JVMclass;

public class GarbageCollectorExample {
    public static void main(String[] args) throws InterruptedException {
        while (true){
            new String("123");
            Thread.sleep(1L);
        }
    }
}

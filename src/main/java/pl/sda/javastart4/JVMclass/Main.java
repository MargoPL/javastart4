package pl.sda.javastart4.JVMclass;
//        C:\Users\Mateusz Olewiński\IdeaProjects\Javastart4\src\main\java\pl\sda\javastart4\Main.javar
import java.util.stream.IntStream;

public class Main {

        //Kompilacja programu
        //javac Main.java
        //Uruchomienie
        //java Main

    public static void main(String[] args) {

        System.out.println("Hello world!");
        for (int i = 0; i < 100; i++) {

        }
        IntStream stream = IntStream.builder().add(10).add(10).build();
        int sum = stream.sum();
        System.out.println(sum);


    }
}

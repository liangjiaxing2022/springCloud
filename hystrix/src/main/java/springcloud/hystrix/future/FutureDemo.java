package springcloud.hystrix.future;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class FutureDemo {

    public static void main(String[] args) {
        Random random = new Random();

        ExecutorService executorService =
                Executors.newFixedThreadPool(1);

       Future<String> future = executorService.submit(()->{
           // 如果随机时间大于100，那么触发容错
            int value = random.nextInt(100);

            System.out.println("helloWorld() costs " + value + " ms.");

            Thread.sleep(value);

            return "Hello,World";
        });

        try {
            future.get(10, TimeUnit.MILLISECONDS);
        }catch (Exception e){
            System.out.println("超时保护！");
        }

        executorService.shutdown();

    }

}

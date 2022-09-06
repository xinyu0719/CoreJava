import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class EService {
        static class A {
            public String getMethod(){
                return "A.getMethod";
            }
        }
        static class B{
            public String getMethod(){
                return "B.getMethod";

            }
        }

        public static void runSameTime(){
            ExecutorService service = Executors.newFixedThreadPool(2);

            try{
                Future<String> aFuture = service.submit(() -> new EService.A().getMethod());
                Future<String> bFuture = service.submit(() -> new EService.B().getMethod());
                boolean allDone = false;
                while(!allDone) {
                    if (aFuture.isDone() && bFuture.isDone()) {
                        System.out.println(bFuture.get() + " " + aFuture.get());
                        allDone = true;
                    }
                }
            }catch(InterruptedException e){
                e.printStackTrace();
            }catch(Exception e){
                e.printStackTrace();
            }finally{
                service.shutdown();
            }
        }

        public static void main(String[] args){
            EService res = new EService();
            res.runSameTime();
        }
    }



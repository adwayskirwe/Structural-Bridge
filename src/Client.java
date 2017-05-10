
public class Client {
    public static void main(String[]args){
        os object=new Windows();//Implementer
        ProcessScheduler scheduler=new RoundRobinScheduler(object);
        scheduler.schedule();
        object=new Linux();
        scheduler=new RoundRobinScheduler(object);
        scheduler.schedule();



    }
}

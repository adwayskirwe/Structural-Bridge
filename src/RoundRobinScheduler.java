
public class RoundRobinScheduler implements ProcessScheduler {
    os object;
    public RoundRobinScheduler(os obj){
        object=obj;
    }
    public void schedule(){
        System.out.println("Round robin scheduling algorithm here");
        object.osname();
    }
}

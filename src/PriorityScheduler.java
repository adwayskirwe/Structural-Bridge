
public class PriorityScheduler implements ProcessScheduler {
    os object;
    public PriorityScheduler(os obj){
        object=obj;
    }
    public void schedule(){
        System.out.println("Priority scheduling algorithm here");
        object.osname();
    }

}

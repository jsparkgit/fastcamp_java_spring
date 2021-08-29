package ch03;

public class LeastJob implements Scheduler {
    @Override
    public void getNextcall() {
        System.out.println("get LeastJob call ");
    }

    @Override
    public void sendcalltoAgent() {
        System.out.println("sent to call LeastJbo");

    }
}

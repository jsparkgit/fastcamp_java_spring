package ch03;

public class RounRobin implements Scheduler {

    @Override
    public void getNextcall() {
        System.out.println("get round robin");
    }

    @Override
    public void sendcalltoAgent() {
        System.out.println("Call with RoundRobin");
    }
}

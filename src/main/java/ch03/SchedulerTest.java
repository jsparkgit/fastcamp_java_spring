package ch03;

import java.io.IOException;

public class SchedulerTest {

    public static void main(String[] args) throws IOException {
        System.out.println("Please select the caller agent !");
        System.out.println("R: roundRobin way");
        System.out.println("L: Least Job way");

        int ch = System.in.read();
        Scheduler scheduler = null;

        if (ch == 'R' || ch == 'r') {
            scheduler = new RounRobin();
        } else if (ch == 'L' || ch == 'l') {
            scheduler = new LeastJob();
        } else {
            System.out.println("no supported way");
            return;
        }

        scheduler.getNextcall();
        scheduler.sendcalltoAgent();
    }
}

import java.util.List;

public class FCFSScheduler {

    public void schedule(List<Process> processes) {

        int currentTime = 0;

        double totalWaiting = 0;
        double totalTurnaround = 0;

        System.out.println("\nFCFS Scheduling Results");
        System.out.println("------------------------");

        for (Process p : processes) {

            int waitingTime = currentTime;

            currentTime += p.burstTime;

            int turnaroundTime = currentTime;

            totalWaiting += waitingTime;
            totalTurnaround += turnaroundTime;

            System.out.println(
                    "P" + p.pid +
                    " | Waiting Time = " + waitingTime +
                    " | Turnaround Time = " + turnaroundTime
            );
        }

        double avgWaiting = totalWaiting / processes.size();
double avgTurnaround = totalTurnaround / processes.size();

System.out.printf("\nAverage Waiting Time = %.2f\n", avgWaiting);
System.out.printf("Average Turnaround Time = %.2f\n", avgTurnaround);
    }
}
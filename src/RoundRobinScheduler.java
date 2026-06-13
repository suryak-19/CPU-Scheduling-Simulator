import java.util.*;

public class RoundRobinScheduler {

    public void schedule(List<Process> processes, int quantum) {

        int n = processes.size();

        int[] remainingTime = new int[n];

        for (int i = 0; i < n; i++) {
            remainingTime[i] = processes.get(i).burstTime;
        }

        int currentTime = 0;

        System.out.println("\nRound Robin Execution Order");
        System.out.println("----------------------------");

        boolean done;

        do {

            done = true;

            for (int i = 0; i < n; i++) {

                if (remainingTime[i] > 0) {

                    done = false;

                    System.out.print(
                        "P" + processes.get(i).pid + " "
                    );

                    if (remainingTime[i] > quantum) {

                        currentTime += quantum;

                        remainingTime[i] -= quantum;

                    } else {

                        currentTime += remainingTime[i];

                        remainingTime[i] = 0;
                    }
                }
            }

        } while (!done);

        System.out.println();
    }
}
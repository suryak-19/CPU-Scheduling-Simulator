import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Process> processes = new ArrayList<>();

System.out.print("Enter number of processes: ");

int n = sc.nextInt();

for (int i = 1; i <= n; i++) {

    System.out.println("\nProcess P" + i);

    System.out.print("Arrival Time: ");
    int arrivalTime = sc.nextInt();

    System.out.print("Burst Time: ");
    int burstTime = sc.nextInt();

    System.out.print("Priority: ");
    int priority = sc.nextInt();

    processes.add(
            new Process(
                    i,
                    arrivalTime,
                    burstTime,
                    priority
            )
    );
}
        while (true) {

    System.out.println("\n===== CPU Scheduling Simulator =====");
    System.out.println("1. FCFS");
    System.out.println("2. SJF");
    System.out.println("3. Priority Scheduling");
    System.out.println("4. Round Robin");
    System.out.println("5. Exit");

    System.out.print("Enter choice: ");

    int choice = sc.nextInt();

    switch (choice) {

        case 1:

            FCFSScheduler fcfs = new FCFSScheduler();
            fcfs.schedule(new ArrayList<>(processes));
            break;

        case 2:

            SJFScheduler sjf = new SJFScheduler();
            sjf.schedule(new ArrayList<>(processes));
            break;

        case 3:

            PriorityScheduler priority = new PriorityScheduler();
            priority.schedule(new ArrayList<>(processes));
            break;

        case 4:

            RoundRobinScheduler rr =
            new RoundRobinScheduler();

            rr.schedule(
            new ArrayList<>(processes),
            2
         );

            break;
            case 5:

            System.out.println("Exiting Program...");
            return;

        default:

            System.out.println("Invalid Choice!");
            }
        }
    }
}
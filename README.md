# CPU Scheduling Simulator

## Overview

This project is a Java-based CPU Scheduling Simulator that demonstrates various CPU scheduling algorithms used in Operating Systems.

## Features

* First Come First Serve (FCFS)
* Shortest Job First (SJF)
* Priority Scheduling
* Round Robin Scheduling
* Dynamic Process Input
* Waiting Time Calculation
* Turnaround Time Calculation
* Menu-Driven Interface

## Technologies Used

* Java
* VS Code
* Java Collections Framework

## Project Structure

src/

* Main.java
* Process.java
* FCFSScheduler.java
* SJFScheduler.java
* PriorityScheduler.java
* RoundRobinScheduler.java

## How to Run

1. Open the project in VS Code.
2. Run Main.java.
3. Enter the number of processes.
4. Enter process details.
5. Choose a scheduling algorithm from the menu.

## Algorithms Implemented

### FCFS (First Come First Serve)

Processes are executed in the order they arrive.

### SJF (Shortest Job First)

Processes with the shortest burst time are executed first.

### Priority Scheduling

Processes with higher priority are executed first.

### Round Robin

Each process receives CPU time based on a fixed time quantum.

## Sample Output

The simulator displays:

* Waiting Time
* Turnaround Time
* Average Waiting Time
* Average Turnaround Time

## Author

[Your Name]

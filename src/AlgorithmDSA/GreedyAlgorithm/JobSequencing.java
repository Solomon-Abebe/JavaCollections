package AlgorithmDSA.GreedyAlgorithm;

import java.util.Arrays;

public class JobSequencing {

    static class Job {
        char id;
        int deadline;
        int profit;

        public Job(char id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    // Manual sorting based on profit in descending order
    private static void manualSort(Job[] jobs) {
        for (int i = 0; i < jobs.length - 1; i++) {
            for (int j = 0; j < jobs.length - i - 1; j++) {
                if (jobs[j].profit < jobs[j + 1].profit) {
                    Job temp = jobs[j];
                    jobs[j] = jobs[j + 1];
                    jobs[j + 1] = temp;
                }
            }
        }
    }

    // Manual fill operation
    private static void manualFill(char[] array, char value) {
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
    }

    // Manual stream implementation to find maximum deadline
    private static int maxDeadline(Job[] jobs) {
        int maxDeadline = Integer.MIN_VALUE;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }
        return maxDeadline;
    }

    // Manual filter operation to find job by id
    private static Job findJobById(Job[] jobs, char id) {
        for (Job job : jobs) {
            if (job.id == id) {
                return job;
            }
        }
        return null;
    }

    public static void printJobSequence(Job[] jobs) {
        // Sort jobs based on profit in descending order
        manualSort(jobs);

        int maxDeadline = maxDeadline(jobs);
        char[] result = new char[maxDeadline];
        boolean[] slot = new boolean[maxDeadline];

        manualFill(result, '-');
        Arrays.fill(slot, false);

        // Fill the slots with jobs
        for (Job job : jobs) {
            for (int i = Math.min(maxDeadline - 1, job.deadline - 1); i >= 0; i--) {
                if (!slot[i]) {
                    result[i] = job.id;
                    slot[i] = true;
                    break;
                }
            }
        }

        // Print the job sequence
        System.out.println("Job Sequence:");
        for (char job : result) {
            System.out.print(job + " ");
        }
        System.out.println();

        // Print the total profit
        int totalProfit = 0;
        for (int i = 0; i < maxDeadline; i++) {
            if (result[i] != '-') {
                Job job = findJobById(jobs, result[i]);
                if (job != null) {
                    totalProfit += job.profit;
                }
            }
        }
        System.out.println("Total Profit: " + totalProfit);
    }

    public static void main(String[] args) {
        Job[] jobs = {
                new Job('a', 2, 100),
                new Job('b', 1, 19),
                new Job('c', 2, 27),
                new Job('d', 1, 25),
                new Job('e', 3, 15)
        };

        printJobSequence(jobs);
    }
}

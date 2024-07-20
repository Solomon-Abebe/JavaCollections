package DSA.HashMap;

import java.util.HashMap;

class StudentScores {
    private final HashMap<String, HashMap<String, Integer>> scoresMap;

    public StudentScores() {
        scoresMap = new HashMap<>();
    }

    public void addStudentScore(String studentName, String subject, int score) {
        // If the student is already in the system, get their scores map
        HashMap<String, Integer> studentScores = scoresMap.getOrDefault(studentName, new HashMap<>());
        // Add/update the score for the subject
        studentScores.put(subject, score);
        // Update the scores map for the student
        scoresMap.put(studentName, studentScores);
    }

    public int getStudentScore(String studentName, String subject) {
        // If the student exists and has a score for the subject, return the score
        if (scoresMap.containsKey(studentName)) {
            HashMap<String, Integer> studentScores = scoresMap.get(studentName);
            if (studentScores.containsKey(subject)) {
                return studentScores.get(subject);
            }
        }
        // Return -1 if the student or subject is not found
        return -1;
    }
    public void printStudentScores(){
        System.out.println("\nStudent Scores:\n");
        for (String studentName:scoresMap.keySet()) {
            System.out.println(studentName+ ": "+ scoresMap.get(studentName));

        }
    }

    public static void main(String[] args) {
        StudentScores studentScores = new StudentScores();

        // Add student scores
        studentScores.addStudentScore("Alice", "Math", 90);
        studentScores.addStudentScore("Alice", "Science", 85);
        studentScores.addStudentScore("Bob", "Math", 75);
        studentScores.addStudentScore("Bob", "English", 80);

        studentScores.printStudentScores();

        // Get and print student scores
        System.out.println("Alice's Math score: " + studentScores.getStudentScore("Alice", "Math"));
        // Output: 90
        System.out.println("Bob's Science score: " + studentScores.getStudentScore("Bob", "Science"));
        // Output: -1 (Score not found)
        studentScores.printStudentScores();
      
    }
}

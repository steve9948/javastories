import java.nio.file.*;
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class LogAnalyzer {
    public static void main(String[] args) {
        // Input the file path
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the path to the log file: ");
        String fileName = scanner.nextLine();

        //Also it possible to read the contents of the file from
        // the project structure as a given file
        //String fileName =  "C:\\Users\\Steve\\IdeaProjects\\logAnalyzer\\src\\hyperskill-dataset-119055953.txt"


        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("File not found: " + fileName);
            System.out.println("Current working directory: " + System.getProperty("user.dir"));
            return;
        }

        List<String> logs;
        try {
            logs = Files.readAllLines(file.toPath());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        // Step 1: Count total occurrences of each error, only for valid lines
        Map<String, Long> totalCounts = logs.stream()
                .map(line -> line.split(" "))
                .filter(parts -> parts.length >= 2)
                .map(parts -> parts[1])
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        if (totalCounts.isEmpty()) {
            System.out.println("No valid log entries found.");
            return;
        }

        String backgroundError = totalCounts.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        // Step 2: Filter logs between 15:00 and 15:30, excluding background error
        Map<String, Long> incidentCounts = logs.stream()
                .map(line -> line.split(" "))
                .filter(parts -> parts.length >= 2)
                .filter(parts -> {
                    String time = parts[0];
                    String error = parts[1];
                    return time.compareTo("15:00") >= 0 && time.compareTo("15:30") <= 0
                            && !error.equals(backgroundError);
                })
                .map(parts -> parts[1])
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        if (incidentCounts.isEmpty()) {
            System.out.println("No incident errors found in the 15:00-15:30 window.");
            return;
        }

        String incidentError = incidentCounts.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        System.out.println("Background error: " + backgroundError);
        System.out.println("Incident error: " + incidentError);
    }
}

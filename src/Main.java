import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println(checkCondition("damage"));          // true
        System.out.println(checkCondition("minor damages"));   // true
        System.out.println(checkCondition("heavy damage"));    // true
        System.out.println(checkCondition("no damages"));       // false
        // Task 2
        List<Student> students = loadAndSortStudents("src/Data.csv");

        for (Student student: students) {
            System.out.println(student);
        }

        // Task 4
        Clothing clothing = new Clothing("Pants", "Good ol jeans", 2.50, 42, "Linen");
        System.out.println(clothing);
        System.out.println("Price with tax: " + clothing.getPriceWithTax() + " EUR");

        // Task 5
        Robot robot = new Robot();
        System.out.println(robot.move());

        // Task 6 please referr to the file named TaskSix

        // Task 7
        System.out.println(oneBool(true));
        System.out.println(oneBool(false));

    }

    public static Boolean checkCondition(String input){
        String regex = "\\b(?:damage|minor damages|heavy damage)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        return matcher.find();
    }

    private static List<Student> loadAndSortStudents(String fileName) {
        List<Student> students = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            if (fileScanner.hasNextLine()) {
                fileScanner.nextLine();
            }
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] values = line.split(",");
                if (values.length == 2) {
                    students.add(new Student(Integer.valueOf(values[0]), values[1]));
                }
            }
        } catch (Exception e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        students.sort(Comparator.comparing(Student::getName));

        return students;

    }

    private static String oneBool(Boolean input){
        Random random = new Random();
        if(input){
            return "a";
        }
        else {
            return random.nextBoolean() ? "b" : "c";
        }
    }
}
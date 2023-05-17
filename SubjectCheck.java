import java.util.Scanner;

public class SubjectCheck {
    public static void main(String[] args) {
        String[][] subjects = {
            {"Mathematics", "Physics"},
            {"Chemistry", "Biology"}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a subject name: ");
        String subject = scanner.nextLine();

        boolean isPresent = isSubjectPresent(subjects, subject);

        if (isPresent) {
            System.out.println(subject + " is present.");
        } else {
            System.out.println(subject + " is not present.");
        }
    }

    public static boolean isSubjectPresent(String[][] subjects, String subject) {
        for (String[] subjectGroup : subjects) {
            for (String sub : subjectGroup) {
                if (sub.equalsIgnoreCase(subject)) {
                    return true;
                }
            }
        }
        return false;
    }
}

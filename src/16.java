public class SchoolProject {

    // Class field
    public static int count = 0;

    // Static inner class method
    private static void addData() {
        count++;
        System.out.println("Data has been added.");
    }

    // Static inner class variable declaration
    private static int dataCount = 5;
}

// Main class to test the SchoolProject code
public class SchoolProjectTest {

    public static void main(String[] args) {
        SchoolProject schoolProject = new SchoolProject();
        schoolProject.addData(); // Increment count
        System.out.println("The count is: " + schoolProject.count);
    }
}

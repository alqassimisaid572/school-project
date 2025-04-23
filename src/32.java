public class SchoolProject {
    public static void main(String[] args) {
        // Example of adding a student to the school project database
        Student student = new Student("John Doe", "Math");
        
        if (studentDao.addStudent(student)) {
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Failed to add student.");
        }
    }

    private static void studentDao() {
        // Example of adding a student to the school project database
        StudentDao dao = new StudentDao();
        
        if (dao.addStudent(student)) {
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Failed to add student.");
        }
    }

    private static class Student {
        private String name;
        private String subject;

        public Student(String name, String subject) {
            this.name = name;
            this.subject = subject;
        }

        // Other methods for the student class
    }

    private static class StudentDao {
        private SQLiteDatabase db;

        public StudentDao() {
            try {
                db = SQLiteDatabase.openDatabase("school_project.db", null, SQLiteDatabase.OPEN_READONLY);
            } catch (SQLiteException e) {
                // Handle error
            }
        }

        public void addStudent(Student student) {
            ContentValues values = new ContentValues();
            values.put("name", student.getName());
            values.put("subject", student.getSubject());
            
            db.insertOrThrow("students", null, values);
        }

        private static final String "school_project.db" = "school_project.db";
    }
}

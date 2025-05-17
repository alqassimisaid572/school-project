public class SchoolProjectRepository {
    private List<Student> students;

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public Student getStudentById(long id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        throw new IllegalArgumentException("Student not found");
    }

    public List<Student> getAllStudents() {
        return Collections.unmodifiableList(students);
    }
}

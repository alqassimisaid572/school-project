public class SchoolProjectRepository {
    private List<Student> students;

    public SchoolProjectRepository() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public Student getStudentById(long id) {
        return students.stream()
                      .filter(s -> s.getId().equals(id))
                      .findFirst()
                      .orElse(null);
    }

    public List<Student> getAllStudents() {
        return students;
    }
}

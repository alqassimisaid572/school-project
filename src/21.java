public class SchoolProject {
    private String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SchoolProject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

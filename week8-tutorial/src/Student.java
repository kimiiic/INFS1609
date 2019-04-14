public class Student extends Person {
    private String faculty;

    public Student(String name, String address, String phone, String email, String faculty) {
        super(name, address, phone, email);

        this.faculty = faculty;
    }

    public Student() {

    }

    // TOSTRING
    @Override
    public String toString() {
        return "Student," + getName() + "," + getAddress() + "," + getPhone() + "," + getEmail() + "," + getFaculty();
    }

    // FACULTY
    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
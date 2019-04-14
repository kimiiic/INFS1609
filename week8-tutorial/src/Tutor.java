public class Tutor extends Person {
    private String office;
    private int salary;
    private String dateHired;

    public Tutor() {

    }

    public Tutor(String name, String address, String phone, String email, String office, int salary, String dateHired) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }


    // TOSTRING
    @Override
    public String toString() {
        return "Tutor," + getName() + "," + getAddress() + "," + getPhone() + "," + getEmail() + "," + getOffice() + "," + getSalary() + "," + getDateHired();
    }

    // OFFICE
    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    // SALARY
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // DATEHIRED
    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }
}
package P11_2;

public class Staff extends Employee {

    private String title;
    
    public Staff(String title) {
        this.title = title;
    }

    public Staff(String office, double salary, MyDate dateHired, String title) {
        super(office, salary, dateHired);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff [name = " + getName() + "]";
    }

}

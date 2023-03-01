package P11_2;

public class Faculty extends Employee {

    private double[] officeHours;
    private int rank;


    public Faculty(double[] officeHours, int rank) {
        this.officeHours = officeHours;
        this.rank = rank;
    }


    public double[] getOfficeHours() {
        return officeHours;
    }


    public void setOfficeHours(double[] officeHours) {
        this.officeHours = officeHours;
    }


    public int getRank() {
        return rank;
    }


    public void setRank(int rank) {
        this.rank = rank;
    }


    @Override
    public String toString() {
        return "Faculty [name = " + getName() + "]";
    }
    
    
}

package P11_2;

public class Student extends Person {

    protected final String STATUS;

    public static final String FRESHMAN = "freshman";
    public static final String SOPHOMORE = "sophomore";
    public static final String JUNIOR = "junior";
    public static final String SENIOR = "senior";
    
    public Student(String STATUS) {
        this.STATUS = STATUS;
    }

   
    public Student(String name, String address, String phoneNumber, String emailAddress, String sTATUS) {
        super(name, address, phoneNumber, emailAddress);
        STATUS = sTATUS;
    }


    @Override
    public String toString() {
        return "Student [name = " + getName() + "]";
    }

}

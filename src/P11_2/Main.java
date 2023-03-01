package P11_2;

public class Main {
    
    public static void main(String[] args) {
        
        Person person = new Person();
		person.setName("Ahmed");

		Student student = new Student(Student.SENIOR);
		student.setName("Mohammed");

		Employee employee = new Employee("Saeed", 15000, new MyDate());
		employee.setName("Hamza");

		Faculty faculty = new Faculty(new double[]{9.0, 5.0}, 5);
		faculty.setName("IUG");

		Staff staff = new Staff("IUG", 20000, new MyDate(), "CEO");
		staff.setName("Wael");

		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());

    }


}

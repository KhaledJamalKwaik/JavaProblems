package P11_6;
import java.util.ArrayList;

public class P11_6 {
    
    public static void main(String[] args) {
        
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Loan());
        list.add(new Date());
        list.add("stringTest");
        list.add(new Circle());

        for (Object obj : list)
            System.out.println(obj.toString());
        

    }

}

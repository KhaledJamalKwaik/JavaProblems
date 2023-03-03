package P11_4;
import java.util.ArrayList;

public class ArrListMax {

    public static Integer max(ArrayList<Integer> list) {

        if(list == null || list.size() < 1)
            return null;
        else {
            java.util.Collections.sort(list);
            return list.get(list.size() - 1);
        }
        
    }
    
}
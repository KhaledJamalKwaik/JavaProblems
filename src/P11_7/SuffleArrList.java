package P11_7;

import java.util.ArrayList;
import java.util.Arrays;

public class SuffleArrList {
    
    public static void shuffle(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {

            Integer j = (int) (Math.random() * list.size());
            Integer temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);

        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();
        x.add(5);
        x.add(4);
        x.add(7);
        x.add(9);
        x.add(2);


        shuffle(x);
        System.out.println(x.toString());

    }


}

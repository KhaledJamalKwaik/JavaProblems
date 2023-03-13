package P11_14;

import java.util.ArrayList;
import java.util.Scanner;

public class P11_14 {

    public static void main(String[] args) {
    
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter five integers for list1: ");
        for (int i = 0; i < 5; i++)
            list1.add(sc.nextInt());
        
        System.out.print("Enter five integers for list2: ");
        for (int i = 0; i < 5; i++)
            list2.add(sc.nextInt());

        System.out.print("The combined list is: " + union(list1, list2).toString());
        
    }


    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        ArrayList<Integer> union = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++)
            union.add(list1.get(i));

        for (int i = 0; i < list2.size(); i++)
            union.add(list2.get(i));

        return union;

    }

}
package P11_4;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Integer input;

        System.out.print("Enter a sequence of numbers ending with 0: ");

        do {
            
            input = sc.nextInt();
            list.add(input);

        } while(input != 0);

        System.out.printf("The max number is %d", ArrListMax.max(list));
    }


}

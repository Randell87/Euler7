import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Какое число является 10001-ым простым числом?
        ArrayList<Integer> nums = new ArrayList<>();
        int count = 0;
        for(int i =1; i<150000; i++){
            for(int j=1; j<i; j++){
                if ((i%j)==0){
                    count++;
                }

            }
            if (count == 1) {
                nums.add(i);
                count = 0;}
                else count = 0;

        }
        //for (Integer i : nums) {System.out.println(i);}
        System.out.println(nums.get(10000));

    }
}
